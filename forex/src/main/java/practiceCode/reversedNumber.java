package practiceCode;

public class reversedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=789;
int n,rev=0;
while(num>0)
{
	n=num%10;
	rev=(rev*10)+n;
	num=num/10;
}
System.out.print(rev);
	}

}
