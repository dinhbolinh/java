package baitap.jv;

import java.util.Scanner;
public class GiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n ;
//		 System.out.println("giai thua cua :" + n +giaithua);
		 
		 int n ;
		 Scanner sc = new Scanner(System.in);
	      System.out.println("nhap gia tri cau n :");
	      n = sc.nextInt();
	      giaithua(n);
	      
	}
	 public static void giaithua(int n) {
	        int ketQua = 1;
	        for(int i = 1; i <= n ; i++) ketQua= ketQua * i;
	        System.out.println("giai thua la :" + ketQua);
//	        if (n == 0 || n == 1) {
//	            return giai_thua;
//	        } else {
//	            for (int i = 2; i <= n; i++) {
//	                giai_thua *= i;
//	            }
//	            return giai_thua;
//	        }
	 }
}