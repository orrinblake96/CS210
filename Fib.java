package ut1;
import java.util.*;

public class Fib {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLease insert a number: ");
		int n = sc.nextInt();
		
		System.out.println(Fib1(n));
	}
	 
	public static int Fib1(int n)
	{
		if(n == 1 | n == 2){
			return 1;
		}else{
			return Fib1(n-1) + Fib1(n-2);
		}
	}
}
