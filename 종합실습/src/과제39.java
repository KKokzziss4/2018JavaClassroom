import java.util.Scanner;

public class ����39 {
	public static void main(String[] args) {
		System.out.print("�ڿ��� n: ");
		Scanner sc = new Scanner(System.in);
		
		int n, cnt=1;
		n=sc.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.printf("%2d ", cnt++);
			}
			System.out.println();
		}
	}
}
