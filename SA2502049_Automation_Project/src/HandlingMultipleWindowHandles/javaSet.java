package HandlingMultipleWindowHandles;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class javaSet {
	
	
	public static void main(String[] args) {
		
		
		Set<String> s = new HashSet<String>();
		
		
		System.out.println("set size "+ s.size());  // what is size 15 ?
		
		s.add("London");
		s.add("Nitin");
		s.add("India");
		s.add("London");
		
		
		
		System.out.println("set size "+ s.size());  // what is size 24 ?
		
							Iterator<String> it = s.iterator();
							
//							System.out.println(it.next());
//							System.out.println(it.next());
//							System.out.println(it.next());
							
							
							while(it.hasNext()) {
								System.out.println(it.next());
							}
		
		
		
		
	}

}
