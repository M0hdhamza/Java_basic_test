package Operators;

public class StringConcat {
 public static void main(String[] args) {
	String s1="abc";
	String s2="def";
	int a=10, b=20,c=30;
	System.out.println(s1+s2);
	System.out.println(s1+a+b+c+s2);
	System.out.println(a+b+s1+c);
	System.out.println(a+s1+b+c);
 }
}
