/**
 *  Java program to create, update, and clear a queue collection.
 */

package com.mycollections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding element to a queue.
        queue.add(3);
        queue.add(9);
        queue.add(27);
        queue.add(112);
        queue.add(6);
        queue.add(9);
        queue.add(500);
        queue.add(7);

        // Printing the queue to console.
        System.out.println(queue); // Output: [3, 6, 9, 7, 9, 27, 500, 112]

        // Showing and removing head of the queue
        System.out.println(queue.poll()); // Output: 3

        // Printing the queue to console.
        System.out.println(queue); // Output: [6, 7, 9, 112, 9, 27, 500]

        // Removing all elements from the queue.
        queue.clear();

        // Printing the queue to console.
        System.out.println(queue); // Output: []

    }
}