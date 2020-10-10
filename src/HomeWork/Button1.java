package HomeWork;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button1 extends Frame {
	Button1() {
		setTitle("대박");                 	// 제목 설정 
		setLayout(new FlowLayout());		// 플로우 레이아웃으로 셋 레이아웃
		Button btn1 = new Button("가위");	    // 버튼 가위 선언
		Button btn2 = new Button("바위");    // 버튼 바위 선언
		Button btn3 = new Button("보");      // 버튼 보 선언 
		add(btn1); // 선언한 버튼들을  추가
		add(btn2);
		add(btn3);

		btn1.setBackground(Color.CYAN);   //버튼 1의 배경화면 설정
		btn3.setForeground(Color.RED);//보 색깔만 레드
		btn2.setEnabled(false); //바위 사용안함
		setBackground(Color.PINK); //레이아웃의 배경색 설정
		setForeground(Color.BLUE); // 
		setSize(200, 200); // 사이즈 200, 200  왼쪽최상단부터 0,0 첫번째 매개 변수는 아래로의 크기,두번째는 우측
		setVisible(true); //보여주는값을 참으로해서 보여주겠다.
	}

	public static void main(String[] args) {
		new Button1();
	}
}
//<AWT 한글 깨질때 해결>
//메뉴에서 Run - Run Configurations 클릭
//1. 실행 프로젝트 중 해결하려고 하는 프로젝트 메인클래스 선택
//2. Arguments 탭 선택
//3. VM arguments 필드 부분 찾아서 입력 하고 적용(Apply)
//   -Dfile.encoding=MS949

/*자바가 제공하는 창만들기 위한 클래스가 Frame이다.
 
 ** 창을 표현하기 위한 방법에는 두가지가 있다. 
 1. 자바가 제공하는 Frame 객체를 직접 생성하는 방법
 2. 자바가 제공하는 Frame을 확장하여 새로운 클래스를 정의하여 생성하는 방법 
 
//setVisible()
//setSize()
//setResizable()
//setTitle()
 
 
import java.awt.Frame;
 class  FrameTest0
{
 public static void main(String[] args) 
 {
  Frame f  = new Frame();
  //Frame 객체를  생성 했다는 것만으로는  창이 나타나지 않음.
  //Frame클래스 속성중에서 사용자에게 보여줄 것인지 아닌지에 대한
  //설정이 false로 되어있기 때문임.
  //그러므로 창을 보여주기 위한 메소드를 호출해 줘야 창을 볼 수 있음.
  
  f.setVisible(true);//창을 화면에 나타낼 것인지 설정 
  
  f.setSize(300,300);//창의 가로와 세로 길이을 설정
  //창의 크기를 조절할 수 없도록 하기.
  f.setResizable(false);
  
  //창의 타이틀바의 내용을 "보여 주세요"로 설정.
  f.setTitle("보여 주세요");

 }
}*/

