package Java_Collections;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args){
    //how we can declare linkedlist 
   // LinkedList l  = new LinkedList<>();
    // LinkedList <Integer> l = new LinkedList<Integer>();
    LinkedList l = new LinkedList();
    
    //add some data or elements inside the arrraylist 
    l.add(100);
    l.add("Madhusudan");
    l.add(15.6);
    l.add(100);
    l.add(true);
    l.add(null);
    l.remove(null);


    System.out.println(l.size());

    l.remove(3);
    System.out.println("After Removing");
    System.out.println(l);

    //Insert Element : adding element in the middle of the array 
    l.add(3 , "Madhusudan");
    System.out.println(l);

    //retriving value / object 
    l.get(3);
    System.out.println(l);

    //change the value
    l.set(4, "X");
    System.out.println("After changeing the vlaue " + l);

    //contains method 
    l.contains("java");
    l.contains("Python");
    System.out.println(l);
    System.out.println(l.remove(4));

    System.out.println(l.isEmpty());

    //reading elements in linkedList 
    for(int i = 0 ; i<l.size() ; i++){
        System.out.println(l.get(i));
    }


    
    for( Object e :l){
        System.out.println(e);
    }

   // l.add(3, "java");

   //iterator() method 
   Iterator it =l.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }
}



    
    }
