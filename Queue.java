class Queue {
    int front = 0, rear = -1, size;
    int[] arr;

    Queue(int n) {
        size = n;
        arr = new int[n];
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }
        arr[++rear] = x;
    }

    void dequeue() { 
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        front++;
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
