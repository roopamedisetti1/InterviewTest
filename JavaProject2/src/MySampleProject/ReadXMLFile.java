//package com.gmf;

package MySampleProject;

import java.io.*;
import java.util.*;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;



public class ReadXMLFile {
	
	
	public void parseXML ()
	{
	//create a StreamFactory
			StreamFactory factory = StreamFactory.newInstance ();
			
			
			//load the mapping file
			factory.load ("Newfile.xml");
			
			// use a StreamFactory to create a BeanReader
			
			BeanReader in = factory.createReader ("employeeFile", new File ("employeedurga.xml"));
			
			//Employee employee;
			//while ((employee = (EmployeeDurga) in.read ()) ! = null) {
				//process the employee
			//}
				
				
			//System.out.println(employee.GF_Number);


}
}