package baitap.jv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
 int number;
    	    ArrayList<Integer> arrListNumber = new ArrayList<>();
    	    Scanner scanner = new Scanner(System.in);
    	   
    	    for (int i = 0; i < 4; i++) {
    	        System.out.print("phan tu thu " + i + ": ");
    	        number = scanner.nextInt();
    	        arrListNumber.add(number);
    	    }
    	         
    	
    	    ArrayList<Integer> arrTemp = new ArrayList<>();
    	   
    	    for (int i = 0; i < arrListNumber.size(); i++) {
    	        if (!arrTemp.contains(arrListNumber.get(i))) {
    	            arrTemp.add(arrListNumber.get(i));
    	        }
    	    }    
    	    arrListNumber.clear();
    	         
    	    arrListNumber.addAll(arrTemp);
    	         
    	    System.out.println("Phan tu co trong arrListNumber là: ");
    	    System.out.println(arrListNumber);
    	}
}