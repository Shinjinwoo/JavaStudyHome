package HomeWork;

import java.awt.*;

import javax.swing.*;

public class Calculater extends JFrame {

	private String[] labels = { "백스페이스", "", "", "CE", "C", "7", "8", "9", "/", "sqrt", "4", "5", "6", "x", "%", "1",
			"2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
	private JButton[] buttons;

	public Calculater() {

		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];

		int index = 0;

		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				buttons[index].setBackground(Color.YELLOW);
				panel.add(buttons[index]);
				index++;

			}
		}

		JTextField resultView = new JTextField(50);
		panel2.add(resultView);

		panel3.add(panel2);
		panel3.add(panel);

		add(panel3);

		setSize(550, 250);
		setTitle("계산기");
		setVisible(true);

	}

	public static void main(String[] args) {

		new Calculater();

	}
}
