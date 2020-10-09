package HomeWork;


import java.awt.*;

public class BorderLayout1 extends Frame {
	public BorderLayout1() {
		setLayout(new BorderLayout(10, 20));  // 보더레이아웃으로 설정
		Button north = new Button("북쪽");  	  // 버튼 생성
		Button south = new Button("남쪽");
		Button east = new Button("동쪽");      // 생략하면 중앙이 차지합니다.
		Button west = new Button("서쪽");
		Button center = new Button("중앙");
		
		add("North", north);   // 두번째 파라메터가 북쪽에 위치하게 설정후 추가
		add("South", south);   // 남쪽에 위치하게 설정후 추가
		add("East", east);      // 동쪽에 위치하게 설정 후 추가
		add("West", west);      // 서쪽에 위치하게 설정 후 추가
		add("Center", center);  // 중앙에 위치하게 설정 후 추가
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayout1();
	}
}