import java.util.Date;

public class Vendor {

	private String vendName;
	
	private String vendAddress;
	
	private String vendPhone;
	
	private Date vendDateStart;
	
	private String vendCategory;
	
	
	public Vendor() {
	}
	
	public String getVendName() {
		return vendName;
		
	}
	
	public void setVendName (String vendName) {
		this.vendName = vendName;
		
	}
	
	public String getVendAddress() {
		return vendAddress;
		
	}
	public void setVendAddress (String vendAddress) {
		this.vendAddress = vendAddress;
		
	}
	
	public String getVendPhone() {
		return vendPhone;
		
	}
	public void setVendPhone (String vendPhone) {
		this.vendPhone = vendPhone;
		
	}
	public Date getVendDateStart() {
		return vendDateStart;
		
	}
	public void setVendDateStart (Date vendDateStart) {
		this.vendDateStart = vendDateStart;
		
	}
	
	public String VendCategory() {
		return vendCategory;
		
	}
	public void setVendCategory (String vendcategory) {
		this.vendCategory = vendCategory;
		
	}
}
