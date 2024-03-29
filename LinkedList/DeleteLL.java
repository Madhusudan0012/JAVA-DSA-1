class Node{
    int data ;
    Node next;

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;

    }
    Node(int data1){
        this.data = data1;
        this.next = null;

    }
}


public class DeleteLL {
    private static Node removesHead(Node head){
        if(head==null)
        return null;


        head = head.next;


        return head;
    }
    private static void printLL(Node head){
        while(head!=null){
            System.out.println(head.data + "");
            head = head.next;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,6};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);


        head = removesHead(head);

        printLL(head);

    }
}
