
public class LCS {
	public static void main(String[] args) {
		String str1 = "algorithm";
		String str2 = "logarithm";
		lotlcs(str1, str2);

	}

	private static void lotlcs(String str1, String str2) {
		int a1 = str1.length();
		int a2 = str2.length();
		int[][] lcs = new int[a1 + 1][a2 + 1];
		for (int i = 0; i <= a1; i++) {
			for (int j = 0; j <= a2; j++) {
				if (i == 0 || j == 0) {
					lcs[i][j] = 0;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
				}
			}
		}
		System.out.println(lcs[a1][a2]);
	}
}
