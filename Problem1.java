package eulerProblems;

public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for (int i=1; i<1000;i++){
			if((i % 3==0) || (i%5==0)){
				result = result+i;
			}
		}
			
		System.out.println(result);


	}

}
