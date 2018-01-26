package gui;

import java.awt.*;
import javax.swing.*;

public class ListOfLongExplanations extends JFrame {
	
	public ListOfLongExplanations(){
		textArea = new JTextArea();
		textArea.setAutoscrolls(true);
		textArea.setEditable(false);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new JScrollPane(textArea),BorderLayout.CENTER);	
		
		setTitle("List of long explanations");
		setSize(500, 200);
		setVisible(true);
	}
	
	public void append(String msg) {
		textArea.append(msg+"\n\r");
	}
	
	JTextArea textArea;
	
}
