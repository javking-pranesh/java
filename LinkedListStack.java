
class LinkedListStack{

    Node top;

    void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }

    int pop(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int val=top.data;
        top=top.next;
        return val;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void search(int x){
        Node temp=top;
        int count=1;
        while(temp!=null){
            if(temp.data == x){
                System.out.println("Element Found at "+ count+" Position");
                
                return;
            }
            temp=temp.next;
            count++;
        }
        System.out.println("Element Not Found!");
    }

    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedListStack list=new LinkedListStack();
        list.push(10);
        list.push(20);
        list.push(25);
        list.push(40);
        list.display();
        list.search(20);
        System.out.println(list.pop()+ " Popped Successfully!");
        list.display();
        System.out.println(list.pop()+ " Popped Successfully!");
        list.display();
        System.out.println(list.peek()+ " Peeked Successfully!");
        list.display();

        
    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
    
}