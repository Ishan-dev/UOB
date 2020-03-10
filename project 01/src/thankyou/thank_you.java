package thankyou;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class thank_you {

	private JFrame frame;
	private final JLabel lblNewLabel_1 = new JLabel("Password  :");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JButton btnNewButton = new JButton("Sign In");
	private final JLabel lblNewLabel_2 = new JLabel("User Login");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thank_you window = new thank_you();
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
	public thank_you() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(205, 92, 92));
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name  :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(347, 249, 116, 70);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(361, 332, 92, 36);
		frame.getContentPane().add(lblNewLabel_1);
		textField.setBounds(480, 268, 139, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField_1.setBounds(480, 334, 139, 36);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		btnNewButton.setBounds(508, 405, 92, 36);
		frame.getContentPane().add(btnNewButton);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel_2.setBounds(240, 95, 213, 51);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setBounds(100, 100, 855, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
