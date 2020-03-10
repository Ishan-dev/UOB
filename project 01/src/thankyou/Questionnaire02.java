package thankyou;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Questionnaire02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionnaire02 window = new Questionnaire02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Questionnaire02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBackground(new Color(176, 196, 222));
		frame.getContentPane().setForeground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 855, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Job Satisfication");
		lblNewLabel.setForeground(new Color(112, 128, 144));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setBounds(178, 13, 432, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("07. How motivated are you?");
		lblNewLabel_1.setBounds(47, 78, 262, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("08. How well do you know others?");
		lblNewLabel_2.setBounds(47, 160, 251, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("09. Working time?");
		lblNewLabel_3.setBounds(47, 243, 217, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("10. Are you a happy worker?");
		lblNewLabel_4.setBounds(47, 317, 198, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("10. How would you rate your progress upto now?");
		lblNewLabel_5.setBounds(47, 395, 292, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(586, 484, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Highly");
		rdbtnNewRadioButton.setBounds(57, 103, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Fairly");
		rdbtnNewRadioButton_1.setBounds(227, 103, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Not at all");
		rdbtnNewRadioButton_2.setBounds(389, 103, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Rather not say");
		rdbtnNewRadioButton_3.setBounds(542, 103, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Poor");
		rdbtnNewRadioButton_4.setBounds(57, 185, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Good");
		rdbtnNewRadioButton_5.setBounds(227, 185, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Average");
		rdbtnNewRadioButton_6.setBounds(389, 185, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Almost all");
		rdbtnNewRadioButton_7.setBounds(542, 185, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("4 hours");
		rdbtnNewRadioButton_8.setBounds(57, 268, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("6 hours");
		rdbtnNewRadioButton_9.setBounds(227, 268, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("8 housrs");
		rdbtnNewRadioButton_10.setBounds(389, 268, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("8 hours");
		rdbtnNewRadioButton_11.setBounds(542, 268, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Yes");
		rdbtnNewRadioButton_12.setBounds(57, 342, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("No");
		rdbtnNewRadioButton_13.setBounds(227, 342, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("2 Stars");
		rdbtnNewRadioButton_14.setBounds(57, 420, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("3 Stars");
		rdbtnNewRadioButton_15.setBounds(227, 420, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("4 Stars");
		rdbtnNewRadioButton_16.setBounds(389, 420, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("5 Stars");
		rdbtnNewRadioButton_17.setBounds(542, 420, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_17);
	}

}
