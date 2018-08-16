import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	MonitorBox monitorBox;
	TransBox transBox;
	
	private JPanel bottomPanel = new JPanel();
	private JPanel monitorPanel;
	
	public MainPanel() {
		monitorBox = new MonitorBox (this);
		transBox = new TransBox(this);
		JPanel mPanel = new JPanel(new BorderLayout());
	      mPanel.add(monitorBox, BorderLayout.CENTER);
	      mPanel.add(bottomPanel, BorderLayout.SOUTH);

	      setLayout(new BorderLayout());
	      add(transBox, BorderLayout.EAST);
	      add(mPanel, BorderLayout.CENTER);

	      transBox.setMinimumSize(new Dimension(150, 0));
	      bottomPanel.setMinimumSize(new Dimension(0, 100));

	      transBox.setPreferredSize(transBox.getMinimumSize());
	      bottomPanel.setPreferredSize(bottomPanel.getMinimumSize());

	      transBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	      bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	      monitorBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
}