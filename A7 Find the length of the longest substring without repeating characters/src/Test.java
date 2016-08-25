/*Keep a record of the last position of every variable
 * and when the variable is encountered again check if the current length
 * includes the previous index of the variable
 
 */
public class Test {
	public static void main(String[] args) {
		String str = "andmilestogobeforeisleep";
		System.out.println(lswrc(str));
	}

	private static int lswrc(String str) {
		
		//init
		
		if (str == null || str.length() == 0) {
			return -1;
		} else if (str.length() == 1) {
			return 1;
		}
		int max = 1;
		int[] lastKnownPosition = new int[26];
		for (int i = 0; i < lastKnownPosition.length; i++) {
			lastKnownPosition[i] = -1;
		}
		
		//starts here
		
		int currentLength = 1;
		int length = str.length();
		for (int i = 1; i < length; i++) {
			int prevIndex = lastKnownPosition[str.charAt(i)-'a'];
			if (prevIndex == -1 || i - currentLength > prevIndex) {
				currentLength += 1;
			} else {
				currentLength = i - prevIndex;
			}
			lastKnownPosition[str.charAt(i)-'a']=i;
			if(currentLength>max){
				max = currentLength;
			}
		}

		return max;
	}
}
