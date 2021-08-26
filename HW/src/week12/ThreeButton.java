package week12;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("Three Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("Ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}
}


public class ThreeButton {

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
