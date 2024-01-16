package practiceCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayThirdHighestNo {

	public static void main(String[] args) {
		
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
	System.out.print(arr[2]);
	     
	}
}
