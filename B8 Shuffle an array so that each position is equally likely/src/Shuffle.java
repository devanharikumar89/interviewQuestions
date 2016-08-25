import java.util.Arrays;

//This is also called the FISCHER YATES shuffle
/*Use random and pick an index from 0 to n-1. swap it with 0
 Use random and pick an index from 1 to n-1. swap it with 1
 so on and so forth*/
public class Shuffle {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 9, 7, 4, 3, 2, 5, 9, 2, 3, 9, 2, 3, 5 };
		shuffle(arr);
	}

	private static void shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int x = (int) (Math.random() * (arr.length - i) + i);
			// swap
			System.out.println("swapping "+i+" with "+x);
			int temp = arr[i];
			arr[i] = arr[x];
			arr[x] = temp;
		}
		Arrays.stream(arr).forEach(System.out::println);
	}
}
