class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;

    }
    Node(int data1){
        this.data = data1;
        this.next = null;

    }


}

public class LastNodeDeleteLL {
    private static Node deleteTail(Node head){
        if(head == null || head.next == null)
        return null;


        Node temp = head;


        while(temp.next.next !=null){
            temp = temp.next;

        }
        temp.next = null;


        return head;


    }
    private static void printLL(Node head){
        while(head!=null){
            System.out.println(head.data + "");
            head = head.next;

    
        }
    }

        public static void main(String[] args){
            int[] arr = {1,23,45,67,2};

            Node head = new Node(arr[0]);
            head.next = new Node(arr[1]);
            head.next.next = new Node(arr[2]);

            head = deleteTail(head);


            printLL(head);


        }
    }
    

