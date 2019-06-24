package maps;
/*
 * Implement the isDisjoint() function to take two arrays
 * as input and check whether an array is a Disjoint of another given array.
 * */
import java.util.HashSet;
import java.util.Set;

public class Disjoint {
	public boolean isDisjoint(int [] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr1) {
			set.add(i);
		}
		for(int i : arr2) {
			if(set.contains(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Disjoint obj = new Disjoint();
		boolean found = obj.isDisjoint(new int[] {9,4,3,1,-2,6,5}, new int[] {1, 12});
		if(found) {
			System.out.println("Two arrays are disjoint");
		}else {
			System.out.println("Not disjoint");
		}
	}

}
