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

        Queue<String> queue = new LinkedList<>();

        queue.add("Dress");
        queue.add("Shoes");
        queue.add("Jewellery");

        System.out.println("that will be perfect if you'll buy me " + queue);
        System.out.println("No honey, the business is slow these days");

        System.out.println("Ok! fine, just  "  +queue.peek());

        System.out.println("Ok sure, " + queue.poll() + ", I'll get that for you");

        System.out.println("and " + queue.remove() + " too, be happy");
    }

    }


