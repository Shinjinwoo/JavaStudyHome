package HomeWork;

import javax.swing.JFrame; // JFrame 을 import
public class Ex13_01_GUI {
	static class MyGUI extends JFrame { // JFrame을 클래스 MyGUI에 상속
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//windows 창의 오른쪽위의 [x]버튼을 누르면 프로그램이 종료될수 있게 하는 기능
			setTitle("GUI연습");
			//windows 창의 제목을 출력하는 기능
			//이부분에 버튼,레이블,체크박스등을 코딩!!!
			setSize(500, 500);
			//windows창의 크기를 지정.(가로:500,세로:500)
			setVisible(true);
			//windows창을 화면에 나타나게하는 기능
		}
	}
	public static void main(String[] args) {
		new MyGUI(); 
		//main()메소드에서 MyGUI()클래스 생성
		//MyGUI()생성자가 실행되므로 windows창이 출력
	}
}

