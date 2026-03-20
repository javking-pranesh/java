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

        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(1);
        list.insert(4);
        list.insert(3);

        list.insertAtStart(0);
        list.show();

        list.insertAt(-1, 18);
        list.insertAt(9, 7);
        list.show();

        list.deleteAt(1);
        list.deleteAt(5);

        list.show();
        System.out.println(list.getSize());
    }
}

class Node {
    int data;
    Node next;
}