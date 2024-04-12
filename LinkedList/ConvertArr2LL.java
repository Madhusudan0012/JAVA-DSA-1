 class convertArr2LL {
    private static Node convertArr2LL1(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        // Setting the next of the last node to null
        mover.next = null;
        return head;
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); // Add newline after printing the whole list
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArr2LL1(arr);
        printLinkedList(head);
    }

    // Definition of Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
