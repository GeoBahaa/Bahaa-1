import java.util.Date;

public class Product {
	
	private int barcode;
	
	private String name;
	
	private double price;
	
	private String itemNo;
	
	public Product () {
		
	}
	
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
	
	
	
	public String getItemNo() {
		return itemNo;
		
	}
	
	public void setItemNo (String itemNo) {
		this.itemNo = itemNo;
		
	}
	
}
