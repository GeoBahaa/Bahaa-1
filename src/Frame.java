import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setContentPane(new Panel());
		setMinimumSize(new Dimension(500,500));
		
	}

}
