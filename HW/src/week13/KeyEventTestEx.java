package week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventTestEx extends JFrame {
	private JLabel[] KeyMessage;
	public KeyEventTestEx() {
		setTitle("Key event listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		/* p36,38
		setSize(250,250);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		*/
		KeyMessage = new JLabel[3];
		KeyMessage[0] = new JLabel(" getKeyCode() ");
		KeyMessage[1] = new JLabel(" getKeyChar() ");
		KeyMessage[2] = new JLabel(" getKeyText() ");
		for(int i = 0; i < KeyMessage.length; i++) {
			c.add(KeyMessage[i]);
			KeyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300,150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	
	/* p36,38
	class MyKeyListener extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			char ch = e.getKeyChar();
			System.out.println("Key pressed "+ch+", "+code+", "+e.getKeyText(code));
		}
		public void KeyReleased(KeyEvent e) {
			System.out.println("Key released");
		}
		public void KeyTyped(KeyEvent e) {
			System.out.println("Key typed");
		}
	}
	*/
	
	class MyKeyListener extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			int KeyCode = e.getKeyCode();
			char KeyChar = e.getKeyChar();
			KeyMessage[0].setText(Integer.toString(KeyCode));
			KeyMessage[1].setText(Character.toString(KeyChar));
			KeyMessage[2].setText(e.getKeyText(KeyCode));
		}
	}

	public static void main(String[] args) {
		new KeyEventTestEx();
	}

}
