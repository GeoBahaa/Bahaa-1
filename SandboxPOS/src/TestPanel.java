import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestPanel extends JPanel implements ActionListener{
	JPanel panel = new JPanel();
	JButton okButton = new JButton("ok");
	JButton cancelButton = new JButton("cancel");
	
	public TestPanel () {
		JLabel label = new JLabel("test");
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