package HomeWork;
import java.awt.*;
import javax.swing.*;

public class Ex13_06_CardLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Layout없는 창 연습");
			this.setLayout(null);
			//레이아웃을 null값으로 지정 -> 레이아웃 관리자를 사용하지 않음	
			// 그래야 버튼 123을 겹치게 포진 할 수 있음
			
			JButton btn1 = new JButton("버튼1");
			btn1.setBounds(50,50,70,60); 
			//component.setBounds(x좌표, y좌표, 넓이, 높이);	
			this.add(btn1);
			JButton btn2 = new JButton("버튼2");
			btn2.setBounds(80,80,70,60);
			this.add(btn2);
			JButton btn3 = new JButton("버튼3");
			btn3.setBounds(110,110,70,60);
			this.add(btn3);
			
			setSize(256, 256);
			setVisible(true);
		}
	}		
	public static void main(String[] args) {
		new MyGUI();
	}
}
