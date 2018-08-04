import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener{
	JPanel panel = new JPanel();
	Message message = new Message("Hello World");
	JButton okButton = new JButton("ok");
	JButton cancelButton = new JButton("cancel");
	
	public Panel () {
		JLabel label = new JLabel(message.words);
		panel.add(label);
		
		okButton.setActionCommand("ok");
		okButton.addActionListener(this);
		
		
		panel.add(okButton);
		
		cancelButton.setActionCommand("cancel");
		cancelButton.addActionListener(this);
		
		panel.add(cancelButton);
		
		add(panel);
		
	}
	
	public void actionPerformed (ActionEvent e) {
		
		if ("ok".equals(e.getActionCommand())) {
			JOptionPane.showMessageDialog(null, "Thank You");
			 
		}
		
		if ("cancel".equals(e.getActionCommand())) {
			System.exit(0);
		}
		
	}

}
