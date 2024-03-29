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
public class DDLinkedList_Tail {
    


private static void print(Node head) {
    while (head != null) {
        System.out.print(head.data + " ");
        head = head.next;
    }
    System.out.println(); // Add a newline after printing the list
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
private static Node removesHead(Node head){
    if(head==null)
    return null;


    head = head.next;

return head;
}


   



public static void main(String[] args){
    int[] arr = {12,4, 5,8};
    Node head = convertArr2DLL(arr);
    head = removesHead(head);
    head = deleteTail(head);
    print(head);

}
}