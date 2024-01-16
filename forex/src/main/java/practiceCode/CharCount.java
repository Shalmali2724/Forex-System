package practiceCode;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		String str2=str.toLowerCase();
		Map<Character,Integer> mp=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=0;j<str.length();j++)
			{
				if((str2.charAt(i))==(str2.charAt(j)) && i !=j){
					count ++;
			}
			}
			mp.put(str.charAt(i),count);
		}
		mp.forEach((k,v)->System.out.println(" character :"+k +" value :"+v));
		
	}

}
