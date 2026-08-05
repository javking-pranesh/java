class AdjMatrix{
    int vertices;
    int[][] adjMatrix;

    public AdjMatrix(int vertices) {
        this.vertices=vertices;
        adjMatrix = new int[vertices][vertices];
    }
    void addEdge(int src, int dest){
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }
    void removeEdge(int src, int dest){
        adjMatrix[src][dest] = 0;
        adjMatrix[dest][src] = 0;
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        AdjMatrix g1 = new AdjMatrix(4);
        g1.addEdge(0, 1);
        g1.addEdge(1, 2);
        g1.addEdge(2, 3);
        g1.addEdge(1, 3);
        g1.printGraph();
    }
    
}