package baitap.jv;

import java.util.Scanner;

public class tiendien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int sodien;
		  Scanner sc = new Scanner(System.in);
		sodien 	 = sc.nextInt();
		if(sodien <=50) {
			String vnd;
			System.out.println("Thanh tien:" + sodien*1549+"vnd");
		}else if(sodien>50 & sodien <= 100) {
			System.out.println("Thanh tien:" + sodien* 1600+"vnd");
		}else if(sodien>101 & sodien <=200) {
			System.out.println("Thanh tien:" + sodien*1.857+"vnd");
		}else if(sodien>201 & sodien <=300) {
			System.out.println("Thanh tien:" + sodien* 2.340+"vnd");
		}else if(sodien>301 & sodien <=400) {
			System.out.println("Thanh tien:" + sodien*2.615+"vnd");
		}else if( sodien >400) {
			System.out.println("Thanh tien:" + sodien*2.701+"vnd");        
	 }

		
  } 
}