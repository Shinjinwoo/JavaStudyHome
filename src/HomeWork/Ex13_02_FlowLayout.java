package HomeWork;

import java.awt.FlowLayout;

import javax.swing.*;

public class Ex13_02_FlowLayout {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료버튼 추가
			setTitle("GUI연습");
			this.setLayout(new FlowLayout());
			//FlowLayout:배치 관리자 설정,추가되는 순서부터 나타남
			//FlowLayout:컴포넌트를 컨테이너(프레임, 패널)에 원래의 크기대로
			//차례차례 배치하는 레이아웃 매니저
			//windows 창의 레이아웃을 FlowLayout으로 설정
			//this.은 현재 windows자체인 JFrame을 의미
			//생성자의 파라미터를 생략하면 기본정렬은 FlowLayout,CENTER,수직및 수평간격은 5픽셀
			JButton btn1 = new JButton("버튼1");
			this.add(btn1);
			//버튼 컴포넌트인 JButton을 생성하면서 버튼의 글자는 버튼1로 지정 
			//생성한 버튼을 this.(자체windows)에 부착
			JButton btn2 = new JButton("버튼2");
			this.add(btn2);
			JButton btn3 = new JButton("버튼3");
			this.add(btn3);
			JButton btn4 = new JButton("버튼4");
			this.add(btn4);
			JButton btn5 = new JButton("버튼5");
			this.add(btn5);		
			
			setSize(256, 256); // 사이즈를 256,256으로 선언
			setVisible(true);  // 시각화 true
		}
	}
	public static void main(String[] args) {
		new MyGUI();
	}
}