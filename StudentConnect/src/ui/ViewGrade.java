package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

public class ViewGrade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ViewGrade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Result Page");
		lblQuestion.setBounds(263, 58, 209, 32);
		lblQuestion.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		lblQuestion.setForeground(Color.RED);
		contentPane.add(lblQuestion);
		
				
		JButton btnNewButton = new JButton("Student Home");
		btnNewButton.setBounds(282, 388, 151, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new StudentActionScreen().setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblTimeTaken = new JLabel("Time Taken   :    28 minutes");
		lblTimeTaken.setBounds(180, 163, 172, 14);
		contentPane.add(lblTimeTaken);
		
		JLabel lblStatusCompleted = new JLabel("Status   :   Completed");
		lblStatusCompleted.setBounds(180, 211, 172, 14);
		contentPane.add(lblStatusCompleted);
		
		JLabel lblMarksObtained = new JLabel("Marks Obtained   :     3");
		lblMarksObtained.setBounds(180, 263, 172, 14);
		contentPane.add(lblMarksObtained);
		
		JLabel lblYourGrade = new JLabel("Your  Grade    :     A");
		lblYourGrade.setBounds(180, 327, 172, 14);
		contentPane.add(lblYourGrade);
		
	}
}
