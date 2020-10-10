package HomeWork;

import java.awt.*;

public class Ex02_Frame {
	public static void main(String[] args) {
		Frame f1 = new Frame();
		//f1.setSize(200, 200); //Frame의 크기를 지정
		//f1.setLocation(100, 100); //Frame의 위치를 지정
		f1.setBounds(100, 100, 200, 200); 
		//- Frame의 위치와, 크기를 전부 지정
		//앞의 두개 로케이션 뒤에두개 사이즈를 한꺼번에 적을수 있다.
		//1,2 번째 매개변수가 로케이션을 의미하고 3,4번째 매개 변수가 사이즈를 의미한다.
		f1.setBackground(Color.RED);
		f1.setVisible(true);
	}
}
