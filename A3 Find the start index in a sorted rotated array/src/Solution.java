/* Given an array that is sorted and rotated you have to
 find the start of the rotation. The following example shows the max element in the array*/
public class Solution {
	public static void main(String[] args) {
		int[] arr = { 6, 1, 2, 3, 4, 5 };
		System.out.println(findPivot(arr, 0, arr.length-1));
	}

	static int findPivot(int arr[], int low, int high)
	{
	   // base cases
	   if (high < low)  return -1;
	   if (high == low) return low;
	 
	   int mid = (low + high)/2;   /*low + (high - low)/2;*/
	   if (mid < high && arr[mid] > arr[mid + 1])
	       return mid;
	   if (mid > low && arr[mid] < arr[mid - 1])
	       return (mid-1);
	   if (arr[low] >= arr[mid])
	       return findPivot(arr, low, mid-1);
	   return findPivot(arr, mid + 1, high);
	}
}
