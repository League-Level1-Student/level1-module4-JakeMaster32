package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton mole = new JButton();
Random rand = new Random();
int score = 0;
JLabel label = new JLabel();
Date timeAtStart = new Date();
public void drawButtons(int location) {
	frame.add(panel);

	for (int y = 0; y < 24; y++) {
		if(y == location) {
			mole = new JButton("Mole");
			panel.add(mole);
			mole.addActionListener(this);
		}
		else {JButton button = new JButton();
		panel.add(button);
		button.addActionListener(this);}
		label.setText(""+score);
		panel.add(label);
		frame.setSize(300, 340);
		frame.setVisible(true);
		
	}

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()== mole) {
		speak("Good Job");
		score = score +1;
		if (score == 10) {
			endGame(timeAtStart, score);
			System.exit(0);
		}
		else {}
	}
	else {speak("You Suck");}
	mole.removeActionListener(this);
    frame.remove(panel);
    panel = new JPanel();
    int x = rand.nextInt(24);
    drawButtons(x);
}
private void playSound(String fileName) { 
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
void speak(String words) { 
    try { 
        Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
}