
public class TestTrans implements TransactionInterface {
	MainPanel mainPanel;
	public TestTrans (MainPanel mp) {
		mainPanel = mp;
	}

	public String doTransaction() {
		return "Test works";
	}
	
	public void onClick() {
		
	}

}
