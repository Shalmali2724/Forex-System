package practiceCode;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Sialmali";
int count;

for(int i=0;i<str.length();i++)
{
	count=1;
	char a=str.charAt(i);
	for(int j=i+1;j<str.length();j++)
	{
		if(str.charAt(j)==a && i!=j)
		{
		count++;
		}
	}
	if(count>1)
	{
		System.out.print(str.charAt(i));
	}
	
}
		
	}

}
