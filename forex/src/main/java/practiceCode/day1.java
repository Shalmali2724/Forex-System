package practiceCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class day1 {
	// code 1 for print Helloworld
	public void printHelloWorld() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Hello world " + i);}
	}
// code 2 for reverse String
	public void stringRev(String str) {
		int n = str.length();
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	} 
	//code 3 for print 3 rd highest number from array
	public void printThirdHighestFromArr() {
        List list = Arrays.asList(10, 67, 56, 78, 90);
		List list2 = (List) list.stream().sorted().collect(Collectors.toList());
		System.out.print(list2.get(2));
	}

	public static void main(String[] args) {
		day1 obj = new day1();
		obj.printHelloWorld();
		obj.stringRev("capgemini");
  	obj.printThirdHighestFromArr();

	}

}
