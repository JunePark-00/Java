package week12;

import javax.swing.*;
import java.awt.*;
// p59,61
@SuppressWarnings("serial")
public class FlowLayoutEx extends JFrame{
	public FlowLayoutEx(String title) {
		super(title);
		setSize(300,400); // p59,61
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setLayout(new FlowLayout()); --> p59
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //p61
		Container c = getContentPane();
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mult"));
		c.add(new JButton("div"));
		c.add(new JButton("canculate"));
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx("FlowLayout");

	}

}
