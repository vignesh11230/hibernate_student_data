

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="college")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	
	private String c_name;
	private String address;
	private int percentage;

	public College(String c_name, String address, int percentage) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.address = address;
		this.percentage = percentage;
	}
	
	
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + ", Address=" + address + ", percentage=" + percentage
				+ "]";
	}
	
	
		
}