//Array to LinkedList 



class Node { 
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
    
};
public class SearchinLL {
    private static Node convertArr2LL(int[] arr){
   // Node convertArrLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 0 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;
    }

    
    public static void main(String[] args){
        int[] arr = {12,5,6,8};
        // Node y = new Node(arr[3]);
        // System.out.println(y.data);
        Node head = convertArr2LL(arr);
        
        Node temp = head;
        while(temp!=null){
        System.out.println(head.data);
        temp = temp.next;

        }
    }
}
