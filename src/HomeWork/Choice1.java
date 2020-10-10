package HomeWork;

import java.awt.*;

public class Choice1 extends Frame {
	public Choice1() {
		setLayout(new FlowLayout());
		Label lab = new Label("좋아하는 가수를 선택하세요"); // 선호하는 아이템을 물어보는 질의를 레이블 형식으로 선언
		Choice ch = new Choice();
		
		// 여러개의 item이 있는 목록을 보여주고, 그중에 한가지를 선ㅌ낵하도록 할때
		// Choice 객체를 생성한다.
		
		ch.add("아이유");  // item 들을 선언하고 ch 객체에 추가한다.
		ch.add("산울림");
		ch.add("김연우");
		ch.add("거미");
		ch.add("신해철");
		add(lab);
		add(ch);
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice1();
	}
}
