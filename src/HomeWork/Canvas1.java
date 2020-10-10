package HomeWork;
import java.awt.*;


public class Canvas1 extends Frame {
	Canvas1(String str) {
		super(str);
		Canvas c1 = new Canvas();
		//Frame 객체를  생성 했다는 것만으로는  창이 나타나지 않음.
		//Frame클래스 속성중에서 사용자에게 보여줄 것인지 아닌지에 대한 설정이 false로 되어있기 때문임.
		//그러므로 창을 보여주기 위한 메소드를 호출해 줘야 창을 볼 수 있음.
		
		c1.setBackground(Color.RED); // 캔버스의 배경색 RED
		c1.setSize(200, 100); // 캔버스 사이즈 200,100
		setSize(200, 200);  // 레이아웃 사이즈 200, 200
		setBackground(Color.BLUE);	//배경색 BLUE
		add("North", c1);	// 위쪽으로 C1생성
		setVisible(true); 	//시각화 true
	}
	public static void main(String[] args) {
		new Canvas1("canvas");
	}
}