package _11�������̽�������;

public interface InterfaceA {
	public static final int a=10;
	int b=20;
	
	abstract void method1();
	
	static int method2() {
		return a+b;
	}
}
