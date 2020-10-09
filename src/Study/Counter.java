package Study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter = 0;

		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("현재의 카운터 값 : " + counter);

		}


	public Counter() {
		setSize(400, 150);
		setTitle("이벤트예쩨");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값 : " + counter);
		button.addActionListener(this);
		add(label, "Center");
		add(button, "East");
		setVisible(true);

	}

	public static void main(String[] args) {
		new Counter();
	}

}
