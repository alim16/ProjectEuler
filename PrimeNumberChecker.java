package eulerProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class PrimeNumberChecker {
	//List<Integer> numList;
	

	
	public List<Integer> numberListGen(){
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(10);
		numList.add(6);		
		numList.add(12);
		return numList;
	}
	
	public int primeChecker(List<Integer> list){
		int numberOfPrimes = 0;
		Iterator<Integer> it = list.iterator();
		
		
		while (it.hasNext()){
		int j = 0;
		int k =it.next();
		boolean isPrime  = true;
		
		for (j = k/2; j >1;){	
			if (k%j==0){
				isPrime = false;
			}
			j--;
		}
		if(isPrime == true){
			System.out.println(k + " is a prime number");
			numberOfPrimes++;
		} else {
			System.out.println(k + " is NOT a prime number");
		}
		
		}
		
		return numberOfPrimes;
	}
	
		
	
}
