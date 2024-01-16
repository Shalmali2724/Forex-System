package practiceCode;
import java.util.*;

public class CharCount2 {

	public static void main(String[] args) {
	
		String str="Hello";
		String str2=str.toLowerCase();
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str2.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.print(" "+ch+" :"+count);
	}

}
