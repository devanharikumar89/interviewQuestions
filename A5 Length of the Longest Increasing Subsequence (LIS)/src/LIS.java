import java.util.Arrays;

/*L(i)={1+Max(L(j))}, where j<i and arr[j]<arr[i]
 If there is no such j then L(i) = 1*/

public class LIS {
	public static void main(String[] args) {
		int arr[] = { 1, 18, 2, 10, 3, 9, 4, 5 };
		System.out.println(lis(arr));
	}

	static int lis(int[] arr) {
		int[] lis = new int[arr.length];
		lis[0] = 1;
		for (int i = 1; i < lis.length; i++) {
			for (int j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
					lis[i] = lis[j] + 1;
				}
		}
		return Arrays.stream(lis).max().orElse(-1);
	}
}
