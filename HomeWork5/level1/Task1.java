public class Task1 {

	public static void main(String[] args) {
		int[] mas = new int[] { 1, 4, 8, 3, 5, 1, 9, 7, 3, 2, 9 };
		System.out.println(maxValue(mas));
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
