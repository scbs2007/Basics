import java.util.Scanner;

public class BinaryofNumberViaBitShift {

	public static String fn(String str, int n)
	{
		if(n == 0)
			return str;
		str = n%2 +str;
		return fn(str, n/2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		String res = "";
		System.out.println(fn(res, n));
	}

}
