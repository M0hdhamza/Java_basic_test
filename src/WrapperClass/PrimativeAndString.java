package WrapperClass;

public class PrimativeAndString {

	public static void main(String[] args) {
		byte a=100;
		String b=Byte.toString(a);
		System.out.println(b);
		byte z=Byte.parseByte(b);
		System.out.println(z);
	}
}
