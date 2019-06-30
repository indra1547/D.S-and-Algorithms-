package com.indra.CodingPatterns.MergeIntervals;

/*
Problem Statment: Given a list of intervals, merge all the overlapping intervals to produce a list that has only mutually 
exclusive intervals.

Intervals: [[1,4], [2,5], [7,9]]
Output: [[1,5], [7,9]]
Explanation: Since the first two intervals [1,4] and [2,5] overlap, we merged them into one [1,5].
*/

/*
Algorithm:
1. Sort the intervals on the start time to ensure a.start <= b.start
2. If ‘a’ overlaps ‘b’ (i.e. b.start <= a.end), we need to merge them into a new interval ‘c’ such that:
    c.start = a.start
    c.end = max(a.end, b.end)
3. We will keep repeating the above two steps to merge ‘c’ with the next interval if it overlaps with ‘c’.

*/

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
