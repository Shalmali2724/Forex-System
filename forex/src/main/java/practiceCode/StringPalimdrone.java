package practiceCode;
import java.util.*;
public class StringPalimdrone {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
	
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
if(rev.equals(str))
{
	System.out.print("Palimdrone");
}
else
	System.out.print(" Not aPalimdrone");

}}
