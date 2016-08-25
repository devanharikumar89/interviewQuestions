import java.util.Arrays;

public class PythTriplet {
	public static void main(String[] args) {
		int[] arr = { 1,5,8,12,17 };
		countAllTriplets(arr);
	}

	private static void countAllTriplets(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		/*
		 * The idea is this : i iterates from 2 to end of the array. Each
		 * iteration, we pick a left and right - to the left of i if the left
		 * value plus right value greater than the i value then all the values
		 * between left and right too can be added(equivalent to saying that for
		 * that right value, all left values leading upto that right) and we
		 * decrement right. If it is less than or equal, we increment the left.
		 */
		//O(N^2) because left and right variables move towards each other linearly
		for (int i = 2; i < arr.length; i++) {
			int left = 0;
			int right = i - 1;
			while (left < right) {
				if (arr[left] + arr[right] > arr[i]) {
					count += (right - left);
					right--;
				} else {
					left++;
				}
			}
		}
		System.out.println(count);

	}

}
