package com.indra.CodingPatterns.TopKElements;

import java.util.*;

/*
 * Given an array of points in the a 2D plane, find ‘K’ closest points to 
 * the origin.
 * 
 * Input: points = [[1,2],[1,3]], K = 1
   Output: [[1,2]]
   Explanation: The Euclidean distance between (1, 2) and the origin is sqrt(5).
   The Euclidean distance between (1, 3) and the origin is sqrt(10).
   Since sqrt(5) < sqrt(10), therefore (1, 2) is closer to the origin.
   
   TimeComplexity for the solution is O (K+(N−K)∗logK)
* */
class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int distanceFromOrigin() {
		// ignoring square root in eculidean formulae (Sqrt(x^2 + y^2))
		return (x * x) + (y * y);
	}
}

public class KClosePointsToOrigin {
	public List<Point> closeToOrigin(Point[] points, int k) {
		PriorityQueue<Point> maxHeap = new PriorityQueue<>(
				(p1, p2) -> p2.distanceFromOrigin() - p1.distanceFromOrigin());
		// add k points to the maxHeap
		for (int i = 0; i < k; i++) {
			maxHeap.add(points[i]);
		}
		// find distance to origin for other points and compare with the value
		// in the queue if other points are less in distance to origin than the
		// element in the
		// queue, remove it and add new Close to origin point in maxHeap.
		for (int i = k; i < points.length; i++) {
			if (points[i].distanceFromOrigin() < maxHeap.peek().distanceFromOrigin()) {
				maxHeap.poll();
				maxHeap.add(points[i]);
			}
		}
		return new ArrayList<>(maxHeap);
	}

	public static void main(String[] args) {
		Point[] points = new Point[] { new Point(1, 3), new Point(3, 4), new Point(2, -1) };
		List<Point> result = new KClosePointsToOrigin().closeToOrigin(points, 2);
		System.out.print("Here are the k points closest the origin: ");
		for (Point p : result)
			System.out.print("[" + p.x + " , " + p.y + "] ");
	}

}
