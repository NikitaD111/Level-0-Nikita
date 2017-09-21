import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

		// 2. On paper, write all the numbers that get printed when you run this
		// class

		for (int i = 0; i < 5; i++) {
			int r = new Random().nextInt(5);
			// 3. Use the randomNumber to give the user a random compliment.
			if (r == 0) {
				JOptionPane.showMessageDialog(null, "you are good at breathing");
			}
			// 4. Repeat all the code above 10 times
			if (r == 0) {
				JOptionPane.showMessageDialog(null, "You are not a waste of space");
			}
			if (r == 1) {
				JOptionPane.showMessageDialog(null, "You are not a waste of air");
			}
			if (r == 2) {
				JOptionPane.showMessageDialog(null, "You should not be sent into the sun");
			}
			if (r == 3) {
				JOptionPane.showMessageDialog(null, "Get outta mai facae");
			}
			if (r == 4) {
				JOptionPane.showMessageDialog(null, "I is like your acne");

			}
			// 5. Find someone to test out your program. They will like it :)
		}
	}
}
