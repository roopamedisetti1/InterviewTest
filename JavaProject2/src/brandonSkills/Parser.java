package brandonSkills;


import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parser {
	private int gfNumber;
	private int acfApplication;
	//private String acfApplication;
	private String acfCustFName;
	private String acfCustLName;
	private int acfCustSSN;
	private String acfCustBirthDate;
	private String contractType;
	private double baseValue;
	private double rateAdj;
	private double totRateVal;
	

	public void parseXML(String filePath) 
	{
		
		
		try 
		{
			filePath=".\\resources\\gfInbound.xml";
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			Document document  =builder.parse(".\\resources\\gfInbound.xml");
		
			NodeList gfInboundList = document.getElementsByTagName("GFInbound");
			
			for(int i = 0; i < gfInboundList.getLength(); i++) {
				Node gfi = gfInboundList.item(i);
				if(gfi.getNodeType() == Node.ELEMENT_NODE) {
					Element gfiInbound = (Element) gfi;
					
					NodeList gfNumber = gfiInbound.getElementsByTagName("gfNumber");
					//System.out.println(gfNumber.item(i).getTextContent());
					setGfNumber(Integer.parseInt(gfNumber.item(i).getTextContent()));
					//getGfNumber();
					//System.out.println(getGfNumber());
					
					NodeList acfApplication = gfiInbound.getElementsByTagName("acfApplication");
					setAcfApplication(Integer.parseInt(acfApplication.item(i).getTextContent()));
					//System.out.println(acfApplication.item(i).getTextContent());
					
					NodeList acfCustFName = gfiInbound.getElementsByTagName("acfCustFName");
					setAcfCustFName(acfCustFName.item(i).getTextContent());
					//System.out.println(acfCustFName.item(i).getTextContent());
					
					
					
					NodeList acfCustLName = gfiInbound.getElementsByTagName("acfCustLName");
					setAcfCustLName(acfCustLName.item(i).getTextContent());
					//System.out.println(acfCustLName.item(i).getTextContent());
					
					
					NodeList acfCustSSN = gfiInbound.getElementsByTagName("acfCustSSN");
					setAcfCustSSN(Integer.parseInt(acfCustSSN.item(i).getTextContent()));
					//System.out.println(acfCustSSN.item(i).getTextContent());
					
					NodeList acfCustBirthDate = gfiInbound.getElementsByTagName("acfCustBirthDate");
					setAcfCustBirthDate(acfCustBirthDate.item(i).getTextContent());
					//System.out.println(acfCustBirthDate.item(i).getTextContent());
					
					NodeList contractType = gfiInbound.getElementsByTagName("contractType");
					setContractType(contractType.item(i).getTextContent());
					//System.out.println(contractType.item(i).getTextContent());
					
					NodeList baseValue = gfiInbound.getElementsByTagName("baseValue");
					setBaseValue(Double.parseDouble(baseValue.item(i).getTextContent()));
					//System.out.println(baseValue.item(i).getTextContent());
					
					NodeList rateAdj = gfiInbound.getElementsByTagName("rateAdj");
					setRateAdj(Double.parseDouble(rateAdj.item(i).getTextContent()));
					//System.out.println(rateAdj.item(i).getTextContent());
					
					NodeList totRateVal = gfiInbound.getElementsByTagName("totRateVal");
					setTotRateVal(Double.parseDouble(totRateVal.item(i).getTextContent()));
					//System.out.println(totRateVal.item(i).getTextContent());*/
				}
					
				}
		}
		
		 catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

		
		

	public int getGfNumber() {
		return  gfNumber;
	}

	private void setGfNumber(int gfNumber) {
		this.gfNumber = gfNumber;
	}


	public int getAcfApplication() {
		return acfApplication;
	}

	private  void setAcfApplication(int acfApplication) {
		this.acfApplication = acfApplication;
	}
	public String getAcfCustFName() {
		return acfCustFName;
	}

	private  void setAcfCustFName(String acfCustFName) {
		this.acfCustFName = acfCustFName;
		
	}
	
	public String getAcfCustLName() {
		return acfCustLName;
	}

	private  void setAcfCustLName(String acfCustLName) {
		this.acfCustLName = acfCustLName;
}
	
	public int getAcfCustSSN() {
		return acfCustSSN;
	}

	private  void setAcfCustSSN(int acfCustSSN) {
		this.acfCustSSN = acfCustSSN;
}
	public String getAcfCustBirthDate() {
		return acfCustBirthDate;
	}

	private  void setAcfCustBirthDate(String acfCustBirthDate) {
		this.acfCustBirthDate = acfCustBirthDate;
}
	public String getContractType() {
		return contractType;
	}

	private  void setContractType(String contractType) {
		this.contractType = contractType;
}
	public double getBaseValue() {
		return baseValue;
	}

	private  void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
}
	public double getRateAdj() {
		return rateAdj;
	}

	private  void setRateAdj(double rateAdj) {
		this.rateAdj = rateAdj;
}
	
	public double getTotRateVal() {
		return totRateVal;
	}

	private  void setTotRateVal(double totRateVal) {
		this.totRateVal = totRateVal;
}
}

	

