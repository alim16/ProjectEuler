/**
 * 
 */
package eulerProblems;

/**
 * @author mohamed
 *
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long result = 0;
	long total = 0;
		long a = 0;
		long b = 1;
		
		for (int i=1; i<33;i++){
			
			result = a+b;
			
			if((result%2)==0){
				total = total+result;
			}
			a = b;
			b = result;
			
		//	System.out.println("a = " + a);
		//	System.out.println("b = " + b);
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(total);
	}

}
