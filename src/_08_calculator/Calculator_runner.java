package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_runner implements ActionListener {
	
	JButton add = new JButton("+");
	JButton subtract = new JButton("-");
	JButton multiply = new JButton("x");
	JButton divide = new JButton("/");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField field1 = new JTextField(11);
	JTextField field2 = new JTextField(11);
	JLabel label = new JLabel("0");
	public static void main(String[] args) {
		
		Calculator_runner calculator = new Calculator_runner();
		calculator.setup();
	}

void setup() {
add.addActionListener(this);
subtract.addActionListener(this);
multiply.addActionListener(this);
divide.addActionListener(this);
		
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

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	int answer = 0;
	String c = field1.getText();
	int d = Integer.parseInt(c);
	String g = field2.getText();
	int f = Integer.parseInt(g);
	if (e.getSource().equals(add)) {
		answer = Calculator.add(d, f);
	}
	else if (e.getSource().equals(subtract)) {
		answer = Calculator.subtract(d, f);
	}
	else if (e.getSource().equals(multiply)) {
		answer = Calculator.multiply(d, f);
	}
	else {
		answer = Calculator.divide(d, f);
	}
	label.setText(""+answer);
}
}
