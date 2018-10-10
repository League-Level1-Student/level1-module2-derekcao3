import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	
String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
String cookTime = JOptionPane.showInputDialog("How long do you want to microwave your popcorn for?");
Popcorn popcorn = new Popcorn(flavor);
Microwave micro = new Microwave();
micro.putInMicrowave(popcorn);
int cookTimeInMinutes = Integer.parseInt(cookTime);
micro.setTime(cookTimeInMinutes);
micro.startMicrowave();
popcorn.eat();
}
}
