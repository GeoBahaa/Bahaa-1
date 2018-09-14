import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

public class InputBox extends JPanel{
	MainPanel mainPanel;
	JTextPane wordBox;
	private Action 	MakeSelection;
	JTextArea inputText;
	

	public InputBox (MainPanel mPanel) {
		mainPanel = mPanel;
		JLabel inputLabel = new JLabel ("Input:");
		JPanel leftPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		leftPanel.add(inputLabel);
		centerPanel.add(inputText());
		add(leftPanel);
		add(centerPanel);
		
	}
	
	public JTextArea inputText (){
			inputText = new JTextArea(1,50);
			MakeSelection MakeSelection = new MakeSelection();
		
		  InputMap im = inputText.getInputMap(JComponent.WHEN_FOCUSED);
		  ActionMap am = inputText.getActionMap();
		  am.put(im.get(KeyStroke.getKeyStroke("ENTER")), MakeSelection);
		  
		  return inputText;
		  
		}
	
	private class MakeSelection extends AbstractAction{
		
		  public void actionPerformed (ActionEvent ms) {
			  mainPanel.sandbox.runCommand();
			  
		  }
	}
}
