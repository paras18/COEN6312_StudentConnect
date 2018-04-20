package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import javafx.scene.control.ScrollPane;

import javax.swing.JList;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AddCourse extends JFrame {
	String[] listA = {"Model Driven Software Engineering","Oprerating Systems","Introduction to Python"};
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AddCourse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Model Driven Software Engineering");
        listModel.addElement("Advanced Programming");
        listModel.addElement("Human computer Interface");
        listModel.addElement("Software Refactoring");
        listModel.addElement("Electrical Components and Behaviour");
        listModel.addElement("Oprerating Systems");
        listModel.addElement("Software Project Management");
        listModel.addElement("Software Re-engineering");
        listModel.addElement("Introduction to Python");
        listModel.addElement("Web Programming fundamentals");
               
       
        
		JList list = new JList(listModel);
		list.setBounds(42, 130, 219, 186);
		contentPane.add(list);
		
		List list_1 = new List();
		list_1.setBounds(431, 130, 229, 186);
		contentPane.add(list_1);
		
		
		JLabel lblAddCourseFor = new JLabel("Add Course for Student");
		lblAddCourseFor.setForeground(Color.ORANGE);
		lblAddCourseFor.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblAddCourseFor.setBounds(196, 27, 412, 58);
		contentPane.add(lblAddCourseFor);
		
		JLabel lblCourseListSaved = new JLabel("Course list Saved successfully");
		lblCourseListSaved.setBounds(261, 348, 241, 14);
		lblCourseListSaved.setVisible(false);
		contentPane.add(lblCourseListSaved);
		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.setBounds(286, 211, 121, 23);
		btnAddCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list_1.add((String)list.getSelectedValue());
				
			}
		});
		contentPane.add(btnAddCourse);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(431, 390, 111, 23);
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			listA = list_1.getItems();
			lblCourseListSaved.setVisible(true);
						
				
			}
		});
		contentPane.add(btnSave);
		
		JButton studentHome = new JButton("Student Home");
		studentHome.setBounds(128, 390, 133, 23);
		studentHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 Component component = (Component) e.getSource();
					JFrame frame = (JFrame) SwingUtilities.getRoot(component);
					frame.dispose();
					new StudentActionScreen().setVisible(true);
				
			}
		});
		contentPane.add(studentHome);
		
		JButton removeC = new JButton("remove Course");
		removeC.setBounds(286, 261, 121, 23);
		removeC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list_1.remove(list_1.getSelectedIndex());
				
			}
		});
		contentPane.add(removeC);
		
		
	}
}
