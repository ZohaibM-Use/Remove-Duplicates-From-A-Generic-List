import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Group_Task_3 {
    public static void main(String[] args) {
        System.out.println("Collaborators: Zohaib, Nickk, Tasnim Islam, Junnan, Waheed, Okwan");
        System.out.println("---------------------------------------------------------");
        /*
        Arrays.asList() method
        Short way to add multiple elements into an arraylist.
        Creates an array with given elements and converts it to a list in one line.
        On its own it will provide a fixed list meaning nothing can be added/removed.
        To make it resizable, you must wrap it: new ArrayList<>(Arrays.asList()).
         */
        ArrayList<String> pokemon = new ArrayList<>(Arrays.asList(
                "Pikachu", "Charmander", "Bulbasaur", "Squirtle", "Pikachu",
                "Eevee", "Snorlax", "Gengar", "Mewtwo", "Charizard",
                "Bulbasaur", "Jigglypuff", "Meowth", "Psyduck", "Eevee",
                "Machop", "Geodude", "Magikarp", "Gyarados", "Lapras",
                "Ditto", "Vaporeon", "Jolteon", "Flareon", "Eevee",
                "Dragonite", "Dratini", "Pikachu", "Snorlax", "Gengar"));

        //Sorting makes removal easier.
        // Without sorting, a nested loop would be required to remove duplicates.
        Collections.sort(pokemon);
        System.out.println("Sorted List (With Duplicates): ");
        System.out.println(pokemon);

        Iterator<String> it = pokemon.iterator();
        //previous variable stores the last seen element after an iteration.
        String previous = null;

        while (it.hasNext()){
            String current = it.next();
            //The current variable is compared with the previous element.
            // If equal - current is removed and next iteration commences.
            if (current.equalsIgnoreCase(previous))
                it.remove();
            else
                previous = current; //previous is only changed if current is not removed
        }

        System.out.println();
        System.out.println("Sorted List (No Duplicates): ");
        System.out.println(pokemon);
    }
}
