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
		addProduct(1001, "Budwiser 12oz 6-pack", 7.99, 50);
		addProduct(1002, "Budwiser 12oz 12-pack", 15.99, 30);
		addProduct(1003, "Budwiser 24oz single", 2.99, 30);
		addProduct(1004, "Coors 12oz 6-pack", 7.99, 34);
		addProduct(1005, "Coors 12oz 12-pack, 15.99, 24);
		addProduct(1006, "Coors 24oz single", 2.99, 28);
		addProduct(1007, "Titos 0.75L - Vodka", 22.99, 14);
	}

}
