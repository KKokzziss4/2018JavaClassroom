import java.util.Scanner;

public class ����41 {
	public static void main(String[] args) {
		System.out.print("�ڿ��� n: ");
		Scanner sc = new Scanner(System.in);
		
		int n;
		n=sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=1; j--)
				System.out.print(" ");
			for(int j=1; j<=2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
