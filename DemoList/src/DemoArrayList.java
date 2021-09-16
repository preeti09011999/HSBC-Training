import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		
//		Arrays can contain primitives
//		Collection can contain only objects
//		any object ?? - Object(Super Class of all Classes)
//		List li = new List(); //Compilation error as List is an interface which can't be instantiated
		/** 
		 * The process of automatic conversion of primitive to respective wrapper object is	
		 * called "Boxing" OR "Auto-Boxing"
		 * The process of conversion of wrapper object to primitive data type is "Unboxing" or "Auto-unboxing"
		 * 
		 */
		
//		List li = new ArrayList();	//legacy code allowed but strongly not recommended this way
//		<> - generics added in jdk 1.5
		
		List<Integer> li = new ArrayList<>();
	
//		System.out.println(li.size());
//		li.add("S");
//		li.add("S"); // adding duplicate elements
//		li.add("P");
//		String str = li.get(0);
		li.add(0);
		li.add(-1);
		int i = li.get(0);
		Collections.sort(li); // Collections is a class, contains all static method
//		to deal with the list
//		li.add('Y');
//		String str = (String) li.get(3);	// it will give class cast exception
//		System.out.println(str);
		
//		auto-boxing		
//		li.add(23); // int to Integer conversion is automatically happening (to Wrapper Objects)
//		
//		int i = 21;
//		Integer iob = 23;
//		i = iob; // unboxing
//		
//		
//		Integer iobj = (Integer) li.get(4); // down-casting
////		Integer io = new Integer(90);
//		
//		System.out.println(li.size());
//		System.out.println(li.get(3));
//		System.out.println(li.set(3, "HSBC")); //replaces element at idx 3
//		System.out.println(li.isEmpty());
		
		
	}

}
