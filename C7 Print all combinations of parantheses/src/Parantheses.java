class Parantheses {
	public static void main(String[] args) {
		int number = 10;
		printRecur(0, 0, number, "");
	}

	private static void printRecur(int open, int close, int number, String sb) {
		if (close > open || open > number) {
			return;
		} else {
			if (close == number) {
				System.out.println(sb.toString());
			} else {
				printRecur(open + 1, close, number, sb + "{");
				printRecur(open, close + 1, number, sb + "}");
			}
		}
	}
}