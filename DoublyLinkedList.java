class Node{
    Node prev;
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }
    
}

class DoublyLinkedList{
    Node head;

    void insert(int data){
            Node node=new Node(data);
            if(head == null){
                head=node;
                return;
            }

            Node temp=head;
            while(temp.next !=null){
                Node prev=temp;
                temp=temp.next;
                temp.prev=prev;
            }
            temp.next=node;
            node.prev=temp;
        }
        void insertAtStart(int data){
            Node node=new Node(data);

            node.next=head;
            head.prev=node;
            head=node;
        }
        void insertAt(int index,int data){

            if(index<0 || index>getSize()){
                System.out.println("Invalid Index");
                return;
            }
            if(index==0){
                insertAtStart(data);
                return;
            }
            Node node = new Node(data);


            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next=temp.next;
            node.prev=temp;
            temp.next=node;
            }
        public int getSize() {

        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
        }
        void show(){
            Node temp=head;
            while(temp.next !=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
             System.out.println(temp.data+" -> null");
             
        }

        void deleteAtStart(){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            if(head.next == null){
                head=null;
                return;
            }
            head=head.next;
            head.prev=null;
        }

        void deleteAtEnd(){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }
            if(head.next == null){
                head=null;
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next= null;

        }
        
        void showBackward(){
            Node temp=head;
            while(temp.next !=null){
                temp=temp.next;
            }
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.prev;

            }
            System.out.println();
        }
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insert(5);
        list.insert(6);
        list.insertAt(4,8);
        list.insertAtStart(0);
        list.show();
        list.showBackward();
        list.deleteAtStart();
        list.show();
        list.deleteAtEnd();
        list.show();
    }
}
