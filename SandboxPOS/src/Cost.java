import java.util.Date;

public class Cost {

	private String lastCost;
	
	private Product product;
	
	private Date receiveDate;
	
	private Vendor vendor;
	
	private String itemVendor;
	
	private int qtyReceived;
	
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
	public Vendor getVendor(){
		return vendor;
		
	}
	public void setVendor (Vendor vendor){
		this.vendor = vendor;
		
	}
    public Date ReceiveDate() {
	return receiveDate;
				
	}
	public void setReceiveDate (Date receiveDate) {
		this.receiveDate = receiveDate;
		
	}
	public String getItemVendor() {
		return itemVendor;
		
	}
	public void setItemVendor (String itemVendor) {
		this.itemVendor = itemVendor;
		
	}
	public int getQtyReceived() {
		return qtyReceived;
		
	}
	public void setQtyReceived (int qtyReceived) {
		this.qtyReceived = qtyReceived;
		
	}
	public double getReceivedCost() {
		return receivedCost;
		
	}
	public void setReceivedCost (double receivedCost) {
		this.receivedCost = receivedCost;
		
	}
}
