package maps;
/*
 * Implement the isSubset() function to take two arrays
 * as input and check whether an array is a subset of another given array.
 * */
import java.util.HashSet;
import java.util.Set;

public class ArraySubset {
	public boolean isSubset(int [] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr1) {
			set.add(i);
		}
		for(int i : arr2) {
			if(!set.contains(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ArraySubset obj = new ArraySubset();
		boolean found = obj.isSubset(new int[] {9,4,7,1,-2,6,5}, new int[] {7,1,-2});
		if(found) {
			System.out.println("Two arrays are subset");
		}else {
			System.out.println("Not subset");
		}
	}

}
