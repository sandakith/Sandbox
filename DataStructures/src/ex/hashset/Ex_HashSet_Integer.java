/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdatastructures.hashset;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Class to test HashSet 
 * @author lahiru.gallege
 */
public class Ex_HashSet_Integer {

    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(integers.contains(1)); // This is not O(n) it is O(1)
        integers.remove(1);
        System.out.println(integers.contains(1)); // This is not O(n) it is O(1)

    }

}
