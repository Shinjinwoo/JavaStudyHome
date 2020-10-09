package HomeWork;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HomeworkCalculater extends JFrame implements ActionListener {

	private String[] labels = { "백스페이스", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1",
			"2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
	private JButton[] buttons;
	private double result = 0;
	private String operator = "=";
	private boolean startNum = true;
	private JTextField resultView;
	private JPanel panel;

	public HomeworkCalculater() {

		resultView = new JTextField(30);
		panel = new JPanel();
		resultView.setText("0.0");

		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;

		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if (cols >= 3) {
					buttons[index].setForeground(Color.red);
				} else {
					buttons[index].setForeground(Color.blue);
				}

				buttons[index].setBackground(Color.yellow);
				panel.add(buttons[index]);
				buttons[index].addActionListener(this);
				index++;
			}
		}

		add(resultView, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setSize(550, 250);
		setTitle("계산기");
		setVisible(true);
		pack();
	}

	private void cal(double a) {
		if (operator.equals("+"))
			result = result + a;

		else if (operator.equals("-"))
			result = result - a;

		else if (operator.equals("*"))
			result = result * a;

		else if (operator.equals("/"))
			result = result / a;

		else if (operator.equals("sqrt"))
			result = Math.sqrt(a);

		else if (operator.equals("+/-"))
			if (a > 0)
				result = a * -1;
			else
				result = Math.abs(a);
		
		else if (operator.equals("%"))
			result = 100 / a;

		else if (operator.equals("="))
			result = a;

		resultView.setText("" + result);

	}

	public static void main(String[] args) {

		new HomeworkCalculater();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 자동 생성된 메소드 스텁
		String input = e.getActionCommand();
		if (input.charAt(0) == 'C') {
			startNum = true;
			result = 0;
			operator = "=";
			resultView.setText("0");
		}

		else if (input.charAt(0) >= '0' && input.charAt(0) <= '9' || input.equals(".")) {
			if (startNum == true)
				resultView.setText(input);
			else
				resultView.setText(resultView.getText() + input);
			startNum = false;

		} else {
			if (startNum) {
				if (input.equals("-")) {
					resultView.setText(input);
					startNum = false;
				} else
					operator = input;
			} else {
				double x = Double.parseDouble(resultView.getText());
				cal(x);
				operator = input;
				startNum = true;
			}
		}

	}
}
