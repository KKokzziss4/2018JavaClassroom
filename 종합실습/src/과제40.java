import java.util.Scanner;

public class ����40 {
	public static void main(String[] args) {
		System.out.print("�ڿ��� n: ");
		Scanner sc = new Scanner(System.in);
		
		int n;
		n=sc.nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%1d ", 1+(i+j)%5);
			}
			System.out.println();
		}
	}
}
