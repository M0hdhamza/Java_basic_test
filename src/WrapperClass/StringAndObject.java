package WrapperClass;

public class StringAndObject {

	public static void main(String[] args) {
		long g=1000000L;
		Long y=Long.valueOf(g);
		String s=y.toString();
		
		byte c=100;
		Byte z= Byte.valueOf(c);
		String u=Byte.toString(z);
		System.out.println(z);
		System.out.println(u);
		
	}
}
