package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slot_machine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton("SPIN");
	Random rand = new Random();
	Random rand2 = new Random();
	Random rand3 = new Random();
	String apple = "apple.jpg";
	String cherry = "cherry.jpg";
	String orange = "orange.jpg";
	String picture = "";
	String picture2 = "";
	String picture3 = "";

	public void setup() {
		frame.add(panel);
		panel.add(spin);
		spin.addActionListener(this);
		frame.setSize(370, 160);
		frame.setVisible(true);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = rand.nextInt(3);
		int y = rand2.nextInt(3);
		int z = rand3.nextInt(3);

		if (x == 0) {
			picture = apple;
		} else if (x == 1) {
			picture = cherry;
		} else {
			picture = orange;
		}

		if (y == 0) {
			picture2 = apple;
		} else if (y == 1) {
			picture2 = cherry;
		} else {
			picture2 = orange;
		}

		if (z == 0) {
			picture3 = apple;
		} else if (z == 1) {
			picture3 = cherry;
		} else {
			picture3 = orange;
		}

		addPictures(picture, picture2, picture3);
	}

	void addPictures(String picture, String picture2, String picture3) {
		try {
			frame.remove(panel);
			panel = new JPanel();
			panel.add(createLabelImage(picture));
			panel.add(createLabelImage(picture2));
			panel.add(createLabelImage(picture3));
			//frame.setSize(370, 160);
			frame.add(panel);
			panel.add(spin);
			frame.pack();
			if (picture == picture2 && picture2 == picture3) {
				JOptionPane.showMessageDialog(null, "YOU WIN!!!!!");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
