import java.util.ArrayList;

public class ProductRepo {
	
	// this is not a real repo it is just a simulation to be used without db connection
	
	MainPanel mainPanel;
	
	ArrayList<Product> products = new ArrayList<Product>(); 
	
	public ProductRepo (MainPanel mp) {
		mainPanel = mp;
		setupProducts();
	}
	
	public void addProduct (int barcode, String name, double price, int inventory) {
		Product product = new Product();
		product.setBarcode(barcode);
		product.setName(name);
		product.setPrice(price);
		product.setInventory(inventory);
		
		products.add(product);
	}
	
	public void setupProducts() {
		addProduct(1001, "Budwiser 12oz 6-Pack", 7.99, 50);
		addProduct(1002, "Budwiser 12oz 12-pack", 15.99, 30);
	}

}
