package HomeWork;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HomeworkCalculater extends JFrame implements ActionListener {

	private String[] labels = { "백스페이스", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1",
			"2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
	// 계산기의 기본이 되는 레이블들을 선언한다.
	
	private JButton[] buttons;
	// 버튼을 배열로 선언
	
	private double result = 0;
	// 연산의 결과값을 저장할 실수형 변수인 double reslut를 선언 한다
	
	private String operator = "=";
	//연산결과를 이벤트리스닝 하기 위한 오퍼레이터 = 를 선언한다.
	
	private boolean startNum = true;
	//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다
	
	private JTextField resultView;
	//연산과정에서 입력한 숫자와 결과를 표시할 텍스트필드 resultView를 선언한다.
	
	private JPanel panel;

	public HomeworkCalculater() {

		resultView = new JTextField(30);
		//좌우폭 30의 리설트뷰 선언
		
		panel = new JPanel();
		// 패널 선언
		
		resultView.setText("0.0");
		//리서트뷰에 초기 표시화인 0.0을 선언

		panel.setLayout(new GridLayout(0, 5, 3, 3));
		// 그리드 레이아웃을으오 n행 5열 그리고 vgap과 hgap을 3과3으로 매개변수를 넣어줘서 아이템끼리 3,3의 거리가
		// 주어지게 한다.
		buttons = new JButton[25];
		// 버튼 25개를 배열형으로 선언한다.
		
		int index = 0;
		// 버튼형 배열의 인덱스이다.

		for (int rows = 0; rows < 5; rows++) {
			// 행이 첫번째에서  5번 돌동안 반복문이 돌아간다.
			for (int cols = 0; cols < 5; cols++) {
				//열이 첫번째열에서 5번번째 열이 돌동안 이중반복문이 돌아간다.
				
				buttons[index] = new JButton(labels[index]);
				//button[0] 부터 인댁스가 끝날떄까지 레이블의 버턴을 선언한다.
				
				if (cols >= 3) {
					buttons[index].setForeground(Color.red);
					//열어 3이하일 경우 텍스트 표시의 색상을 RED 색상으로 선언한다.
				} else {
					buttons[index].setForeground(Color.blue);
					//열이 4이상을 경우 텍스트 표시 새삭을 blue로 선언한다.
				}

				buttons[index].setBackground(Color.yellow);
				//각 아이탬들의 배경색을 노란색으로 선언
				panel.add(buttons[index]);
				// 버튼을 패널에 인댁스 별로 추가한다.
				buttons[index].addActionListener(this);
				//이벤트리스너인 액션 리스너를 통해 각 버튼 클릭시 그에 필요한 연산을 수행한다.
				index++;
			}
		}

		add(resultView, BorderLayout.NORTH);
		// 결과창을 표시하는 창을 보더레이아웃의 북쪽에 배치
		add(panel, BorderLayout.CENTER);
		// 각각의 연산을 수행하고 숫자를 부여하는 계산기패널을 중앙에 배치
		setSize(550, 250); // 사이즈 550, 250
		setTitle("계산기"); // 제목선언
		setVisible(true); // 시각화 ture
		pack(); 
		// pack()은 프래임 내에서 서브컴포논터들의 위치를 창에 맞게 조절하는 함수이다.
	}

	private void cal(double a) {
		// 연산결과를 위한 메소드이다. 파라메터로 실수형 변수 a를 받는다.
		
		if (operator.equals("+"))
			result = result + a;
		// 오퍼레이터의 입력값이 + 이면 입력받은 값을 더한다.

		else if (operator.equals("-"))
			result = result - a;
		// 오퍼레이터의 입력값이 - 이면 입력받은 값을 뺀다.
		else if (operator.equals("*"))
			result = result * a;
		// 오퍼레이터의 입력값이 * 이면 입력받은 값을 곱한다.
		else if (operator.equals("/"))
			result = result / a;
		// 오퍼레이터의 입력값이 / 이면 입력받은 값을 나눈다.
		else if (operator.equals("="))
			result = a;
		// 오퍼레이터의 입력값이 = 이면 입력받은 값을 그대로 저장한다.

		resultView.setText("" + result);
		// 텍스트 필드의 resultView 연산결과값인 reslut를 출력한다.

	}

	public static void main(String[] args) {

		new HomeworkCalculater();
		// 계산기 객체를  메인 메소드에 호출한다.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력된 버튼의 이벤트 리스닝을 위한 메소드이다.
		
		String input = e.getActionCommand();
		// 컴포넌트의 텍스트 값을 얻기에 getActionCommand를 이용한다.
		
		if (input.charAt(0) == 'C') {
		// 입력된 input값이 C일 경우 모든 연산결과를 초기의 순수한 상태로 clear 한다.
			startNum = true;
			//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
		    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다
			result = 0;
			operator = "=";
			resultView.setText("0");
		}

		else if (input.charAt(0) >= '0' && input.charAt(0) <= '9' || input.equals(".")) {
			// 논리합 and 연산자로 0이상의 9이하의 숫자만을 입력받고 or 연산자로 버튼을 통해 String "."
			// 입력된다면 소수점으로 표현한다.
			if (startNum == true)
				//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
			    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다
				resultView.setText(input);
				// 텍트스 필드인 리설트뷰의 숫자들을 셋 텍스트 한다.
			else
				resultView.setText(resultView.getText() + input);
				startNum = false;
				//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
			    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다

		} else {
			if (startNum) {
				if (input.equals("-")) {
					resultView.setText(input);
					startNum = false;
					//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
				    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다
				} else
					operator = input;
			} else {
				double x = Double.parseDouble(resultView.getText());
				//연산을 위해 입력받은 String을 parse를 통해 실수형 변수로 받아온다.
				cal(x);
				//연산을 위한 메소드 cal을 호출한다.
				operator = input;
				startNum = true;
				//boolean 값으로 숫자 버튼이 눌리면 boolean 값을 true 로 주고 아니면 false로 하여 false 일때
			    //연산자 버튼이 눌리면 출력 값의 변화를 일으키지 않게 한다
			}
		}

	}
}
