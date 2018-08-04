import javax.swing.JFrame;

public class Frame extends JFrame{
	
	JFrame window = new JFrame("welcome");
	
	public Frame(Panel p) {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setContentPane(p);
		window.pack();
	}
	

}
