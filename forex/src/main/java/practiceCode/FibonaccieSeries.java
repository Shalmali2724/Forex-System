package practiceCode;

import java.util.Scanner;

public class FibonaccieSeries {

	public static void main(String[] args) {
		
		int n1=-1,n2=1,n3=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			num--;
			
		}

	}

}
