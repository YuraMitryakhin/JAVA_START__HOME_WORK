import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double f;

		System.out.print("Enter number:");
		n = sc.nextInt();
		f = n;

		for (int i = 1; i < n; i++) {
			f = f * (n - i);
		}
		System.out.println("Factorial: " + f);
	}

}
