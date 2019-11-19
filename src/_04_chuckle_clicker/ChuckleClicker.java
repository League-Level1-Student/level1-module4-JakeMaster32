package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
 JButton joke = new JButton("Joke");
 JButton punchline = new JButton("Punchline");
public static void main(String[] args) {

	new ChuckleClicker().makeButtons();
	
}
 void makeButtons () {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	joke.addActionListener(this);
	punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "hi");
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "You wanna here a joke? Your life.");
	}
	if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes? Because he doesn’t want to be spotted.");
	}
}
}
