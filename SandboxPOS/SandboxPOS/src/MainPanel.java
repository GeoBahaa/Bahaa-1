import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	MonitorBox monitorBox;
	TransBox transBox;
	InputBox inputBox;
	Sandbox sandbox;
	Repository productRepo;
	
	
	public MainPanel() {
		monitorBox = new MonitorBox (this);
		transBox = new TransBox(this);
		inputBox = new InputBox(this);
		sandbox = new Sandbox(this);
		productRepo = new Repository(this);
		JPanel mPanel = new JPanel(new BorderLayout());
	      mPanel.add(monitorBox, BorderLayout.CENTER);
	      mPanel.add(inputBox, BorderLayout.SOUTH);

	      setLayout(new BorderLayout());
	      add(transBox, BorderLayout.EAST);
	      add(mPanel, BorderLayout.CENTER);

	      transBox.setMinimumSize(new Dimension(150, 0));
	      inputBox.setMinimumSize(new Dimension(0, 50));

	      transBox.setPreferredSize(transBox.getMinimumSize());
	      inputBox.setPreferredSize(inputBox.getMinimumSize());

	      transBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	      inputBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	      monitorBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}