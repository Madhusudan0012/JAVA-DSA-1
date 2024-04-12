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

public class RemoveNode {

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

    private static void deleteNode(Node temp) {
        if (temp == null)
            return;

        if (temp.next != null)
            temp.next.back = temp.back;

        if (temp.back != null)
            temp.back.next = temp.next;

        temp.next = null;
        temp.back = null;
    }

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); // Add a newline after printing the list
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 3, 2};
        Node head = convertArr2DLL(arr);
        // Delete the second node (45 in this case)
        deleteNode(head.next.next);
        print(head);
    }
}
