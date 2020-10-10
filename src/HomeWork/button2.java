package HomeWork;

import java.awt.*;

public class button2 extends Frame {
	Button[] btn = new Button[50]; // 버튼이을 사이즈 50 들어갈수있는 배열로 선언
	Label[] lab = new Label[50];   // 라밸을 사이즈 50의 배열로 선언

	button2() {
		setLayout(new FlowLayout()); 		 // 플로루 레이아웃으로 셋 레이아웃
		for (int i = 0; i < 50; i++) {  	 // i가 숫자 50보다 작을동안 반복문 한번 수행시 1씩 증가
			btn[i] = new Button(i + "버튼");  // Button[50]의 인댁스를 전부 "i + 버튼"으로 선언
			add(btn[i]);					 //  버튼 추가
			lab[i] = new Label(i + "라벨");   // Label[50]의 인댁스를 전부 "i + 라벨" 으로 선언
			add(lab[i]); 					 //  라벨 추가 

			if (i % 2 == 1) { //홀수일때
				lab[i].setForeground(Color.RED); 	//홀수일때 레이블의 표시되는 부분 RED로
				lab[i].setBackground(Color.WHITE);  //홀수일때 레이블의 배경색 WHITE
				btn[i].setEnabled(false);			//홀수일때 버튼 사용 불가능
			}
		}
		setForeground(Color.BLUE); // 짝수일때 버튼의 표시되는 부분 BLUE 색상으로
		setBackground(Color.PINK); // 플로우 레이아웃의 배경색
		setSize(500, 500);		   // 사이즈 500, 500
		setVisible(true);		   // 시각화 true
	}

	public static void main(String[] args) {
		new button2();
	}

}
