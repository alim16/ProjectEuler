package eulerProblems;

public class problem5 {
	/*
	 * 2520 is the smallest number that can be divided by each of the numbers
	 * from 1 to 10 without any remainder. What is the smallest positive number
	 * that is evenly divisible by all of the numbers from 1 to 20?
	 */

	public static void main(String[] argv) {
		boolean Notfound = true;
		boolean[] checkRegister = new boolean[20];
		int num = 100000000;

		while (true) {
			if(num==1000000000){ ///fail save in case forever true
				break;
			}
			resetCheckRegister(checkRegister);
			for (int i = 0; i < checkRegister.length; i++) {
				if (num % (i + 1) == 0) {
					checkRegister[i] = true;
				}
			}
		//	System.out.println("number is: " + num);
			if(allTrue(checkRegister)==true){
				System.out.println("found! " + num);
				printCheckRegister(checkRegister);
				break;
			}
			num++;

		//	printCheckRegister(checkRegister);
			//System.out.println();
		
		}

	}
	
	public static void resetCheckRegister(boolean[] arr){
		for (int j = 0; j <arr.length-1; j++) {
			arr[j] = false;
		}
	}
	
	public static void printCheckRegister(boolean[] arr){
		//System.out.println(num + ":");
		for (int j = 0; j < arr.length-1; j++) {
			System.out.print(j);
			System.out.print(arr[j] + " ");
		}
	}

	public static boolean allTrue(boolean[] arr) {
		boolean flag = false;
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j] == true) {
				flag = true;
			} else {
				flag = false;
				return false;
			}
		}
		return flag;
	}

}
