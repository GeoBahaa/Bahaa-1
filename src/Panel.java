import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	public Panel() {
	JPanel nbPanel = new JPanel();
	nbPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	
	JPanel sbPanel = new JPanel();
	sbPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	JButton south = new JButton("South");
	
	}

}
