import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TransBox extends JPanel {
	MainPanel mainPanel;
	JPanel topPanel = new JPanel();
	JPanel bottomPanel = new JPanel();
	JScrollPane sp;
	
	public TransBox (MainPanel mPanel){
		setLayout(new BorderLayout());
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
	

		add(topPanel ,BorderLayout.PAGE_START);
		add(bottomPanel, BorderLayout.PAGE_END);
		
		}
		
	

	

}
