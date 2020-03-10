package thankyou;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questionarry01 {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("01. What is your gender?");
	private final JLabel lblNewLabel_1 = new JLabel("02. Which of the folowing describes your age?");
	private final JLabel lblNewLabel_2 = new JLabel("03. What is your current emplyment status?");
	private final JLabel lblNewLabel_3 = new JLabel("04. How much do you earn?");
	private final JLabel lblNewLabel_4 = new JLabel("05. Location where do you work?");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questionarry01 window = new Questionarry01();
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
	public Questionarry01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 855, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBounds(31, 113, 148, 36);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(31, 184, 275, 36);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(31, 258, 261, 36);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_3.setBounds(31, 327, 261, 36);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_4.setBounds(31, 407, 261, 36);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("06. Number of employees in your company?");
		lblNewLabel_5.setBounds(31, 496, 294, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Job Satisfication");
		lblNewLabel_6.setForeground(new Color(47, 79, 79));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_6.setBounds(221, 13, 327, 37);
		frame.getContentPane().add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(52, 158, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(206, 158, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("18-24");
		rdbtnNewRadioButton_4.setBounds(52, 229, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("25-34");
		rdbtnNewRadioButton_5.setBounds(206, 229, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("35-50");
		rdbtnNewRadioButton_6.setBounds(362, 229, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Above 50");
		rdbtnNewRadioButton_7.setBounds(527, 229, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Employed Full Time");
		rdbtnNewRadioButton_8.setBounds(52, 293, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Employed Part Time");
		rdbtnNewRadioButton_9.setBounds(206, 293, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Retired");
		rdbtnNewRadioButton_10.setBounds(362, 293, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Job Seeking");
		rdbtnNewRadioButton_11.setBounds(527, 293, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("0-25,000");
		rdbtnNewRadioButton_12.setBounds(52, 372, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("25,000-50,000");
		rdbtnNewRadioButton_13.setBounds(206, 373, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("50,000-75,000");
		rdbtnNewRadioButton_14.setBounds(362, 372, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("Above 75,000");
		rdbtnNewRadioButton_15.setBounds(527, 372, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("Colombo");
		rdbtnNewRadioButton_16.setBounds(52, 452, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("Galle");
		rdbtnNewRadioButton_17.setBounds(206, 452, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_17);
		
		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("Kandy");
		rdbtnNewRadioButton_18.setBounds(362, 452, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_18);
		
		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("Other");
		rdbtnNewRadioButton_19.setBounds(527, 452, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_19);
		
		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("0-50");
		rdbtnNewRadioButton_20.setBounds(52, 533, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_20);
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("50-100");
		rdbtnNewRadioButton_21.setBounds(206, 533, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_21);
		
		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("100-1000");
		rdbtnNewRadioButton_22.setBounds(362, 533, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_22);
		
		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("Above 1000");
		rdbtnNewRadioButton_23.setBounds(527, 533, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_23);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Questionarry01 cd = new Questionarry01();
		        //  cd.setVisible(true);
		        //  this.dispose();
		               
			}
		});
		btnNewButton.setBounds(724, 551, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
