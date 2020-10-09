package Study;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame( ) {
		setSize(300,150);
		setLocation(200,300);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.YELLOW);
		
		
		JButton button1 = new JButton (" 확인 ");
		JButton button2 = new JButton (" 취소 ");
		add(button1);		
		add(button2);		
		setVisible(true);
	}
	
	public static void main (String[] args ) {
		MyFrame f = new MyFrame();
	}

}
