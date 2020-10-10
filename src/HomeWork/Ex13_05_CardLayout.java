package HomeWork;

import java.awt.*;
import javax.swing.*;

public class Ex13_05_CardLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("CardLayout 연습");
			this.setLayout(new CardLayout(10, 10));
			// CardLayout:컨테이너에 동일한 크기로 카드를 엎어놓은것 처럼
			// 컴포넌트를 배치하는 레이아웃 매니저
			// 첫번째 정수형 매개 변수는  hgap을 의미한다. ( 수평 )
			// 두번째 정수형 매개 변수는  vgap을 의미한다 ( 수직 )

			JButton btn1 = new JButton("버튼1");
			this.add(btn1);
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);

			setSize(256, 256);
			setVisible(true);
		}
	}
	public static void main(String[] args) {
		new MyGUI();
	}
}