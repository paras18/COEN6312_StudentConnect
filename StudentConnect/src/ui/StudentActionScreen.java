package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class StudentActionScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public StudentActionScreen() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogout = new JButton("logout");
		btnLogout.setBounds(width-150, 11, 89, 23);
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		contentPane.add(btnLogout);
		
		JLabel label = new JLabel();
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		label.setText(StudentWelcome.streamBox.getSelectedItem().toString());
		label.setHorizontalAlignment(SwingUtilities.CENTER);
		label.setVerticalAlignment(SwingUtilities.CENTER);
		label.setBounds(325, 43, 626, 114);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setText(StudentWelcome.courseBox.getSelectedItem().toString());
		lblNewLabel.setHorizontalAlignment(SwingUtilities.CENTER);
		lblNewLabel.setVerticalAlignment(SwingUtilities.CENTER);
		lblNewLabel.setBounds(325, 90, 626, 114);
		contentPane.add(lblNewLabel);
		
		JButton uploadAssignment = new JButton("<HTML><FONT color=\"#000099\"><U>Add/Remove Courses</U></FONT></HTML>");
		uploadAssignment.setBounds(500, 250, 330, 30);
		uploadAssignment.setForeground(Color.ORANGE);
		uploadAssignment.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		uploadAssignment.setBorderPainted(false);
		uploadAssignment.setOpaque(false);
		uploadAssignment.setBackground(Color.WHITE);
		uploadAssignment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				frame.dispose();
				new AddCourse().setVisible(true);
				
			}
		});
		contentPane.add(uploadAssignment);
		
		JButton attemptQuiz = new JButton("<HTML><FONT color=\"#000099\"><U>Attempt Quiz</U></FONT></HTML>");
		attemptQuiz.setBounds(500, 300, 330, 30);
		attemptQuiz.setForeground(Color.ORANGE);
		attemptQuiz.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		attemptQuiz.setBorderPainted(false);
		attemptQuiz.setOpaque(false);
		attemptQuiz.setBackground(Color.WHITE);
		attemptQuiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Component component = (Component) e.getSource();
				JFrame frame = (JFrame) SwingUtilities.getRoot(component);
				frame.dispose();
				new QuizFirstWindow().setVisible(true);
				
			}
		});
		contentPane.add(attemptQuiz);
		
//		JButton forum = new JButton("<HTML><FONT color=\"#000099\"><U>Drop Course</U></FONT></HTML>");
//		forum.setBounds(500, 350, 330, 30);
//		forum.setForeground(Color.ORANGE);
//		forum.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
//		forum.setBorderPainted(false);
//		forum.setOpaque(false);
//		forum.setBackground(Color.WHITE);
//		contentPane.add(forum);
//		
//		JButton lecRecordings = new JButton("<HTML><FONT color=\"#000099\"><U>Lecture Recordings</U></FONT></HTML>");
//		lecRecordings.setBounds(500, 400, 330, 30);
//		lecRecordings.setForeground(Color.ORANGE);
//		lecRecordings.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
//		lecRecordings.setBorderPainted(false);
//		lecRecordings.setOpaque(false);
//		lecRecordings.setBackground(Color.WHITE);
//		contentPane.add(lecRecordings);
//		
//		JButton studyRes = new JButton("<HTML><FONT color=\"#000099\"><U>Study Resources</U></FONT></HTML>");
//		studyRes.setBounds(500, 450, 330, 30);
//		studyRes.setForeground(Color.ORANGE);
//		studyRes.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
//		studyRes.setBorderPainted(false);
//		studyRes.setOpaque(false);
//		studyRes.setBackground(Color.WHITE);
//		contentPane.add(studyRes);
		
		JButton myGrades = new JButton("<HTML><FONT color=\"#000099\"><U>My Grades</U></FONT></HTML>");
		myGrades.setBounds(500, 350, 330, 30);
		myGrades.setForeground(Color.ORANGE);
		myGrades.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		myGrades.setBorderPainted(false);
		myGrades.setOpaque(false);
		myGrades.setBackground(Color.WHITE);
		myGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new ViewGrade().setVisible(true);
			}
		});
		contentPane.add(myGrades);
	
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
				new StudentWelcome().setVisible(true);
				
			}
		});
		back.setBounds(620, 580, 100, 40);
		getContentPane().add(back);
		
	}

}
