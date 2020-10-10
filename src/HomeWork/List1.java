package HomeWork;
import java.awt.*;

public class List1 extends Frame {
	public List1() {
		setLayout(new FlowLayout());
		Label lab = new Label ("좋아하는 노래를 선택하세요");
		List list = new List();
		List list2 =new List(3, true); 
		//List 역시 Choice 처럼 목록 중에서 원하는 아이템을 선택 할 수 잇도록 할때 사용된다.
		//그러나 List는 Choice와 달리 , 처음부터 모든 아이템 목옥을 보여주며, 목록의 아이템중에서 
		// 하나 또는 여러개를 선택하도록 할 수 있다.
		// List(int rows, boolean multipleMode)
		// rows – 몇 줄짜리 크기의 List를 보여줄 것인지 지정한다.
		// multipleMode - List목록 다중선택이 가능하도록 할 것인가를 지정
		// 할 수 있다. true로 하면 여러 개의 item을 선택할 수 있다.
		list.add("너의 의미");
		list.add("소격동");
		list.add("레옹");
		list.add("아름다운 강산");
		Label lab2 = new Label ("좋아하는 영화를 선택 하세요");		
		list2.add("슈퍼맨");
		list2.add("아이언맨");
		list2.add("배트맨");
		list2.add("호빵맨");
		add(lab);		
		add(list);
		add(lab2);
		add(list2);
		setSize(200, 200);
		setVisible(true); //true�̸� ���� ����
	}

	public static void main(String[] args) {
		new List1();
	}
}
