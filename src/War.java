import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class War {
	public static void main(String[] args) {

		public class War implements MouseListener {
			JFrame frame;
			JPanel topPanel;
			JPanel middlePanel;
			JPanel bottomPanel;
			JLabel leftCard;
			JLabel rightCard;
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

		}
		ScoreKeeper scores = new ScoreKeeper(0, 0, 0);
		Deck deck;
		int playerPoints = 0;
		int computerPoints = 0;
		int bonusPoints = 0;
	}
	public void Initiallize(JFrame frame) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 400);
		frame.setTitle("WAR !");
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(200, 200, 200));
		frame.add(topPanel, BorderLayout.NORTH);
		topMessage.setText("Welcome to WAR!");
		topPanel.add(topMessage);
		
		leftScore = new JLabel();
		frame.add(leftscore, BorderLayout.WEST);
		
		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(200,200,100));
		frame.add(middlePanel, BorderLayout.CENTER);
		
		rightScore = new JLabel();
		frame.add(rightScore, BorderLayout.EAST);
		
		bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(100,200,100));
		frame.add(bottomPanel, BorderLayout.SOUTH);
		bottomMessage = new JLabel();
	}
	

	private static void testDeck() {
		Deck d = new Deck();
		System.out.println(d);
		d.shuffle();
		System.out.print(d);
		int card = d.dealCard();
		System.out.print(card + " ");
				
	}

}