class Node {
    int data;
    Node next;
    Node back;


    Node(int data1 , Node  next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;

    }

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
    //delete karni he tail of linkedlist 


}
class deleteTailDLL{
    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
            Node newTail = tail.back;
            newTail.next = null;
            tail.back = null;
            return head;
        }
        private  static Node convertArr2DLL(int[] arr){
            Node head = new Node(arr[0]);
            Node prev = head;
            for(int i = 1 ; i<arr.length ; i++){
                Node temp = new Node(arr[i] , null , prev);
                prev.next = temp;
                prev = temp;
        
            }
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
        public static void main(String[] args){
            int[] arr = {1,5,6,7};
            Node head = convertArr2DLL(arr);
            head = deleteTail(head);
            printLinkedList(head);
            return;
        
            


        } 
        
    }

