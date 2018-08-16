import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Frame extends JFrame{
	
	public Frame () {
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setContentPane(new MainPanel());
	}
}