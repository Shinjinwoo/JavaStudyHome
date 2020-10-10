package HomeWork;
import java.awt.*;
import javax.swing.*;


public class Ex13_08_JButton {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습2");

			this.setLayout(new FlowLayout());

			ImageIcon img1 = new ImageIcon("image/java1.png");
			//자바 이미지파일이 따로 없으므로 그냥 임의로 진행한다.
			//이미지 아이콘은 아주 작은이미지 , 즉 아이콘을 이미지객체로 만든것
			//javax.swing.imageicon 클래스를 이용해서 만들 수 있음
			ImageIcon img2 = new ImageIcon("image/java2.png");
			//이미지 아이콘2개 준비
			JButton btn1 = new JButton("버튼1", img1);
			//버튼1과 이미지 함께 생성
			this.add(btn1);
			
			JLabel lbl1 =new JLabel("레이블 입니다.");
			JLabel lbl2 =new JLabel(img2);
			//레이블에 문자 또는 이미지가 표현되도록 설정
			this.add(lbl1);
			this.add(lbl2);
			
			JCheckBox chk1 = new JCheckBox("C++");
			JCheckBox chk2 = new JCheckBox("Java");
			JCheckBox chk3 = new JCheckBox("C#",true);
			//체크박스3개준비,3번째체크박스에 체크(true)되도록 설정
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);
			
			JRadioButton rdo1 =new JRadioButton("고래");
			JRadioButton rdo2 =new JRadioButton("상어");
			JRadioButton rdo3 =new JRadioButton("새우");
			//버튼그룹을 준비하고 라디오버튼3개를 버튼그룹에 포함
			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);
			
			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);

			setSize(200, 300);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new MyGUI();
	}
}
