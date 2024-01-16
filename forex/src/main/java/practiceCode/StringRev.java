package practiceCode;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="capgemini";
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
