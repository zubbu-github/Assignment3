package assignmentprograms;

public class ExceptionDemo {
	static void canpromote(int marks){
		if(marks<40)
           System.out.println("You have Failed!");
         	else
		   System.out.println("You have Passed!");
	}

	public static void main(String[] args) {
		canpromote(80);
		canpromote(35);
	}
}

