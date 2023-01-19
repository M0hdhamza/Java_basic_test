package Static;

public class StaticMethod {
 
	public static void main(String[] args) {
		System.out.println("This is main mehtod");
		StaticMethod.method();
	}
	static void method () {
		System.out.println("unknown");
		StaticMethod.Method1();
	}
	static  {
		System.out.println("This is Static");
		StaticMethod.method();
	}
	static void Method1() {
		System.out.println("This is method 1");
	}
}
