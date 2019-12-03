package _08_calculator;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_runner {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");
		JTextField field1 = new JTextField(11);
		JTextField field2 = new JTextField(11);
		JLabel label = new JLabel("0");
		label.setPreferredSize(new Dimension(40, 40));
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		frame.setSize(350, 150);
		frame.setVisible(true);
	}
}
