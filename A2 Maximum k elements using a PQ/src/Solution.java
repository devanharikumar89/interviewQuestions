import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*We need the maximum elements and hence we use min priority queue
We keep the capacity of the queue as k and then add the first k 
elements into it. Then from the next element until the last element 
we compare the value with the root of the min heap and replace it if
the root is less than the value in the array */


public class Solution {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 76, 3, 2, 67, 30, 12, 72 };
		int k = 4;
		printNumbers(arr, k);
	}

	//Please note that we do not need the comparator here because it is by default a min q.
	private static void printNumbers(int[] arr, int k) {
		Queue<Integer> minQ = new PriorityQueue<>(k, new Comparator<Integer>() {
			@Override
			public int compare(Integer one, Integer two) {
				return one - two;
			}
		});
		for (int i = 0; i < k; i++) {
			minQ.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > minQ.peek()) {
				minQ.poll();
				minQ.add(arr[i]);
			}
		}
		for(Integer a : minQ){
			System.out.println(a);
		}
	}
}
