package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public void setup() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		frame.setVisible(true);
		button1.setText("Trick");
		button2.setText("Treat");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	public static void main(String[] args) {
		NastySurprise surprise = new NastySurprise();
		surprise.setup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			showPictureFromTheInternet("https://i.pinimg.com/originals/60/dc/2f/60dc2ff8a1fc88f0e082b615c774dd35.jpg");
		}	
		else {showPictureFromTheInternet("https://hips.hearstapps.com/digitalspyuk.cdnds.net/17/38/1505731747-pennywise-teeth-it-movie.jpg?crop=0.563xw:1.00xh;0.136xw,0&resize=480:*");
			
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
