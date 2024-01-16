package practiceCode;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
	
		String arr[]=new String[] {"shalmali","Radha","Bheema","Purva","shan"};
		String temp="";
		int size=arr.length;
		System.out.print(size);
		for(int i=0;i<size-1;i++)
		{
			
			for(int j=0;j<size-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
			   }
			}
		}

	
		System.out.println(Arrays.toString(arr));
	
	
	}
	
	
	
	

}
