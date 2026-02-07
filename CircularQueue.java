class CircularQueue {
    int[] q;
    int front = -1, rear = -1, size;

    CircularQueue(int n) {
        size = n;
        q = new int[n];
    }

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        q[rear] = x;
    }

    void dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(q[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
