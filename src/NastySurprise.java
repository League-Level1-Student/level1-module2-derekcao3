import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	
public class NastySurprise implements ActionListener {
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
public static void main(String[] args) {
	new NastySurprise().createUI();
}
	private void createUI() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	leftButton.setText("Trick");
	rightButton.setText("Treat");
	leftButton.addActionListener(this);
	rightButton.addActionListener(this);
	panel.add(leftButton);
	panel.add(rightButton);
	frame.pack();
	frame.setTitle("Nasty Surprise");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == leftButton) {
			showPictureFromTheInternet("https://yt3.ggpht.com/a-/AN66SAxPfKnfHAnAs0rOqaSwINOxDYJsyj-gPBP0OQ=s900-mo-c-c0xffffffff-rj-k-no");
		}
		else if (buttonPressed == rightButton) {
			showPictureFromTheInternet("https://fu5on.com/wp-content/uploads/2018/09/PewDiePie-vs.-T-Series.jpg");
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