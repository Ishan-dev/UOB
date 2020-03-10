package thankyou;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Admin_menu {

	private JFrame frame;
	private final JButton btnNewButton = new JButton("Check Report");
	private final JButton btnNewButton_1 = new JButton("Print PDF");
	private final JButton btnNewButton_2 = new JButton("E-mail");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_menu window = new Admin_menu();
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
	public Admin_menu() {
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
		btnNewButton.setBounds(305, 172, 148, 36);
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.setBounds(121, 172, 148, 36);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.setBounds(483, 172, 148, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("User : Admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel.setForeground(new Color(112, 128, 144));
		lblNewLabel.setBounds(305, 44, 199, 43);
		frame.getContentPane().add(lblNewLabel);
	}

}
