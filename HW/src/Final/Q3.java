package Final;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

/*
 * ● 크기가 500x500 픽셀인 JFrame 클래스를 생성하시오.
● JLabel 오브젝트를 추가하고 (0, 0) 위치에 현재 위치를 (0, 0)과 같이 표시한다.
● 마우스 왼쪽 버튼이 눌릴때마다 마우스가 눌린 위치를 Vector 데이터 구조에 저장하고
화편의 JLabel 오브젝트 텍스트를 현재 위치로 갱신한다. (마우스 왼쪽 버튼에 대한 mousePressed 를 사용) 콘솔에 다음과 같은 메시지를 출력한다.
 */

public class Q3 extends JFrame{
	private JLabel la = new JLabel();
	
	public Q3(){
		setTitle("MouseVector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener m = new MyMouseListener();
		c.addMouseListener(m);
		c.addMouseMotionListener(m);
		la.setSize(500,500);
		la.setLocation(0, 0);
		c.add(la);
		setSize(500,500);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{

		public void mousePressed(MouseEvent e) {
			la.setLocation(0, 0);
			la.setText("("+e.getX()+", "+e.getY()+")");
			Vector<String> v = new Vector<String>();
			v.add("("+e.getX()+", "+e.getY()+")");
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		
		new Q3();

	}

}

