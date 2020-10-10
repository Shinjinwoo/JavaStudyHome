package HomeWork;

import java.awt.*;
//awt: user interface(UI 사용자와의 상호작용)를 위한 모든 클래스를 
//묶어놓은 contain , 요즘은 Swing을 많이 쓰지만 Swing도 awt를 상속해서 만든 것이다.
//--- 그래픽 이미지, 버튼 , 스크롤등을 관리할수있다.


public class Ex01_Frame { //화면에 창띄우기
	public static void main(String[] args) {
		Frame f1 = new Frame(); // 프레임 객채 생성
		f1.setSize(200, 200); // 사이즈 200,200
		f1.setVisible(true); //시각화 true
	}
}