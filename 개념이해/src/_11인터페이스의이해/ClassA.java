package _11�������̽�������;

public class ClassA implements InterfaceA {
	ClassA() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		InterfaceA.method2();
	}
	
	public void method1() {
		System.out.println("�߻�޼ҵ� method1()�� �������̵���");
	}
}
