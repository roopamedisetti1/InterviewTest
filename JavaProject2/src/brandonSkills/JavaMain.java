package brandonSkills;

public class JavaMain {

	public static void main(String[] args) {
		Parser p=new Parser();
		SqlFunction s=new SqlFunction();
		p.parseXML(".\\resources\\gfInbound.xml");
		s.getSqlData("SELECT k.GF_Number,k.ACF_Application,k.ACF_Cust_FName,k.ACF_Cust_LName,k.ACF_Cust_SSN,k.ACF_Cust_BirthDate,k.Contract_Type,c.base_value,c.rate_adj,c.tot_rate_val,c.TEST_COLUMN\r\n" + 
				"  FROM [TRAVEL].[QALAB1].[Key_Data] k inner join [TRAVEL].[QALAB1].[ContractData] c  ON k.GF_Number=c.GF_Number");
		int gfNumber_Expected = p.getGfNumber();
		int acfApplication_Expected=p.getAcfApplication();
		String acfCustFName_Expected = p.getAcfCustFName();
	    String acfCustLName_Expected=p.getAcfCustLName();
	    int acfCustSSN_Expected=p.getAcfCustSSN();
	    String acfCustBirthDate_Expected=p.getAcfCustBirthDate();
	    String contractType_Expected=p.getContractType();
	    double baseValue_Expected=p.getBaseValue();
	    double rateAdj_Expected=p.getRateAdj();
	    double totRateVal_Expected=p.getTotRateVal();
	    
	    		
		 int gfNumber_Actual=s.getGFNumber();
		 int  acfApplication_Actual=s.getACFApplication();
		 String acfCustFName_Actual = s.getACFCustFName();
		 String acfCustLName_Actual=s.getACFCustLName();
		 int acfCustSSN_Actual=s.getsetACFCustSSN();
		 String acfCustBirthDate_Actual=s.getACFCustBirthDate();
		 String contractType_Actual=s.getContractType();
		 double baseValue_Actual=s.getbasevalue();
		 double rateAdj_Actual=s.getrateadj();
		 double totRateVal_Actual=s.gettotratval();
		    
		   	
		System.out.println("gfNumberExpected: "+ gfNumber_Expected);
		System.out.println("gfNumberActual: " +(gfNumber_Actual));
		if(gfNumber_Expected==gfNumber_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
				
		System.out.println("acfApplicationExpected: "+acfApplication_Expected );
		System.out.println("acfApplicationActual: "+acfApplication_Actual );
		
		if(acfApplication_Expected==acfApplication_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("acfCustFName_Expected: "+acfCustFName_Expected );
		System.out.println("acfCustFName_Actual: "+acfCustFName_Actual );
		
		if(acfCustFName_Expected.equals(acfCustFName_Actual))
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("acfCustLName_Expected: "+acfCustLName_Expected );
		System.out.println("acfCustLName_Actual: "+acfCustLName_Actual );
		if(acfCustLName_Expected.equals(acfCustLName_Actual))
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("acfCustSSN_Expected: "+acfCustSSN_Expected );
		System.out.println("acfCustSSN_Actual: "+acfCustSSN_Actual );
		if(acfCustSSN_Expected==acfCustSSN_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		
		System.out.println("acfCustBirthDate_Expected: "+acfCustBirthDate_Expected);
		System.out.println("acfCustBirthDate_Actual: "+acfCustBirthDate_Actual );
		

		if(acfCustBirthDate_Expected.equals(acfCustBirthDate_Actual))
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("contractType_Expected: "+contractType_Expected );
		System.out.println("contractType_Actual: "+contractType_Actual );
		if(contractType_Expected.equals(contractType_Actual))
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("baseValue_Expected: "+baseValue_Expected);
		System.out.println("baseValue_Actual: "+ baseValue_Actual );
		
		if(baseValue_Expected==baseValue_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("rateAdj_Expected: "+rateAdj_Expected);
		System.out.println("rateAdj_Actual: "+rateAdj_Actual);
		
		
		if(rateAdj_Expected==rateAdj_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		System.out.println("");
		System.out.println("totRateVal_Expected: "+totRateVal_Expected);
		System.out.println("totRateVal_Actual: "+totRateVal_Actual);
		

		if(totRateVal_Expected==totRateVal_Actual)
		{
			System.out.println("--***PASS***");
		}
		else
		{
			System.out.println("--***Fail***");
		}
		
		
		
		
		
		
		
	}

}
