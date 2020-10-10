package HomeWork;
import java.awt.*;

public class Label1 extends Frame {
	Label1() {
		setLayout(new FlowLayout()); 	// 플로우 레이아웃으로 레이아웃 매니저 선언
		Label lab1 = new Label("봄");  	// 순차적으로 레이블 봄,여름,가을,겨울 선언
		Label lab2 = new Label("여름");
		Label lab3 = new Label("가을");
		Label lab4 = new Label("겨울");
		add(lab1); 	 // 프레임에 레이블 lab1~4를 추가
		add(lab2);
		add(lab3);
		add(lab4);
		lab1.setBackground(Color.GREEN); // lab1 ( 봄 ) 의 배경색을 GREEN으로 선언
		lab2.setBackground(Color.GREEN); // lab2 ( 여름 ) 의 배경색을 GREEN 으로 선언
		setForeground(Color.RED);  		 // Frame이  이 표시하는 텍스트를 RED로 선언
		setBackground(Color.YELLOW); 	 // Frame의 배경색을 YELLOW로 선언
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Label1();
	}
}
