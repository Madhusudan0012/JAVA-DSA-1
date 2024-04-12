class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class deleteKthElementDLL {

    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node newHead = head.next;
        newHead.back = null;
        head.next = null;
        return newHead;
    }

    private static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }

    public static Node deleteKthElement(Node head, int k) {
        if (head == null || k <= 0) {
            return head;
        }
        int cnt = 0;
        Node kNode = head;
        while (kNode != null && cnt < k) {
            kNode = kNode.next; 
            cnt++;
        }
        if (kNode == null) {
            // kth element doesn't exist, nothing to delete
            return head;
        }
        Node prev = kNode.back;
        Node next = kNode.next;

        if (prev == null && next == null) {
            // Single element in the list
            return null;
        } else if (prev == null) {
            // Delete head
            return deleteHead(head);
        } else if (next == null) {
            // Delete tail
            return deleteTail(head);
        } else {
            // Delete kth node
            prev.next = next;
            next.back = prev;
            kNode.next = null;
            kNode.back = null;
            return head;
        }
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); // Add a newline after printing the list
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        Node head = convertArr2DLL(arr);
        int k = 3; // Example: Delete the 3rd element (indexing starts from 1)
        head = deleteKthElement(head, k);
        print(head);
    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
