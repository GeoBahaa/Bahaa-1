import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AddProductPopup extends JFrame{

	
	
JPanel panel1;
JLabel label1;
JTextArea text1;


	public AddProductPopup(){
		setVisible(true);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		addPadding();
		addPanel1();
		label1.setText("Product Name");
		addPadding();
		pack();
		
	}
	
	public void addPanel1() {
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		label1 = new JLabel ("Label 1");
		text1 = new JTextArea();
		panel1.add(label1, BorderLayout.LINE_START);
		panel1.add(text1);
		add (panel1);
		
	}
	
	public void addPadding() {
		JPanel panelpadding = new JPanel();
		setMinimumSize(new Dimension(500,5));
		add (panelpadding);
	}

}
