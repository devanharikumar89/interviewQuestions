class Complement {
	public static void main(String[] args) {
		int number = 12;// 1100
		System.out.println(complement(number));
	}

	private static int complement(int number) {
		int highestOneBit = Integer.highestOneBit(number);
		int allOnesMask = (highestOneBit << 1) - 1;
		return number ^ allOnesMask;
	}
}