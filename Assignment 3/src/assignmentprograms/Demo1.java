package assignmentprograms;

public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		try {
			for(int i=3;i>=0;i--){
			     System.out.println(a/i); 
			}
		} catch(ArithmeticException e) {
			System.out.println("Cant divide it by Zero");
		}
		 
		   }	
}
