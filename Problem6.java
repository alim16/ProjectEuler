package eulerProblems;

public class Problem6 {

	
	
	public static void main(String[] args) {
		int[] myArr = new int[101];
		for(int i=1; i< myArr.length; i++){
			myArr[i] = i;
			//System.out.println(myArr[i]);
		}
		
		int ofSquare = sum_of_squares(myArr);
		int ofSum = square_of_sum(myArr);
		int answer = ofSum-ofSquare ;
		System.out.println(answer);
		
	}
	
	public static int sum_of_squares(int[] arr){
		int sum = 0;
		for(int s:arr){
			sum=sum+(s*s);
		}
		
		return sum;
	}
	
	public static int square_of_sum(int[] arr){
		int sum = 0;
		for(int s:arr){
			sum=sum+s;
		}
		
		return sum*sum;
	}
	
}

	
	
	
	