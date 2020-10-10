package HomeWork;

import javax.swing.*;
import java.awt.*;

public class Ex13_03_BorderLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼 추가 
			setTitle("BorderLayout 연습");
			//Frame, JFrame의 기본 레이아웃 매니저가 BorderLayout이므로
			//레이아웃을 지정하지 않아도 BorderLayout으로 처리된다.
			//BorderLayout border = new BorderLayout();
			//setLayout(border);
			this.setLayout(new BorderLayout(10,10));
			//windows의 레이아웃을 BorderLayout으로 설정
			//BorderLayout:Frame, JFrame의 기본 레이아웃 매니저로 컨테이너를 5개의 
			//구역으로 나누고 각 구역별로 컴포넌트를 배치하는 레이아웃 매니저			
			//수평,수직 간격 10으로 설정
			JButton btn1 = new JButton("버튼1");
			this.add(btn1,BorderLayout.NORTH);
			JButton btn2 = new JButton("버튼2");
			this.add(btn2,BorderLayout.WEST);
			JButton btn3 = new JButton("버튼3");
			this.add(btn3,BorderLayout.CENTER);
			JButton btn4 = new JButton("버튼4");
			this.add(btn4,BorderLayout.EAST);
			JButton btn5 = new JButton("버튼5");
			this.add(btn5,BorderLayout.SOUTH);		
			//BorderLayout에 컴포넌트를 배치할 방향을 생략하면 기본값은 CENTER 			
			setSize(256, 256); 
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}

