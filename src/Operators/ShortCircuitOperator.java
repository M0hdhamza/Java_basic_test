package Operators;

public class ShortCircuitOperator {

	public static void main(String[] args) {
		boolean x=true, y=false;
		if(x&&y) {
			System.out.println("Inside IF");
		}
		 if(x&y) {
			 System.out.println("This is singel &");
		 }
		 if(x|y) {
			 System.out.println("This is OR");
		 }
		 if(x||y) {
			 System.out.println("This is TWO OR");
		 }
		
	}
	
}
