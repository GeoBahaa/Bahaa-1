import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.DefaultCaret;

public class MonitorBox extends JPanel {
	MainPanel mainPanel;
	JTextArea textBox = new JTextArea("Welcome");
	JScrollPane scroll;
	DefaultCaret caret;

	
	Rectangle background = new Rectangle (0,0,10000,10000);
	Color skyblue = new Color (102, 204, 255);
	Dimension mboxSize = new Dimension();
	
	public MonitorBox (MainPanel mPanel){
		setLayout(new BorderLayout());
		textBox.setLineWrap(true);
		textBox.setWrapStyleWord(true);
		textBox.setEditable(false);
		scroll = new JScrollPane(textBox);
		caret = (DefaultCaret) textBox.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		this.mainPanel = mPanel;
	add(scroll, BorderLayout.CENTER);
		
	}
	
	
}