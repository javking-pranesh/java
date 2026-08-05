import java.util.*;
class AdjList{
    int vertices;
    List<List<Integer>> adjList;  
    AdjList(int vertices){
        this.vertices= vertices;
        adjList = new ArrayList<>();
        for(int i=0;i< vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }

    void addEdege(int src, int dest){
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }
    void removeEdege(int src, int dest){
        adjList.get(src).remove(Integer.valueOf(dest));
        adjList.get(dest).remove(Integer.valueOf(src));
    }
    void printGraph(){
        for(int i=0; i<vertices;i++){
            System.out.print(i+" -> ");
            for(Integer n : adjList.get(i)){
                System.out.print(n+ " ");
            }
            System.out.println();
        }
    }

    void bfs(int start){
        boolean visited[] = new boolean[adjList.size()];
        Queue<Integer> q1 = new LinkedList<Integer>();
        visited[start]= true;
        q1.offer(start);
        while(! q1.isEmpty()){
            int vertex = q1.poll();
            System.out.print(vertex+" ");
            for(int n: adjList.get(vertex)){
                if(! visited[n]){
                    visited[n] = true;
                    q1.offer(n);
                }
            }
        }

    }

    void dfs(int node, boolean visited[]){
        System.out.print(node+" ");
        visited[node]= true;
        for(int n: adjList.get(node)){
            if(! visited[n]){
                dfs(n, visited);
            }
        }
    }

    boolean isConnected(){
        boolean visited[] =new boolean[vertices];
        dfs(0, visited);
        for(boolean val: visited){
            if(val == false){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        AdjList graph = new AdjList(7);
        
        graph.addEdege(0, 1);
        graph.addEdege(0, 2);
        graph.addEdege(1, 3);
        graph.addEdege(1, 4);
        graph.addEdege(2, 5);
        graph.addEdege(3, 6);


        graph.printGraph();
        graph.bfs(0);
        System.out.println();
        boolean visited[] = new boolean[7];
        graph.dfs(0, visited);
        System.out.println();
        if(graph.isConnected()){
            System.out.println("Graph is Connected");
        }
        else{
            System.out.println("Graph is not Connected");
        }
        
    }

}

