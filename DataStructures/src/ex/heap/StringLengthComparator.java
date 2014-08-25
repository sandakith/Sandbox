/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exdatastructures.heap;

import java.util.Comparator;

    public class StringLengthComparator implements Comparator<String> {

        @Override
        public int compare(String x, String y) {
            
            if (x.length() < y.length()) {
                return -1;
            }
            if (x.length() > y.length()) {
                return 1;
            }
            return 0;
        }
    }
