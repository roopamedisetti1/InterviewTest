package MySampleProject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ContractData")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractData {
	
	//Contract Data
	
			@XmlElement
			private int base_value;
			
			@XmlElement
			private int rate_adj;
			
			@XmlElement
			private int tot_rate_val;
			
			@XmlElement
			private int test_column;
			
			

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
			
			
			

			@Override
			public String toString() {
				
				return  base_value + "" + rate_adj + "" + tot_rate_val + "" + test_column;
			}
			

}
