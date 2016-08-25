/*If there is a mapping already existing, it should not be broken
 The idea is to replace each letter by the first index of that letter in the same word
 and then compare the resulting strings in the end*/

public class Isomorphic {
	public static void main(String[] args) {
		String one = "DAD";
		String two = "MOM";
		System.out.println(isIsomorphic(one, two));
	}

	private static boolean isIsomorphic(String one, String two) {
		if (one == null && two == null) {
			return true;
		} else if (one == null || two == null) {
			return false;
		}
		if (one.length() != two.length()) {
			return false;
		}

		int[] lastIndex = new int[26];
		for (int j = 0; j < 26; j++) {
			lastIndex[j] = -1;
		}
		String temp1 = "", temp2 = "";
		for (int i = 0; i < one.length(); i++) {
			char a = one.charAt(i);
			if (lastIndex[a - 'A'] == -1) {
				lastIndex[a - 'A'] = i;
			}
			temp1 += lastIndex[a - 'A'];
		}
		for (int j = 0; j < 26; j++) {
			lastIndex[j] = -1;
		}

		for (int i = 0; i < two.length(); i++) {
			char a = two.charAt(i);
			if (lastIndex[a - 'A'] == -1) {
				lastIndex[a - 'A'] = i;
			}
			temp2 += lastIndex[a - 'A'];
		}
		return temp1.equals(temp2);
	}
}
