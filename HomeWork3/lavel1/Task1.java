import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("Enter the number of strip:");
		n = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 1) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println("");
		}
	}

}
