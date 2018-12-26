package MySampleProject;

public class EmployeeDurga {
	
	//Key data
	
	private int GF_Number;
	private int ACF_Application;
	private String ACF_CUST_Fname;
	private String ACF_CUST_Lname;
	private int ACF_CUST_SSN;
	private int ACF_CUST_BirthDate;
	private String Contract_Type;
	
	//Contract Data
	
	private int base_value;
	private int rate_adj;
	private int tot_rate_val;
	private int test_column;
	
	@Override
		public String toString() {
		
		return GF_Number+  "" + ACF_Application+ "" + ACF_CUST_Fname+ "" + ACF_CUST_Lname + "" + ACF_CUST_SSN + "" + ACF_CUST_SSN + "" + 
		ACF_CUST_BirthDate + "" + Contract_Type + "" + base_value + "" + rate_adj + "" + tot_rate_val + "" + test_column;
	}
	
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

	public int getBase_value() {
		return base_value;
	}

	public void setBase_value(int base_value) {
		this.base_value = base_value;
	}

	public int getRate_adj() {
		return rate_adj;
	}

	public void setRate_adj(int rate_adj) {
		this.rate_adj = rate_adj;
	}

	public int getTot_rate_val() {
		return tot_rate_val;
	}

	public void setTot_rate_val(int tot_rate_val) {
		this.tot_rate_val = tot_rate_val;
	}

	public int getTest_column() {
		return test_column;
	}

	public void setTest_column(int test_column) {
		this.test_column = test_column;
	}
	

}
