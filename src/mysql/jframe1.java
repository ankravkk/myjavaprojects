package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.UIManager;

public class jframe1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframe1 frame = new jframe1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jframe1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setIgnoreRepaint(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtLogin.setBackground(Color.CYAN);
		txtLogin.setText("LOGIN PAGE");
		txtLogin.setBounds(150, 43, 136, 35);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 89, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(UIManager.getColor("Button.background"));
		txtpnUsername.setText("Username");
		txtpnUsername.setBounds(144, 89, 60, 20);
		contentPane.add(txtpnUsername);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(UIManager.getColor("Button.background"));
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(144, 130, 52, 20);
		contentPane.add(txtpnPassword);
		
		textField = new JTextField();
		textField.setBounds(197, 130, 89, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(181, 161, 89, 23);
		contentPane.add(btnLogin);
	}
}
