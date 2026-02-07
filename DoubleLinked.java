class DoublyLinkedList {

    class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
        }
    }

    Node head;

    // Insert at Front
    void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    // Insert at End
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete a Value
    void delete(int key) {
        Node temp = head;

        while (temp != null && temp.data != key)
            temp = temp.next;

        if (temp == null) return;

        if (temp.prev != null)
            temp.prev.next = temp.next;
        else
            head = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

   
}
