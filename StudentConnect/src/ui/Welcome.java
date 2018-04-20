package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
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
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToStudent = new JLabel("Welcome to Student Connect (Beta)", SwingConstants.CENTER);
		lblWelcomeToStudent.setBounds(24, -39, 684, 438);
		lblWelcomeToStudent.setForeground(Color.ORANGE);
		lblWelcomeToStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		frame.getContentPane().add(lblWelcomeToStudent);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(300, 239, 100, 23);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				frame.dispose();
				new LoginScreen().setVisible(true);
			}
		});
		frame.getContentPane().add(btnStart);
		frame.setBounds(400, 150, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
