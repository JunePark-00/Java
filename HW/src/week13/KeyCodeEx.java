package week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	
	public KeyCodeEx(){
		setTitle("change content pane background color");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			la.setText(e.getKeyText(e.getKeyCode()));
			
			if(e.getKeyChar()=='%') {
				Component c = (Component)e.getSource();
				c.setBackground(Color.YELLOW);
			} else if(e.getKeyCode() == KeyEvent.VK_F1) {
				Component c = (Component)e.getSource();
				c.setBackground(Color.GREEN);
			}
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
