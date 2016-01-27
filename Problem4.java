package eulerProblems;

import java.util.*;

public class Problem4 {
/* A palindromic number reads the same both ways. The largest 
 palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

	static int result = 0;
	static int pal = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;

		for (a = 99; a < 999;) {

			for (b = 99; b < 999;) {
				// result = MultiplyArrays(a,b);
				result = a * b;
				System.out.println(a + "*" + b +"="+ result);
				//palinNums[b] = result;
				if ((palindrome_check(Integer.toString(result)) == true)) {
					System.out.println("--------------checked" + result);
					pal = result;
					//System.out.println("#########################################"+pal);
				//	palinNums[i] = result;
					// System.out.println(result)
				}
				//System.out.println(Arrays.toString(palinNums));
				b++;
			}
	    a++;
		}
		System.out.println("######################################### "+pal);
	

		// System.out.println(Arrays.toString(palinNums));
	}

	public static boolean palindrome_check(String a) {
		boolean state = false;
		String reverse = new StringBuilder(a).reverse().toString();
		if (a.equals(reverse)) {
			return true;
		}
		return state;
	}


}
