package HomeWork;
import java.awt.*;

public class TextArea1 extends Frame {
	public TextArea1() {
		setLayout(new FlowLayout());
		TextArea ta1 = new TextArea("대박");
		//초기 문자열을 가지는 TextArea 객체를 생성
		TextArea ta2 = new TextArea(5, 30); 
		//5행 30열 크기의 TextArea객체를 생성 
		TextArea ta3 = new TextArea("대박사건", 3, 20);
		// 초기 문자열을 가지고 3행 20열의 TextArea 객체를 생성. 
		//중간-row(세로,행) 뒤-colum(가로,열)
		add(ta1);
		add(ta2);
		add(ta3);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextArea1();
	}
}