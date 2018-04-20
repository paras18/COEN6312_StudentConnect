package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentWelcome extends JFrame {

	private JPanel contentPane;
	String[] streamList  = {"ComputerScience and Software Engineering","Electrical and Computer Engineering","Civil Engineering","Mechanical Engineering"};
	String[] courseList = {"Model Driven Software Engineering", "Advanced Programming Practises","Machine Learning","Cloud Computing"};
	static JComboBox streamBox;
	static JComboBox courseBox;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public StudentWelcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(424, 139, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeStudent = new JLabel("Welcome " + LoginScreen.textField.getText());
		lblWelcomeStudent.setForeground(Color.ORANGE);
		lblWelcomeStudent.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblWelcomeStudent.setBounds(140, 48, 161, 14);
		contentPane.add(lblWelcomeStudent);
		
		JLabel lblSelectStream = new JLabel("Select Stream : ");
		lblSelectStream.setBounds(37, 109, 99, 14);
		contentPane.add(lblSelectStream);
		
		JLabel lblSelectCourse = new JLabel("Select Course : ");
		lblSelectCourse.setBounds(37, 159, 99, 14);
		contentPane.add(lblSelectCourse);
		
		 streamBox = new JComboBox(streamList);
		streamBox.setBounds(146, 106, 240, 20);
		contentPane.add(streamBox);
		
		 courseBox = new JComboBox(courseList);
		courseBox.setBounds(146, 156, 240, 20);
		contentPane.add(courseBox);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnLogout.setBounds(335, 11, 89, 23);
		contentPane.add(btnLogout);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(168, 215, 89, 23);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				frame.dispose();
				new StudentActionScreen().setVisible(true);
			}
		});
		contentPane.add(btnOk);
	}
}
