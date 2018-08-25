import java.util.Date;

public class Product {
	
	private int barcode;
	
	private String name;
	
	private double price;
	
	private int inventory;
	
	private String vendor;
	
	private Date  receivedDate;
	
	
	
	public int getBarcode() {
		return barcode;
	}
	
	public void setBarcode (int barcode) {
		this.barcode = barcode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getInventory() {
		return inventory;
	}
	
	public void setInventory (int inv) {
		inventory = inv;
	}
	
	public String getVendor() {
		return vendor;
	}
	public void setVendor (String vendor) {
		this.vendor = vendor;
	
	}
	
	public Date getRecievedDate() {
		return receivedDate;
		
	}
	public void setReceivedDate (Date receivedDate) {
	 this.receivedDate = receivedDate;
	 
	}
}
