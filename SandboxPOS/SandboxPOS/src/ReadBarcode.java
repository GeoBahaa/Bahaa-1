import java.util.ArrayList;

public class ReadBarcode implements TransactionInterface {
	MainPanel mainPanel;
	public ReadBarcode (MainPanel mp) {
		mainPanel = mp;
	}

	public String doTransaction() {
		String barcodeString = mainPanel.inputBox.inputText.getText();
		mainPanel.inputBox.inputText.setText("");
		int bint;
		try {
		 bint= Integer.parseInt(barcodeString);
		} catch (Exception e) {
			return "barcode should be an four digit number";
		}
		ArrayList <Product> products = mainPanel.productRepo.products;
		for (int i =0; i<products.size(); i++) {
			if (bint == products.get(i).getBarcode()) {
				return products.get(i).getName();
			}
		}
		return "Barcode not found";
		
		
	}
	public void onClick() {
		
	}

}