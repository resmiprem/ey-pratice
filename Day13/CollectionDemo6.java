package Day13;

import java.io.FileInputStream;
import java.util.Enumeration; 
import java.util.Hashtable;
import java.util.Properties; 
public class CollectionDemo6 { 
	public static void main(String[] args)throws Exception {   
		Properties prop=new Properties(); //  prop.put("a1", "hello");

prop.load(new FileInputStream("abc.properties"));   
Enumeration e=prop.elements();
while(e.hasMoreElements()) {       
	String value1=(String)e.nextElement();   
	String value2=prop.getProperty("a1");      
	String value3=prop.getProperty("a2");     
System.out.println(value1+":"+value2 +":"+value3);       }    } } 

