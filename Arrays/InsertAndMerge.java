package com.indra.CodingPatterns.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a list of non-overlapping intervals sorted by their start time, 
 * insert a given interval at the correct position and merge all necessary 
 * intervals to produce a list that has only mutually exclusive intervals.
 * 
 * Input: Intervals=[[1,3], [5,7], [8,12]], New Interval=[4,6]
   Output: [[1,3], [4,7], [8,12]]
   Explanation: After insertion, since [4,6] overlaps with [5,7], 
   we merged them into one [4,7].
 * */

public class InsertAndMerge {
	public static List<Interval> merge(List<Interval> intervals, Interval newInterval) {
		List<Interval> mergeList = new ArrayList<Interval>();
		if (intervals == null || intervals.isEmpty()) {
			return Arrays.asList(newInterval);
		}
		/*
		 * Skip the intervals that end before interval starts and add it to the
		 * output list
		 */
		int i = 0;
		while (i < intervals.size() && intervals.get(i).end <= newInterval.start) {
			mergeList.add(intervals.get(i++));
		}
		/* Merge all intervals that overlap with new Interval */
		while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
			newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
			newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
			i++;
		}
		mergeList.add(newInterval);
		/* Add remaining elements to the list */
		while (i < intervals.size()) {
			mergeList.add(intervals.get(i++));
		}
		return mergeList;
	}

	public static void main(String[] args) {
		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(1, 3));
		input.add(new Interval(5, 7));
		input.add(new Interval(8, 12));
		Interval newInterval = new Interval(4, 6);
		for (Interval interval : InsertAndMerge.merge(input, newInterval))
			System.out.println(interval);

	}

}
