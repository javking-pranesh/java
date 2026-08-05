class Queue1 {

    int[] queue = new int[5];
    int front = 0;
    int rear = 0;
    int size = 0;

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        queue[rear] = data;
        rear = (rear + 1) % queue.length; 
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public static void main(String[] args) {

        Queue1 q = new Queue1();

        q.dequeue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.show();

        q.enqueue(40);
        q.enqueue(50);
        q.show();

        q.enqueue(60); // full

        System.out.println(q.dequeue());
        q.show();

        System.out.println(q.peek());
        q.show();
    }
}