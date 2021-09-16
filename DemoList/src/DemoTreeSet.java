import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
	
	public static void main(String[] args) {
		
//		Any object to be added in treeSet must be of Comparable Type
//		Set<Integer> set = new HashSet<Integer>();	//Unsorted , unordered
//		By default, Integer Wrapper class implements Comparable, that's why 
//		we're able to add Integers in treeSet
		Set<Integer> set = new TreeSet<Integer>(); // sorted and ordered by sorting
		set.add(88);
		set.add(22);
		set.add(81);
		set.add(-1);
		set.add(9);
		System.out.println(set);
		
	}
}
