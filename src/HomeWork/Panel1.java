package HomeWork;
import java.awt.*;

public class Panel1 extends Frame {
	//default BorderLayout:동,서,남,북,중앙의 구조를 가집니다. (Layout 설정 안해주면, 얘가 default!)
	Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
	// 체크박스는 체크를 하면 true, 해재를 하면 Fasle를 리턴하는 옵션 컨트롤-Dfile.encoding=MS949 
	// Checkbox에는 기본적으로 레이블이 탑재되어 있으며 생성자 인수로 텍스트를 넘기게 되면 레이블명이 셋팅됨

	public Panel1() {
		setLayout(new FlowLayout());
		Label lab = new Label("좋아하는 계절을 선택하세요");
		Panel p1 = new Panel(); //default FlowLayout
		Label lab2 = new Label("좋아하는 가요를 선택하세요");
		Panel p2 = new Panel();
		cb1 = new Checkbox("봄");
		cb2 = new Checkbox("여름");
		cb3 = new Checkbox("가을");
		cb4 = new Checkbox("겨울");
		cb5 = new Checkbox("너의의미");
		cb6 = new Checkbox("소격동");
		cb7 = new Checkbox("썸");
		
		cb8 = new Checkbox("겨울비");
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		p1.add(cb4);
		p2.add(cb5);
		p2.add(cb6);
		p2.add(cb7);
		p2.add(cb8);
		add(lab);
		add(p1);
		add(lab2);
		add(p2);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Panel1();
	}
}
