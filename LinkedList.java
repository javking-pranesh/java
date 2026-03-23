import java.util.*;
class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;

        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {

        if (index < 0 || index > getSize()) {
            System.out.println("Invalid Index. List Size is " + getSize());
            return;
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node node = new Node();
        node.data = data;

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAt(int index) {

        if (index < 0 || index >= getSize()) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public void show() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.println("Enter the Size of the Linked List: ");
        int n= in.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+ " Data: ");
            int data=in.nextInt();
            list.insert(data);
        }


        int choice=-1;
        while(choice!= 0){
            System.out.println("Enter the choice:");
            System.out.println("1. Inset at Start");
            System.out.println("2. Inset at Position");
            System.out.println("3. Inset at End");
            System.out.println("4. Delete at Position");
            System.out.println("5. Display List");
            System.out.println("Enter 0 to Exit");
            choice=in.nextInt();
            int data,pos;
            switch(choice){
                
                case 1:
                    System.out.println("Enter Data to Insert: ");
                    data=in.nextInt();
                    list.insertAtStart(data);
                    System.out.println(data+" Inserted Succesfully!");
                    break;
                case 2:
                    System.out.println("Enter the Position to insert: ");
                    pos=in.nextInt();
                    System.out.println("Enter Data to Insert: ");
                    data=in.nextInt();
                    list.insertAt(pos,data);
                    System.out.println(data+" Inserted Succesfully!");

                    break;
                case 3:
                    System.out.println("Enter Data to Insert: ");
                    data=in.nextInt();
                    list.insert(data);
                    System.out.println(data+" Inserted Succesfully!");
                    break;
                case 4: 
                    System.out.println("Enter the Position to Delete: ");
                    pos=in.nextInt();
                    list.deleteAt(pos);
                    System.out.println(pos+" th Position Deleted Successfully!");
                    break;
                case 5:
                    list.show();
                case 0:
                    System.out.println("Game Ended!");
                    break;

            }
        }

    }
}

class Node {
    int data;
    Node next;
}