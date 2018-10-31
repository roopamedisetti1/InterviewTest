package Sample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Iterator;
import java.util.List;


public class RunThis {
	
	
	 public static void main(String[] args) {
		 
		 Scanner s = new Scanner(System.in);
		 
		 System.out.print("Enter String  one and two to match have space between string 1 and string 2 => ");
		 
		  String one = s.next(); // your first string
		  
		  System.out.println("one argument " +one);	  
	
		  
		  String two = s.next();  //=="two"
		  
		  System.out.println("Seond argumanet " +two);
		  
		  String pattern = "(\\d+)"+two;
		  
		  // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(one);
	      
	      String toPrintOut = one.replaceAll("[^0-9]", "");
		  
	      if (m.find( )) {
	          System.out.println("Found value: " + m.group(0) );
	          System.out.println(toPrintOut + ", " + two + " true ");
	         
	       }else {
	          System.out.println(toPrintOut + ", " + two + " false ");
	       }
	      
	   
	   
	     

	 }
	
	

}
