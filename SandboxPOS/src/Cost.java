import java.util.Date;

public class Cost {

	private String lastCost;
	
	private Product product;
	
	private Date receiveDate;
	
	private Vendor vendor;
	
	private int qtyRecevied;
	
	private double receivedCost;
	
	
	public Cost() {
	}
	
	
	public String getlastCost () {
		return lastCost;
		
	}
	
	
		public void setlastCost(String lastCost) {
			this.lastCost = lastCost;
			
	}
		
	public Product getProduct() {
		return product;
		
	}
	
	public void setProduct(Product product) {
		this.product = product;
		
	}
}
