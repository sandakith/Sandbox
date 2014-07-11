/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdatastructures.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ex_PriorityQueue_StringLength {

    public static void main(String[] args) {
        
        // First define a Comparator Class implementing Comparator  
        Comparator<String> comparator = new StringLengthComparator();
        
        // Then create a PQ(initial size, comparator)
        PriorityQueue<String> queue = new PriorityQueue<>(10, comparator);
        // Populate it 
        queue.add("short one");
        queue.add("very long indeed");
        queue.add("medium string");
        // Test it
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }


}
