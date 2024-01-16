package practiceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		// immutable
		List<Integer> abc=List.of(30,50,70,7,89,5,2);
		List<Integer> stream=new ArrayList<>();
		for(Integer i:abc)
		{
			if(i%2==0)
			{
				stream.add(i);
			}
//			else
//			{
//				continue;
//			}
		}
		System.out.println(abc);
		System.out.println(stream);
		
		List<Integer>str=abc.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(str);
		List<Integer> list2=abc.stream().filter(j->j>40).collect(Collectors.toList());
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(11);
		list.add(14);
		list.add(89);
		list.add(876);
		
	Stream<Integer> obj=list.stream();
		
		Integer sd=obj.max((x,y)->x.compareTo(y)).get();
		System.out.println("min :" +sd);
		List<String> obj1=List.of("Shlmali","Sopan","Nighot","jikesha","Mangitea","aasd");
		List<String>obj2=obj1.stream().filter(a->a.startsWith("S")).collect(Collectors.toList());
		System.out.println(obj2);
		String an=obj1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min :" +an);
		
		
		
		
		
		
		
//Iterator<Integer> itr=abc.iterator();
//int count;
//while(itr.hasNext())
//{
//	count=0;
//	Integer a=itr.next();
//	for(int i=1;i<=a;i++)
//	{
//	
//		if(a%i==0)
//		{
//			count++;
//		}
//	
//	}
//	if(count==2)
//	{
//		System.out.println(a);
//	}
//}

	}

}
