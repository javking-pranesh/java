class Stack {

    int[] stack = new int[5];
    int top = -1;

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public static void main(String[] args) {
        Stack nums = new Stack();

        nums.pop();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.show();

        nums.push(40);
        nums.push(50);
        nums.show();

        nums.push(60);

        System.out.println(nums.pop());
        nums.show();

        System.out.println(nums.peek());
        nums.show();
    }
}