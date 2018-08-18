import java.util.ArrayList;

public class ChangeQuantity implements TransactionInterface {
	
	MainPanel mainPanel;
	int phase = 1;
	
	int toChange;
	
	public ChangeQuantity( MainPanel mp) {
		mainPanel = mp;
	}
	
	public String doTransaction() {
		if (phase==1) {
			return getBarcode();
		} if(phase ==2 ) {
		return changeQuantity();
		}else {
			return "This should be unreachable:: error at ChangeQuantity.java ln 20";
		}
	}
	
	public void onClick() {
		mainPanel.monitorBox.textBox.append(System.getProperty("line.separator")+"Enter Barcode");
	}
	
	public String getBarcode() {
		String barcodeString = mainPanel.inputBox.inputText.getText();
		mainPanel.inputBox.inputText.setText("");
		int bint = 0;
		try {
		 bint= Integer.parseInt(barcodeString);
		} catch (Exception e) {
			return "barcode should be an four digit number";
		}
		ArrayList <Product> products = mainPanel.productRepo.products;
		for (int i =0; i<products.size(); i++) {
			if (bint == products.get(i).getBarcode()) {
				toChange = i;
				phase =2;
				return "You've selected "+products.get(i).getName()+
						" to have quantity change"+ System.getProperty("line.separator")+
						"Please enter new quantity";
			}
		}
		return		"Barcode not found";
		
	}
	
	public String changeQuantity() {
		int change;
		String changeString;
		changeString = mainPanel.inputBox.inputText.getText();
		try {
			change = Integer.parseInt(changeString);
		} catch(Exception e) {
			return "you've not entered a number";
		}
		phase = 1;
		mainPanel.inputBox.inputText.setText("");
		mainPanel.productRepo.products.get(toChange).setInventory(change);	
		System.out.println(mainPanel.productRepo.products.get(toChange).getInventory());
		return "Quantity changed of "+ mainPanel.productRepo.products.get(toChange).getName()+
				" to " + change + System.getProperty("line.separator")+
				"**Enter new Barcode to continue changing quanities or change transaction**";
		
	}

}
