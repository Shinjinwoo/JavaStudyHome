package HomeWork;
import java.awt.*;

public class GridLayout1 extends Frame {
	public GridLayout1() {
		setTitle("그리드 레이아웃");
		setLayout(new GridLayout(2, 3, 10, 20));
		//row(세로),column(가로),h(수평),v(수직) :행과 열
		//각종 컴포넌트들을 임의의 열과 행으로 똑같으 나우어 배치하는 레이아웃 매니저다.
		//임의의열과 행 뿐만 아니라 매개변수로거 row,colum 을 선언하면 그에따른 바둑판식 그리드 레이아웃을 만들수 있다.
		// 행은 0으로 선언하는게 보통이다. (어떠한 컴포넌트들을 추가할지 알수 없으므로. )
		
		add(new Button("1번"));
		add(new Button("2번"));
		add(new Button("3번"));
		add(new Button("4번"));
		add(new Button("5번"));
		add(new Button("6번"));
		setSize(200, 200);
		show(); // setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayout1();
	}
}
/*AWT Layout 종류 
FLoatLayout :  순차적으로 정렬한다. 
GridLayout : 행과 열로 나눈다. 
BorderLayout :  동서남북에 배치한다. 
CardLayout :  
GridBagLayout : 
*/
