package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
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
	currentLetter = generateRandomLetter();
	label.setText(""+currentLetter);
	frame.addKeyListener(this);
	frame.pack();
	frame.setSize(300, 300);
	frame.setVisible(true);
}



char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
    
}



@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyChar() == currentLetter) {
		System.out.println("Correct");
		System.out.println(currentLetter);
		panel.setBackground(Color.green);
		currentLetter = generateRandomLetter();
		label.setText(""+currentLetter);
	
		
}
	else {panel.setBackground(Color.red);}
}



@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}

