package learning.data_structures;

import java.util.Collections;
import java.util.LinkedList;

public class linked_list {

    public static void main(String[] args) {
        linked_list obj = new linked_list();
        obj.linked_listFr();
        obj.linked_listSort();
        obj.linked_listSortButBackwards();
    }

    public void linked_listFr() {
        // Simple Linked List
        LinkedList<String> luciousList = new LinkedList<String>();
        luciousList.add("balls?");
        luciousList.add("any questions?");
        luciousList.add("yumulus");
        luciousList.add("oiled up guy");
        luciousList.addFirst("primus");
        luciousList.removeLast();

        System.out.println(luciousList);
        System.out.println(luciousList.getFirst());
    }
    // Sorting the absolute piss out of this list
    public void linked_listSort() {
        LinkedList<String> luciousList = new LinkedList<String>();
        luciousList.add("balls?");
        luciousList.add("any questions?");
        luciousList.add("yumulus");
        luciousList.add("oiled up guy");
        luciousList.add("guice");

        Collections.sort(luciousList);

        for (String i : luciousList) {
            System.out.println(i);
        }
    }
    // Reversing this bitch
    public void linked_listSortButBackwards() {
        LinkedList<String> luciousList = new LinkedList<String>();
        luciousList.add("balls?");
        luciousList.add("any questions?");
        luciousList.add("yumulus");
        luciousList.add("oiled up guy");
        luciousList.add("guice");

        Collections.sort(luciousList, Collections.reverseOrder());

        for (String i : luciousList) {
            System.out.println(i);
        }
    }
}
