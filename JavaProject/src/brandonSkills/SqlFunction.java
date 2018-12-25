package brandonSkills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlFunction 
{
	
	private int GFNumber;
	private int ACFApplication;
	private String ACFCustFName;
	private String ACFCustLName;
	private int ACFCustSSN;
	private String ACFCustBirthDate;
	private String ContractType;
	private double basevalue;
	private double rateadj;
	private double totratval;
	

      
	public void getSqlData(String query)
	{
          
             try {
                     
                                        
                     String sqlConnectionString = "jdbc:sqlserver://CDVSQLCSITX2001\\CORESERVICES:53316;" + "databaseName=travel;integratedSecurity=true;";
                     
                     String sqlDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
                                                           
                     Class.forName(sqlDriver);
                     
                     Connection conn = DriverManager.getConnection(sqlConnectionString);
                     
                     PreparedStatement stmt = conn.prepareStatement(query);
                     
                     ResultSet rs = stmt.executeQuery();
                     
                    
                           while (rs.next()){
                                                      	   
                        	   setGFNumber(rs.getInt(1));
                        	   setACFApplication(rs.getInt(2));
                        	   setACFCustFName(rs.getString(3));
                        	   setACFCustLName(rs.getString(4));
                        	   setACFCustSSN(rs.getInt(5));
                        	   setACFCustBirthDate(rs.getString(6));
                        	   setContractType(rs.getString(7));
                        	   setbasevalue(rs.getDouble(8));
                        	   setrateadj(rs.getDouble(9));
                        	   settotratval(rs.getInt(10));
                        	   
                                 
                               }
                                                                    
                                             
                     rs.close();
                     stmt.close();      
                     conn.close();  
              }
                  
                       
              catch (Exception e) {
                     System.out.println(e);
              }
             
             
             
       }
	
	
	
	public int getGFNumber() {
		return  GFNumber;
	}

	private void setGFNumber( int GFNumber) {
		this.GFNumber= GFNumber;
	}
	
	public int getACFApplication() {
		return  ACFApplication;
	}

	private void setACFApplication( int ACFApplication) {
		this.ACFApplication= ACFApplication;
	}
	public String getACFCustFName() {
		return  ACFCustFName;
	}

	private void setACFCustFName( String ACFCustFName) {
		this.ACFCustFName= ACFCustFName;
	}
	public String getACFCustLName() {
		return  ACFCustLName;
	}

	private void setACFCustLName( String ACFCustLName) {
		this.ACFCustLName= ACFCustLName;
	}
	public int getsetACFCustSSN() {
		return  ACFCustSSN;
	}

	private void setACFCustSSN( int setACFCustSSN) {
		this.ACFCustSSN= setACFCustSSN;
	}
	public String getACFCustBirthDate() {
		return  ACFCustBirthDate;
	}

	private void setACFCustBirthDate( String ACFCustBirthDate) {
		this.ACFCustBirthDate= ACFCustBirthDate;
	}
	public String getContractType() {
		return  ContractType;
	}

	private void setContractType( String ContractType) {
		this.ContractType= ContractType;
	}
	public double getbasevalue() {
		return  basevalue;
	}

	private void setbasevalue( double basevalue) {
		this.basevalue= basevalue;
	}
	public double getrateadj() {
		return  rateadj;
	}

	private void setrateadj( double rateadj) {
		this.rateadj= rateadj;
	}
	public double gettotratval() {
		return  totratval;
	}

	private void settotratval( double totratval) {
		this.totratval= totratval;
	}
}





