package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class StringConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Enter a whole number:");
		int num = Integer.parseInt(input);
		
		num++;
		
		JOptionPane.showMessageDialog(null, num);
	}

}
