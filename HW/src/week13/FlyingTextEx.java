package week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
	private final int NUM = 10;
	private JLabel la = new JLabel("Hello");
	
	public FlyingTextEx() {
		setTitle("UP/Down/Left/Right according to the key");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component c = (Component)e.getSource();
				c.setFocusable(true);
				c.requestFocus();
			}
		});
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int KeyCode = e.getKeyCode();
			
			switch(KeyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY()-NUM);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY()+NUM);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-NUM, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+NUM, la.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
