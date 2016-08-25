import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergeIntervals {
	public static void main(String[] args) {
		// [-10,-1],[0,2],[4,10],[-5,1] => [-10,2],[4,10]
		Interval[] intervals = { new Interval(-10, -1), new Interval(0, 2), new Interval(4, 10), new Interval(-5, 1) };
		merge(intervals);
	}

	private static void merge(Interval[] intervals) {
		// sort the items based on start times
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});
		List<Interval> list = new ArrayList<Interval>();
		list.add(intervals[0]);
		Interval last = intervals[0];
		for (int i = 1; i < intervals.length; i++) {
			Interval current = intervals[i];
			if (current.start < last.end) {
				last.end = current.end;
				continue;
			}
			list.add(intervals[i]);
			last = intervals[i];
		}
		list.stream().forEach(k->System.out.println(k.start+" "+k.end));
	}
}
