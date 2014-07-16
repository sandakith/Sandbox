/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exdatastructures.datetime;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_DateTime_LongToTime {


    public static void main(String[] args) {
    	
    	// Get the current time in long and convert to readable format 
    	final long currentTimeLong = System.currentTimeMillis();
    	System.out.println("Curent Time in Long: "+ currentTimeLong);
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");

        Date resultdate = new Date(currentTimeLong);
        System.out.println(sdf.format(resultdate));
        
//    	Long givenTime = new Long(1405433971740);
//        Date givenDate = new Date(givenTime);
//        System.out.println(sdf.format(givenDate));
    	
    }
		

}