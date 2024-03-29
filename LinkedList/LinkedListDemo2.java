public class LinkedListDemo2 {

    class Node{
        int data;
        Node next;

    }
    private Node head;
    private Node tail;
    int size;
    int val;


    public void addFirst(int data){
        Node nn = new Node();
        nn.data = val;
        if(size==0){
            // int val = head;
            head = nn;
            tail = nn;
            size++;


        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
            
        }
    }
}