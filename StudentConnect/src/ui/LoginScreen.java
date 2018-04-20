package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerLogic.Login;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	 public static JTextField textField;
	public static JTextField textField_1;
	static JButton btnLogin;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		Login screenLogic = new Login();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(424, 139, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLoginToStudent = new JLabel("Login To Student Connect", SwingConstants.CENTER);
		lblLoginToStudent.setBounds(92, 36, 241, 40);
		lblLoginToStudent.setForeground(Color.BLUE);
		lblLoginToStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		contentPane.add(lblLoginToStudent);
		
		JLabel lblEnterUsername = new JLabel("Enter Username : ");
		lblEnterUsername.setBounds(10, 111, 121, 14);
		contentPane.add(lblEnterUsername);
		
		JLabel lblEnterPassword = new JLabel("Enter Password : ");
		lblEnterPassword.setBounds(10, 136, 121, 14);
		contentPane.add(lblEnterPassword);
		
		 btnLogin = new JButton("Login");
		btnLogin.addActionListener(screenLogic);
		btnLogin.setBounds(104, 198, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				frame.dispose();
				new Register().setVisible(true);
			}
		});
		btnRegister.setBounds(224, 198, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnForgotPassword = new JButton("<HTML><FONT color=\"#000099\"><U>Forgot Password?</U></FONT></HTML>");
		btnForgotPassword.setBounds(135, 161, 150, 30);
		btnForgotPassword.setBorderPainted(false);
		btnForgotPassword.setOpaque(false);
		btnForgotPassword.setBackground(Color.WHITE);
		contentPane.add(btnForgotPassword);
		
		textField = new JTextField();
		textField.setBounds(123, 108, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 136, 114, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUseUsername = new JLabel("Use : username - admin");
		lblUseUsername.setBounds(267, 111, 143, 14);
		contentPane.add(lblUseUsername);
		
		JLabel lblUsePassword = new JLabel("Use : password - admin");
		lblUsePassword.setBounds(267, 136, 157, 14);
		contentPane.add(lblUsePassword);
		
		
	}
}
