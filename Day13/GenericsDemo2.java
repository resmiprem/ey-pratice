package Day13;

public class GenericsDemo2 {
	public <E> E getObject(E[] elements){
		for(E element:elements) {         
			System.out.println(element);       } 
		return null;    }
	public static void main(String[] args) {      
		GenericsDemo2 obj=new GenericsDemo2();
		obj.getObject(new String[] {"a","b","c"}); 
		obj.getObject(new Integer[] {1,2,3,4});    } }
class Test { }
	
