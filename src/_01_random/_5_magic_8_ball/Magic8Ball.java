//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {

		// 2. Get the user to enter a question for the 8 ball to answer
		String input = JOptionPane.showInputDialog("What is your question?");
		// 3. Make a variable and initialize it to a random number.
		// ** You will need to make a random object!
		// Limit the random numbers to be between 0 and 3
		Random ran = new Random();
		int num = ran.nextInt(4);
		
		if (num == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		else if (num == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		else if (num == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Try asking again");
		}
		
		switch(num) {
		case 0: 
			JOptionPane.showMessageDialog(null, "Yes");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "No");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Ask Google");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Try asking again");
		}
	}
}
