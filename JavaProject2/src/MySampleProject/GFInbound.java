package MySampleProject;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement(name="GFInbound")
@XmlAccessorType(XmlAccessType.FIELD)
public class GFInbound {
	
	@XmlElement
	KeyData keyData;
	
	@XmlElement
	ContractData contractData;
	

		
		
		@Override
		public String toString() {
			
			return keyData+  "" + contractData + "";
		}
		
	
	  public KeyData getKeyData() {
		return keyData;
	}




	public void setKeyData(KeyData keyData) {
		this.keyData = keyData;
	}




	public ContractData getContractData() {
		return contractData;
	}




	public void setContractData(ContractData contractData) {
		this.contractData = contractData;
	}





		




}
