package WrapperClass;

public class PrimativeAndObject {

	public static void main(String[] args) {
		int x=100;
		Integer y=Integer.valueOf(x);
		System.out.println(y);
		int z=y.intValue();
		System.out.println(z);
	}
}
