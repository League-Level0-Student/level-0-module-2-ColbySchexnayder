package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lotteryNumbers = "";
		Random ran = new Random();
		
		for (int i = 0; i < 5; i++) {
			lotteryNumbers += ran.nextInt(100) + " ";
		}
		
		JOptionPane.showMessageDialog(null, lotteryNumbers);
	}

}
