package collections.List;

import java.util.*;
public class List {
    public static void main(String[] args) {
        ArrayList<String>list1 = new ArrayList<>(Arrays.asList("Lidivine", "Regis", "Ritha", "Exauce", "Ritha"));
        ArrayList<String>list2 = new ArrayList<>(Arrays.asList("Moustapha", "Faith", "Divine"));
        list1.add(list1.indexOf("Ritha") + 1, "Gisele");
        int indexOfFaith = list2.indexOf("Faith");
        if (indexOfFaith != -1) {
            list2.set(indexOfFaith, "Faith Mbabazi");
        }
        System.out.println("Updated List 1: " + list1);
        System.out.println("Updated List 2: " + list2);
      

    }
}