package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String age = JOptionPane.showInputDialog("How old are you?");
		int i_age = Integer.parseInt(age);
		
		if (i_age >= 18) {
			JOptionPane.showInputDialog("Who should the president be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think...");
		}
		
	}

}
