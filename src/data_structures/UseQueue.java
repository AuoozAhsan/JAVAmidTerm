package data_structures;

import java.util.Queue;
import java.util.LinkedList;

public class UseQueue {
    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        Queue<String> shoppingList = new LinkedList<>();

        shoppingList.add("Dress");
        shoppingList.add("Shoes");
        shoppingList.add("Jewellery");

        System.out.println("that will be perfect if you'll buy me " + shoppingList);
        System.out.println("No honey, the business is slow these days");

        System.out.println("Ok! fine, just  "  +shoppingList.peek());

        System.out.println("Ok sure, " + shoppingList.poll() + ", I'll get that for you");

        System.out.println("and " + shoppingList.remove() + " too, be happy");
    }

    }


