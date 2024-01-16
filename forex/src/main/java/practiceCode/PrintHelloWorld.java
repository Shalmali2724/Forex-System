package practiceCode;
import java.util.Arrays;
import java.util.*;
import java.util.List;


public class PrintHelloWorld {
	
	
 void printHelloWorld()
{
int count=1;
while(count<=10)
{
	System.out.println("Hello World "+count);
	count++;
}	
}
	public void findThirdHighestFromArray()
	{
		
		int arr[]=new int []{10,67,56,78,90};
	     for(int i=0;i<arr.length-1;i++)
	     {
	    	 int temp =0;
	    	 for(int j=0;j<arr.length-1;j++)
	    	 {
	    		 if(arr[j]>arr[j+1])
	    		 {
	    			 temp=arr[j];
	    			 arr[j]=arr[j+1];
	    			 arr[j+1]=temp;
	    			 
	    		 }
	    	 }
	     }
	System.out.println("Third Highest Eelement From array: "+arr[2]);
		
	}


void ReverseString(String str)
{
	
	System.out.print("Revserse of Capgemini :");
for(int i=str.length()-1;i>=0;i--)
{
	System.out.print(str.charAt(i));
}
	
}


void findMissingNumber()
{
	
	List<Integer> list=List.of(2,4,6,8,10);


	for(int i=1; i<=list.get(list.size()-1);i++ )
	{
		if(list.contains(i))
		{
			continue;
		}
		else
		{
			System.out.print(i+" ");
		}
	}
}



	public static void main(String[] args) {
		PrintHelloWorld  obj=new PrintHelloWorld();
		obj.printHelloWorld();
		obj.findThirdHighestFromArray();
		obj.ReverseString("capgemini");
		obj.findMissingNumber();
		
	}

}
