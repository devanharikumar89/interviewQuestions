import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Points {
	public static void main(String[] args) {
		Point[] points = { new Point(1, 2), new Point(1, 2), new Point(3, 2), new Point(1, 3), new Point(1, 0),
				new Point(3, 2), new Point(1, -2), new Point(-1, 2), new Point(0, 2), new Point(1, 4), new Point(1, 20),
				new Point(1, -2), new Point(-1, -2), new Point(10, 2), new Point(7, 2), };
		int k = 5;
		getMinKPoints(points, k);
	}

	private static void getMinKPoints(Point[] points, int k) {
		Queue<Point> maxheap = new PriorityQueue<Point>(k, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				double disto1 = Math.pow(o1.x, 2) + Math.pow(o1.y, 2);
				double disto2 = Math.pow(o2.x, 2) + Math.pow(o2.y, 2);
				return (int) (disto2 - disto1);
			}

		});
		for (int i = 0; i < k; i++) {
			maxheap.add(points[i]);
		}
		for (int i = k; i < points.length; i++) {
			Point p = maxheap.peek();
			double distp = Math.pow(p.x, 2) + Math.pow(p.y, 2);
			double distthis = Math.pow(points[i].x, 2) + Math.pow(points[i].y, 2);
			if (distthis < distp) {
				maxheap.poll();
				maxheap.add(points[i]);
			}
		}
		for(Point p : maxheap){
			System.out.println(p.x+" "+p.y);
		}
	}
}
