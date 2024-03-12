package Java_Collections;
import java.util.*;


public class LinkedListDemo2 {
    public static void main(String[] args){
    LinkedList l = new LinkedList();
    l.add("X");
    l.add("Y");
    l.add("U");
    l.add("O");

    LinkedList new_l = new LinkedList();
    new_l.addAll(l);
    System.out.println(new_l);

    new_l.removeAll(l);
    System.out.println(new_l);


    //sorting   sort collections.sort(collections)

    System.out.println("Before sorting " + l);
    Collections.sort(l);
   // System.out.println("After Sorting " + l);


    //collections to sort : Reverse Order 
    Collections.sort(l , Collections.reverseOrder());
    System.out.println("reverse order" + l);
    //shuffleing 
    Collections.shuffle(l);
    System.out.println(l);


    }

   
    
    
}
