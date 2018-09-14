import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public abstract class AbstractSandbox {
	ArrayList <JRadioButton> rButtons = new ArrayList<JRadioButton>();
	MainPanel mainPanel;
	TransactionInterface currentTransaction;
	
	
	public AbstractSandbox(MainPanel mp) {
		mainPanel = mp;
		JButton newButton = new JButton("Run");
		newButton.addActionListener(new ActionListener() {

			   @Override
			   public void actionPerformed(ActionEvent e) {
				   runCommand();
			   }
			});
		mainPanel.transBox.bottomPanel.add(newButton);
		
	}
	
	public void runCommand() {
		   mainPanel.monitorBox.textBox.append(System.getProperty("line.separator")
				   +currentTransaction.doTransaction());
		   mainPanel.monitorBox.textBox.setCaretPosition(
					mainPanel.monitorBox.textBox.getDocument().getLength());
	   }		
	
	protected void addButton(String bname, TransactionInterface tI) {
		JRadioButton newButton = new JRadioButton(bname);
		rButtons.add(newButton);
		newButton.addActionListener(new ActionListener() {

			   @Override
			   public void actionPerformed(ActionEvent e) {
				   currentTransaction = tI;
				   tI.onClick();
				   for (int i = 0; i<rButtons.size(); i++) {
					   if (rButtons.get(i) == newButton) {
						   
					   }else {
						   rButtons.get(i).setSelected(false);
					   }
				   }
			   }
			});
		mainPanel.transBox.topPanel.add(newButton);
	}

}
