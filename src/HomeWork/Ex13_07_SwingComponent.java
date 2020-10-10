package HomeWork;
import java.awt.*;
import javax.swing.*;

public class Ex13_07_SwingComponent {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습1");
			Container c = this.getContentPane();
			//Pane:JFrame위에 살짝 덮인 유리판 개념
			// 스윙 컴포넌트들이 부착되는 공간이다.
			// getContentPane();을 통해 스윙프레임에 붙은 디폴트 컨탠트팬을 알아낸다.
			
			c.setBackground(Color.YELLOW);

			this.setLayout(new FlowLayout()); //FlowLayout으로 설정
			//c.setLayout(new FlowLayout());  
			//이렇게 구한 페인은 JFrame을 의미하는 this대신사용가능			

			JButton btn1 = new JButton("버튼1");//버튼1생성
			btn1.setBackground(Color.BLACK);//버튼1배경색BLACK설정
			btn1.setForeground(Color.MAGENTA);//버튼1글자색MAGENTA설정	
			this.add(btn1);//버튼1추가,c.add(btn1);로 대신 사용가능
			
			JButton btn2 = new JButton("버튼2");
			btn2.setFont(new Font("맑은고딕",Font.BOLD,30));//버튼2글차체및 크기설정
			btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));//버튼2커서 놓으면 회전모양커서로 변경되도록 설정
			btn2.setToolTipText("이 버튼은 크게 보여요~~");//버튼2위에 마우스 커서를 놓으면 툴팁이 출력되도록 설정
			this.add(btn2);			
			JButton btn3 = new JButton("버튼3");
			btn3.setEnabled(false);//버튼3을 사용하지 못하도록 설정			
			this.add(btn3);	
			

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}