package eulerProblems;

import java.util.ArrayList;
import java.util.List;

public class Practise1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
//	
		List<Integer> numList = new ArrayList<Integer>();
		
	List<Integer> myList = null;
	PrimeNumberChecker prim = new PrimeNumberChecker();
	numList = prim.numberListGen();
		prim.primeChecker(numList);
 // System.out.println(myList.get(1));
	  System.out.println(prim.primeChecker(numList) + " out of " + numList.size() + " is/are primes");
	}

}
