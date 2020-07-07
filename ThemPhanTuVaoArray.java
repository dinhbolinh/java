package baitap.jv;
import java.util.Scanner;

public class ThemPhanTuVaoArray {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nhap();
		
 }
    
    static void nhap( ){
    	 int[] a ;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua mang a[]: ");
        n = sc.nextInt();
        int[] a1 = new int[n+1];
        for(int i= 0; i< a1.length-1; i++ ){
            System.out.print("nhap phan tu a["+i+"]= ");
            a1[i] = sc.nextInt();
        }
        int x;
        System.out.print("nhap phan tu can chen, x = ");
        x = sc.nextInt();
        chen(a1,x);
    }
    
    static void chen( int[] a, int x ){
        if(a[0] > x )
        {
            for( int i = a.length-1;  i> 0; i-- )
                a[i] = a[i-1];
           a[0] = x;
        }
        else if(a[a.length-2] < x ) a[a.length-1] = x;
        else{
            int index = 0;
            for(int i = 0; i< a.length-1; i++ )
                if(a[i] > x) {
                    index = i;
                    break;
                }
            for(int i = a.length-1; i> index; i--)
                a[i] = a[i-1];
            a[index] = x;
        }
        display(a);
    }
    
    static void display(int[] a){
        System.out.print("mang a[]: " );
        for(int x:a)
            System.out.print(x + " ");
        System.out.println("");
    }
    
}
