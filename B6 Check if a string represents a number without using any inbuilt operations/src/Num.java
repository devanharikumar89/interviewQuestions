import java.util.HashSet;
import java.util.Set;

//often forgotten : the number cannot end with a dot either
public class Num {
	public static void main(String[] args) {
		String str = "+12.";
		System.out.println(isNumber(str));
	}

	private static boolean isNumber(String str) {
		boolean foundPoint = false;
		Set<Character> allowed = new HashSet<Character>();
		allowed.add('+');
		allowed.add('-');
		allowed.add('.');
		allowed.add('0');
		allowed.add('1');
		allowed.add('2');
		allowed.add('3');
		allowed.add('4');
		allowed.add('5');
		allowed.add('6');
		allowed.add('7');
		allowed.add('8');
		allowed.add('9');

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (!allowed.contains(a)) {
				return false;
			}
			if (a == '.') {
				if (foundPoint || i == str.length() - 1) {// very important
					return false;
				} else {
					foundPoint = true;
				}
			} else if (a == '-' || a == '+') {
				if (i != 0) {
					return false;
				}
			}

		}
		return true;
	}
}
