package practiceCode;

import java.util.List;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int largest=Integer.MIN_VALUE;
		int secondLarget=Integer.MIN_VALUE;
		int arr[]=new int[]{70,76,79,79,90,50,33};
		int i,j;
		
		for(int num:arr)
		{
		if(num>largest) {
			secondLarget=largest;
			largest=num;
		}
		else if(num>secondLarget && num<largest) {
			secondLarget=num;
		}
		}
		
		System.out.print(secondLarget);
	}

}
