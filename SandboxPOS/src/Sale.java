import java.util.Date;

public class Sale {

	private Date saleDate;
	
	private Product product;
	
	private Cost cost;
	
	private Vendor vendor;
	
	public Date getSalesDate () {
		return saleDate;
		
	}
	public void setSaleDate (Date saleDate) {
		this.saleDate = saleDate;
		
	}
	public Product getProduct () {
		return product;
		
	}
	public void setProduct (Product product) {
		this.product = product;
		
	}
	public Cost getCost() {
		return cost;
		
	}
	public void setCost (Cost cost) {
		this.cost = cost;
		
	}
	public Vendor setVendor() {
		return vendor;
	}
	public void setVendor (Vendor vendor) {
		this.vendor = vendor;
		
	}
}
