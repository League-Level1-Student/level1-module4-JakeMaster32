package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_mole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton mole = new JButton();

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
		
		frame.setSize(300, 340);
		frame.setVisible(true);
		
	}

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()== mole) {
		System.out.println("Mole Clicked");
	}
	else {speak("DEEZ NUTS");}
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
}