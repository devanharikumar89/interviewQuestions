import java.util.HashMap;
import java.util.Map;

public class RationalNumber {
	public static void main(String[] args) {
		int numerator = 1007;
		int denominator = 70;
		System.out.println(frac(numerator, denominator));
	}

	private static String frac(int numerator, int denominator) {
		String prefix = String.valueOf(numerator / denominator);
		String suffix = "";
		Map<Integer, Integer> remainderMap = new HashMap<Integer, Integer>();

		int remainder = numerator % denominator;
		int quotient = 0;
		int location = 0;
		while (true) {
			if (remainderMap.keySet().contains(remainder)) {
				int indexOfOpeningBracket = remainderMap.get(remainder);
				StringBuilder a = new StringBuilder(suffix).insert(indexOfOpeningBracket + 1, '(');
				return prefix + a.toString() + ")";
			} else {
				remainderMap.put(remainder, location++);
				while (denominator > remainder) {
					remainder *= 10;
				}
				quotient = remainder / denominator;
				if (suffix.equals("")) {
					suffix = "." + String.valueOf(quotient);
				} else {
					suffix += String.valueOf(quotient);
				}
			}

			remainder = remainder % denominator;

		}
	}
}
