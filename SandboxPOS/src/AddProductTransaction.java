
public class AddProductTransaction implements TransactionInterface {
	
	public String doTransaction() {
		return "hi";
	}
	
	public void onClick() {
		new AddProductPopup();
	}

}
