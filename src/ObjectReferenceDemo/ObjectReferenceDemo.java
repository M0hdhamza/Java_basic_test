package ObjectReferenceDemo;

public class ObjectReferenceDemo {

	int x;
	public static void main(String[] args) {
		ObjectReferenceDemo ord=new ObjectReferenceDemo();
		System.out.println(ord.x);
	}
	static {
		ObjectReferenceDemo sec=new ObjectReferenceDemo();
		System.out.println(sec);
	}
}
