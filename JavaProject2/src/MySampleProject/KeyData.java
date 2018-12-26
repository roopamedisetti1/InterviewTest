package MySampleProject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="KeyData")
@XmlAccessorType(XmlAccessType.FIELD)
public class KeyData {
	
	//Key data
	@XmlElement
	private int GF_Number;
	
	@XmlElement
	private int ACF_Application;
	
	@XmlElement
	private String ACF_CUST_Fname;
	
	@XmlElement
	private String ACF_CUST_Lname;
	
	@XmlElement
	private int ACF_CUST_SSN;
	
	@XmlElement
	private int ACF_CUST_BirthDate;
	
	@XmlElement
	private String Contract_Type;
	
	
	public int getGF_Number() {
		return GF_Number;
	}

	public void setGF_Number(int gF_Number) {
		GF_Number = gF_Number;
	}

	public int getACF_Application() {
		return ACF_Application;
	}

	public void setACF_Application(int aCF_Application) {
		ACF_Application = aCF_Application;
	}

	public String getACF_CUST_Fname() {
		return ACF_CUST_Fname;
	}

	public void setACF_CUST_Fname(String aCF_CUST_Fname) {
		ACF_CUST_Fname = aCF_CUST_Fname;
	}

	public String getACF_CUST_Lname() {
		return ACF_CUST_Lname;
	}

	public void setACF_CUST_Lname(String aCF_CUST_Lname) {
		ACF_CUST_Lname = aCF_CUST_Lname;
	}

	public int getACF_CUST_SSN() {
		return ACF_CUST_SSN;
	}

	public void setACF_CUST_SSN(int aCF_CUST_SSN) {
		ACF_CUST_SSN = aCF_CUST_SSN;
	}

	public int getACF_CUST_BirthDate() {
		return ACF_CUST_BirthDate;
	}

	public void setACF_CUST_BirthDate(int aCF_CUST_BirthDate) {
		ACF_CUST_BirthDate = aCF_CUST_BirthDate;
	}

	
	public String getContract_Type() {
		return Contract_Type;
	}

	public void setContract_Type(String contract_Type) {
		Contract_Type = contract_Type;
	}
	
	
	@Override
	public String toString() {
		
		return GF_Number+  "" + ACF_Application+ "" + ACF_CUST_Fname+ "" + ACF_CUST_Lname + "" + ACF_CUST_SSN + "" + ACF_CUST_SSN + "" + 
		ACF_CUST_BirthDate + "" + Contract_Type ;
	}
	

}
