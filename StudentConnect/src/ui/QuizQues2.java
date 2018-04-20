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

public class QuizQues2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public QuizQues2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuestion = new JLabel("Question  2  :   Which is  a UML diagram?");
		lblQuestion.setBounds(109, 57, 416, 32);
		lblQuestion.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(lblQuestion);
		
		JRadioButton rdbtnClassDiagram = new JRadioButton("Class Diagram");
		rdbtnClassDiagram.setBounds(167, 128, 134, 23);
		contentPane.add(rdbtnClassDiagram);
		
		JRadioButton rdbtnStateDiagram = new JRadioButton("Foot Diagram");
		rdbtnStateDiagram.setBounds(167, 180, 145, 23);
		contentPane.add(rdbtnStateDiagram);
		
		JRadioButton rdbtnHandDiagram = new JRadioButton("Hand Diagram");
		rdbtnHandDiagram.setBounds(167, 240, 134, 23);
		contentPane.add(rdbtnHandDiagram);
		
		JRadioButton rdbtnSequenceDiagram = new JRadioButton("Sky Diagram");
		rdbtnSequenceDiagram.setBounds(169, 296, 160, 23);
		contentPane.add(rdbtnSequenceDiagram);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnClassDiagram);
		buttonGroup.add(rdbtnStateDiagram);
		buttonGroup.add(rdbtnHandDiagram);
		buttonGroup.add(rdbtnSequenceDiagram);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(222, 388, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new QuizQues1().setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(408, 388, 89, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new QuizQues3().setVisible(true);
			}
		});
		contentPane.add(btnNext);
		getContentPane().setBackground(Color.WHITE);
	}
}
