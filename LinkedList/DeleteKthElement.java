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
public class DeleteKthElement{


    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); // Add a newline after printing the list
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
private static Node deleteHead(Node head){
    if(head==null)
    return null;


    head = head.next;


    return head;
}
private static Node deleteTail(Node head){
    if(head==null || head.next == null){
        return null;
    }
    Node tail = head;
    while(tail.next != null ){
        tail = tail.next;
    }
    Node newTail = tail.back;
    newTail.next = null;
    tail.back = null;

    return head;


}
// private static Node removeKthElement(Node head , int k){
//   if(head == null){
//     return null;
//   }
//   int cnt = 0 ;
//   Node kNode = head;
//   while(kNode != null){
//     cnt++;
//     if(cnt == k) break;
//     kNode = kNode.next;


//   }
//   Node prev = kNode.back;
//   Node front = kNode.next;

//   if(prev==null && front == null){
//     return null;
//   }
//   else if (prev==null){
//     return deleteHead(head);
//   }
//   else if(front == null ){
//     return deleteTail(head);

//   }
//   prev.next = front;
//   front.back = prev;
//   kNode.next = null;
//   kNode.back = null;
//   return head;


  


// }
private static Node removeKthElement(Node head, int k) {
    if (head == null) {
        return null;
    }

    int cnt = 1; // Start counting from 1
    Node kNode = head;
    while (cnt < k && kNode != null) {
        cnt++;
        kNode = kNode.next;
    }

    // If k-th node is not found or k is less than 1
    if (kNode == null) {
        return head;
    }

    Node prev = kNode.back;
    Node front = kNode.next;

    // If k-th node is head
    if (prev == null) {
        return deleteHead(head);
    }

    // If k-th node is tail
    if (front == null) {
        return deleteTail(head);
    }

    prev.next = front;
    front.back = prev;
    kNode.next = null;
    kNode.back = null;

    return head;
}


public static void main(String[] args){
    int[] arr = {12,3,4,5};
    Node head = convertArr2DLL(arr);
    head = removeKthElement(head, 2);
    print(head);
    


}


}