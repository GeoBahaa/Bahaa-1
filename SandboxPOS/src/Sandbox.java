
public class Sandbox extends AbstractSandbox{

	public Sandbox (MainPanel mp) {
		super (mp);
		setup();
	}
	
	private void setup() {
		addButton("test", new TestTrans(mainPanel));
		addButton("readBarcode", new ReadBarcode(mainPanel));
	}
	
	
}
