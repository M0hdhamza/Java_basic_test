package NonStatic;

public class NonStaticMembersDemo {

//	NonStaticMembersDemo(){
//		System.out.println("This is const");
//	}
	//**with out constructor also working**//
	{
		System.out.println("This is nonStatic block");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		new NonStaticMembersDemo();
	}
	static {
		System.out.println("this is static");
	}
}
