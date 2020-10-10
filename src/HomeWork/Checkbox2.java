package HomeWork;

import java.awt.*;

public class Checkbox2 extends Frame {
	public Checkbox2() {
		setLayout(new FlowLayout());   					
		Label lab = new Label("좋아하는 계절을 선택하세요");
		CheckboxGroup cbg = new CheckboxGroup();
		
		//그룹을 선언하면 하나만 선택되어지고 , 원형의 체크박스가 생긴다.
		//나머지는 Checkbox1 class를 확인하자.
		
		Checkbox cb1 = new Checkbox("봄", cbg, false);
		Checkbox cb2 = new Checkbox("여름", cbg, true);
		Checkbox cb3 = new Checkbox("가을", cbg, false);
		Checkbox cb4 = new Checkbox("겨울", cbg, false);
		add(lab);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Checkbox2();
	}
}