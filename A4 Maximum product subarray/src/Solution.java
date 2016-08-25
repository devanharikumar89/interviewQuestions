
public class Solution {
	public static void main(String[] args) {
		int[] arr = { -2, 4, 5, 7, 0, 1, 4, 8, 8, -3, 3 };
		System.out.println(maxProductSubArray(arr));
	}

	private static int maxProductSubArray(int[] arr) {
		int max_ending_here = 1;
		int min_ending_here = 1;
		int MAX = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				max_ending_here *= arr[i];
				min_ending_here = Math.min(1, min_ending_here * arr[i]);
			} else if (arr[i] < 0) {

				int temp = max_ending_here;
				max_ending_here = Math.max(min_ending_here * arr[i], 1);
				min_ending_here = temp * arr[i];

			} else {
				max_ending_here = 1;
				min_ending_here = 1;
			}
			if (MAX < max_ending_here) {
				MAX = max_ending_here;
			}

		}
		return MAX;
	}
}
