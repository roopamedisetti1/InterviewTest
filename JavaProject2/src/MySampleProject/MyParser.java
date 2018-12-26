//STEP 5- PARSE THE XML

package MySampleProject;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEvent;
import javax.xml.bind.ValidationEventHandler;


public class MyParser {
 
	
	
	public void parseXML(String mappingPath, String xmlPath) {
		
	 try {
			File file = new File(".\\resources\\employeedurga.xml");
			System.out.println(file.getAbsolutePath());
			
			JAXBContext jaxbContext = JAXBContext.newInstance(GFInbound.class);
	
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			GFInbound data = (GFInbound) jaxbUnmarshaller.unmarshal(file);
			
		
			
			 jaxbUnmarshaller.setEventHandler(
		                new ValidationEventHandler() {
		                    public boolean handleEvent(ValidationEvent event ) {
		                        throw new RuntimeException(event.getMessage(),
		                            event.getLinkedException());
		                    }
		                }
		            );
			
			System.out.println(data);
			
			KeyData key = data.getKeyData();
			
			System.out.println(data.getKeyData().getACF_CUST_Fname());
			
			System.out.println(data.getContractData().getBase_value());
		
		 } catch (JAXBException e) {
				e.printStackTrace();
		 }

	}




		
}
