
public class Jump {
public static void main(String[] args) {
	int []arr={1,3,5,8,9,2,6,7,6,8,9};
	System.out.println(wordLadder(arr));
}
//So the idea : minJumps(start, end) = min(minJumps(k, end) for all k reachable from start)
private static int wordLadder(int[] arr) {
	return minJumps(arr, 0, arr.length-1);
}
private static int minJumps(int[] arr, int i, int j) {
	// TODO Auto-generated method stub
	return 0;
}
}
