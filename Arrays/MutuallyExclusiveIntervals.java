package com.indra.CodingPatterns.MergeIntervals;

import java.util.*;

class Interval {
	int start;
	int end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MutuallyExclusiveIntervals {
	public  static List<Interval> merge(List<Interval> intervals) {
		List<Interval> mergeIntervals = new ArrayList<Interval>();
		Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		Iterator<Interval> iterator = intervals.iterator();
		Interval interval = iterator.next();
		int start = interval.start;
		int end = interval.end;
		while (iterator.hasNext()) {
			interval = iterator.next();
			if (interval.start <= end) { // overlapping
				end = Math.max(interval.end, end);
			} else { // non overlapping, add the previous interval and reset
				mergeIntervals.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}
		mergeIntervals.add(new Interval(start, end));
		return mergeIntervals;
	}

	public static void main(String[] args) {
		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1,4));
		input.add(new Interval(2,5));
		input.add(new Interval(7,9));
		for (Interval interval : MutuallyExclusiveIntervals.merge(input))
		      System.out.print("[" + interval.start + "," + interval.end + "] ");
		    System.out.println();

	}

}
