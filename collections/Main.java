package collections;

import java.util.*;
public class Main {
    public static void main(String[] args){
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<String>();
        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        // Print the ArrayList
        System.out.println("ArrayList: " + list);
        // Create a new LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");
        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);
        Collection<Integer>c= new ArrayList<>();
        c.add(1);
    }
}