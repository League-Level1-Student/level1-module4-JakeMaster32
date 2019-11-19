package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor {
	JFrame frame = new JFrame("Type or Die");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	char currentLetter;
public static void main(String[] args) {
	new Typing_Tutor().makeButtons();
}



private void makeButtons() {
	// TODO Auto-generated method stub
	panel.add(label);
	frame.add(panel);
	label.setText(""+generateRandomLetter());
	frame.pack();
	frame.setSize(300, 300);
	frame.setVisible(true);
}



char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
}

