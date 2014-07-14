/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdatastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author lahiru.gallege
 */
public class Ex_PriorityQueueMax_Integer {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
        queue.offer(1);
        queue.offer(3);
        queue.offer(2);
        queue.offer(4);


        Integer val = null;
        while ((val = queue.poll()) != null) {
            System.out.println(val);
        }

    }

}
