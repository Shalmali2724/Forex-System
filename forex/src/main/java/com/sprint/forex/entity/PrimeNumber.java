package com.sprint.forex.entity;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =3;
		int count=2;
		List list=new ArrayList();
		for(int i=1;i<100;i++)
		{
			for(int j=1;j<100;j++)
			{
				
				if(i%j==0)
				{
					count ++;
					
				}
				
			}
			if(count>2)
			{
				list.add(i);
			}
			
		}
		
		list.get(2);

	}

}
