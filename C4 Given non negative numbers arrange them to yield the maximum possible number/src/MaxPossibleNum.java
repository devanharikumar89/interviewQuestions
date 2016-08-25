import java.util.Arrays;
import java.util.Comparator;

/*example : 3 30 34 5 9
  answer : 9534330*/

//The idea is that we need some sort of radix sort here

public class MaxPossibleNum {
	public static void main(String[] args) {

		Integer[] arr = { 3, 30, 34, 5, 9 };
		System.out.println(printLargest(arr));
	}

	private static String printLargest(Integer[] arr) {
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer one, Integer two) {
				String _one = String.valueOf(one);
				String _two = String.valueOf(two);
				if (Integer.parseInt(_one + _two) > Integer.parseInt(_two + _one)) {
					return -1;
				} else {
					return 1;
				}
			}
		});

		/*
		 * DON'T use a string and just append to it with +=. This sends the GC
		 * through the roof because you're creating and throwing away as many
		 * string objects as you have items in your array.
		 */

		StringBuilder out = new StringBuilder();
		for (Integer a : arr) {
			out.append(String.valueOf(a));
		}
		return out.toString();
	}
}
