public class Count {
	public static void main(String[] args) {
		String given = "ananda nadanam adi nan";
		String sub = "an";
		System.out.println(numOfOcc(given, sub));
	}

	private static int numOfOcc(String given, String sub) {
		int subLen = sub.length();

		int count = 0;
		for (int i = 0; i + subLen <= given.length(); i++) {
			String candidate = given.substring(i, i + subLen);;
			if (candidate.equals(sub)) {
				count++;
			}
		}
		return count;
	}
}
