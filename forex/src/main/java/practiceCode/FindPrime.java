package practiceCode;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%2==0)
			{
				count++;
			}
		}
		
		if(count>=2)
		{
			System.out.print("Number Not Prime");
		}
		else {
			System.out.print("Prime number");}	}

}
