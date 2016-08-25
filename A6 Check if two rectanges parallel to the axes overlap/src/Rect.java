/*Given the coordinates of the corners of two rectangles that
 are parallel to the axes, find if they overlap*/
public class Rect {
	public static void main(String[] args) {
		int oneleftx = 0, onelefty = 2, onerightx = 2, onerighty = 0, twoleftx = 3, twolefty = 2, tworightx = 5,
				tworighty = 0;
		System.out
				.println(doOverlap(oneleftx, onelefty, onerightx, onerighty, twoleftx, twolefty, tworightx, tworighty));
	}

	private static boolean doOverlap(int oneleftx, int onelefty, int onerightx, int onerighty, int twoleftx,
			int twolefty, int tworightx, int tworighty) {
		if (oneleftx > tworightx || onerightx < twoleftx) {
			return false;
		}
		if (onelefty < tworighty || onerighty > twolefty) {
			return false;
		}
		return true;
	}
}
