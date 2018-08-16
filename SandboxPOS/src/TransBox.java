import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TransBox extends JPanel implements ActionListener{
	MainPanel mainPanel;
	Button testButton = new Button("What a mess");
	JPanel newPanel = new JPanel();
	JScrollPane sp;
	
	public TransBox (MainPanel mPanel){
		setLayout(new BorderLayout());
		newPanel.setLayout(new BoxLayout(newPanel, BoxLayout.Y_AXIS));
		mainPanel = mPanel;
		newPanel.add(testButton);
		sp = new JScrollPane(newPanel);
	
		testButton.setActionCommand("halp");
		testButton.addActionListener(this);
		add(sp ,BorderLayout.CENTER);
		testclick();
		
		for (int i= 0; i<35; i++) {
			Button nb = new Button(String.valueOf(i));
			newPanel.add(nb);
			revalidate();
		}
		
	}
	

	
	public void testclick() {
		
	}
	public void actionPerformed (ActionEvent e) {
		
		if ("halp".equals(e.getActionCommand())) {
			mainPanel.monitorBox.textBox.append("\nHalp");
			for (int i = 0; i<100; i++) {
				mainPanel.monitorBox.textBox.append("\nHalp");
				mainPanel.monitorBox.textBox.setCaretPosition(
						mainPanel.monitorBox.textBox.getDocument().getLength());
			}
		
			 
		}
		
		
	}

}
