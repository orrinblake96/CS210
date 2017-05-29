package ut1;

import java.util.Scanner;

public class Base{
	public static long asBase3(int num) {
	    long ret = 0, factor = 1;
	    while (num > 0) {
	        ret += num % 3 * factor;
	        num /= 3;
	        factor *= 10;
	    }
	    return ret;
	}

			public static void main(String[] agrs) {
			    Scanner in = new Scanner(System.in);
			    	System.out.println("Enter a number: ");
			    		int number = in.nextInt();
			    System.out.print(asBase3(number));
			    in.close();
				}
	}
 
