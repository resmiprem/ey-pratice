package Day13;

import java.util.Enumeration; 
import java.util.Iterator; 
import java.util.Vector; 
public class CollectionDemo2 { 
	public static void main(String[] args) {     
		Vector<String> v=new Vector<>();
		v.add("hello"); 
		v.add("world");
		v.add("hai");     
		System.out.println(v);   
		Enumeration<String> e=v.elements(); 
		Iterator<String> iter=v.iterator();
		v.add("world");
		
		while(e.hasMoreElements()) {     
	System.out.println("Enumerator...:"+e.nextElement());    
} 
while(iter.hasNext()) {
	System.out.println(iter.next());    }    
} }

