package week12;
import java.awt.*;
import javax.swing.*;

// p66
@SuppressWarnings("serial")
public class GridLayoutEx2 extends JFrame{
	public GridLayoutEx2(String title) {
		super(title);
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2));
		Container c = getContentPane();
		c.add(new JLabel("Name"));
		c.add(new JTextField(""));
		c.add(new JLabel("Student ID"));
		c.add(new JTextField(""));
		c.add(new JLabel("Subject"));
		c.add(new JTextField(""));
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutEx2("GridLayout2");
	}

}
