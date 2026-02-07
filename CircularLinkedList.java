class CircularLinkedList {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    Node head = null;

    // Insert at End
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Node temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Display
    void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

   
}
