package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizFirstWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public QuizFirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(400, 150, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(StudentWelcome.courseBox.getSelectedItem().toString());
		lblNewLabel.setBounds(120, 35, 581, 58);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		getContentPane().add(lblNewLabel);
		
		JLabel quizLabel = new JLabel("QUIZ");
		quizLabel.setBounds(300, 80, 69, 58);
		quizLabel.setForeground(Color.BLACK);
		quizLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		getContentPane().add(quizLabel);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel lblQuizNo = new JLabel("Quiz No.  :   1");
		lblQuizNo.setBounds(133, 236, 122, 14);
		contentPane.add(lblQuizNo);
		
		JLabel lblDuration = new JLabel("Duration  :   30 mins");
		lblDuration.setBounds(133, 272, 153, 14);
		contentPane.add(lblDuration);
		
		JButton btnStartQuiz = new JButton("Start Quiz");
		btnStartQuiz.setBounds(183, 354, 103, 23);
		btnStartQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new QuizQues1().setVisible(true);
			}
		});
		contentPane.add(btnStartQuiz);
		
		JButton back = new JButton("Back");
		
		back.setBounds(393, 354, 89, 23);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new StudentActionScreen().setVisible(true);
				
			}
		});
		contentPane.add(back);
	}
}
