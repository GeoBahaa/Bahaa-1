import java.util.ArrayList;
import java.util.Date;

public class Repository {
	
	// this is not a real repo it is just a simulation to be used without db connection
	
	MainPanel mainPanel;
	
	ArrayList<Product> products = new ArrayList<Product>();
	ArrayList<Cost> costs = new ArrayList<Cost>();
	ArrayList<Vendor> vendors = new ArrayList<Vendor>();
	ArrayList<Sales> saless = new ArrayList<Sales>();
	
	
	
	
	public Repository (MainPanel mp) {
		mainPanel = mp;
		setupProducts();
		setupVendor();
		setupCost();
		setupSales();
		
		
	}
	
	public void addCost (String lastCost, Date receiveDate, String itemVendor, int qtyReceived, double receivedCost, Product product, Vendor vendor) {
		Cost cost = new Cost();
		cost.setlastCost(lastCost);
		cost.setReceiveDate(receiveDate);
		cost.setItemVendor(itemVendor);
		cost.setQtyReceived(qtyReceived);
		cost.setReceivedCost(receivedCost);
		cost.setProduct(product);
		cost.setVendor(vendor);
		
		costs.add(cost);
		
	}
	
	public void setupCost() {
		addCost("24.5",new Date(),"Coors",3,25.5, products.get(0), vendors.get(0));
	}
	
	
	
	
	public void addProduct (int barcode, String name, double price, String itemNo, String category) {
		Product product = new Product();
		product.setBarcode(barcode);
		product.setName(name);
		product.setPrice(price);
		product.setItemNo(itemNo);
		product.setCategory(category);
		
		
		products.add(product);
	}
	
	public void setupProducts() {
		addProduct(1001, "test", 0.00, "0", "test");
		

	}
	
	public void addVendor  (String vendName, String vendAddress, String vendPhone, Date vendDateStart, String vendCategory) {
		Vendor vendor = new Vendor();
		vendor.setVendName(vendName);
		vendor.setVendAddress(vendAddress);
		vendor.setVendPhone(vendPhone);
		vendor.setVendDateStart(vendDateStart);
		vendor.setVendCategory(vendCategory);
		
		vendors.add(vendor);
		
	}
	

	public void setupVendor() {
		addVendor("Coors", "Greenwood Village", "7205836733", new Date(), "Beer");
		
	}
	
	public void addSales (Date SaleDate, Product product, Cost cost, Vendor vendor ) {
		Sales sales = new Sales();
		sales.setSaleDate(SaleDate);
		sales.setCost(cost);
		sales.setProduct(product);
		sales.setVendor(vendor);
		
		saless.add(sales);
		
		
	}
	
	public void setupSales() {
	    addSales(new Date(), costs.get(0), products.get(0), vendors.get(0));
	
}
}