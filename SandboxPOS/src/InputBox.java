import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class InputBox extends JPanel{
	MainPanel mainPanel;
	JTextArea inputText = new JTextArea(1,50);
	JTextPane wordBox;
	

	public InputBox (MainPanel mPanel) {
		mainPanel = mPanel;
		JLabel inputLabel = new JLabel ("Input:");
		JPanel leftPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		leftPanel.add(inputLabel);
		centerPanel.add(inputText);
		add(leftPanel);
		add(centerPanel);
		
	}
	
	
}
