import java.util.Arrays;

//The idea is to count all the non zero elements in the array
//keep putting them to the left side and fill the rest of the array with 0
//keep a variable count that counts the number of non zero numbers.
//After that, put every non zero number to arr[count] location and increment count
//from count to the end of the array fill 0's

public class Solution {
	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 0, 3, 4, 4, 34, 34, 35, 2, 0, 2, 0 };
		move(arr);
	}

	private static void move(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		for (int i = count; i < arr.length; i++) {
			arr[i] = 0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
