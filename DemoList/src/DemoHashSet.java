import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		
//		Arrays can contain primitives
//		Collection can contain only objects
//		any object ?? - Object(Super Class of all Classes)
//		List li = new List(); //Compilation error as List is an interface which can't be instantiated
		
		Set<String> li = new HashSet<>();
		
//		List li = new ArrayList();
		System.out.println(li.size());
		boolean result = li.add("S");	// string equals() method would be called internally to check before adding if this set
		System.out.println(result);
		result = li.add("S"); // won't be added as duplicate elements are not allowed in set
		System.out.println(result);
		li.add("P");
		li.add("Y");
		
//		The process of automatic conversion of primitive to respective wrapper object is
//		called "Boxing" OR "Auto-Boxing"
//		li.add(23); // int to Integer conversion is automatically happening (to Wrapper Objects)
		
//		The process of conversion of wrapper object to primitive data type is "Unboxing" or "Auto-unboxing"
//		int i = 21;
//		Integer iob = 23;
//		i = iob; // unboxing
		
		
//		Integer iobj = (Integer) li.get(4); // down-casting
//		Integer io = new Integer(90);
//		li.getIndexOf("A");
		System.out.println(li.size());
//		System.out.println(li.get(3));
//		System.out.println(li.set(3, "HSBC")); //replaces element at idx 3
		System.out.println(li.isEmpty());
		
		
	}

}
