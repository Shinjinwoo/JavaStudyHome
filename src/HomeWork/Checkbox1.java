package HomeWork;

import java.awt.*;

public class Checkbox1 extends Frame  { // 프레임 상속
	public Checkbox1() {
		setLayout(new FlowLayout());    // 플로우 레이아웃 선언
		Label lab = new Label("좋아하는 계절을 선택하세요"); // 레이블 선언
		Checkbox cb1 = new Checkbox("봄");  // 체크박스 ( 말그대로 체크박스 ) 봄,여름,가을,겨울 선언
		Checkbox cb2 = new Checkbox("여름");
		Checkbox cb3 = new Checkbox("가을");
		Checkbox cb4 = new Checkbox("겨울");
		add(lab); // 레이블 추가
		add(cb1); // 체크박스 cb1~4에 추가
		add(cb2);
		add(cb3);
		add(cb4);
		setSize(200, 200); // 사이즈 200,200
		setVisible(true);  // 시각화 true
	}
	public static void main(String[] args) {
		new Checkbox1();
	}
}