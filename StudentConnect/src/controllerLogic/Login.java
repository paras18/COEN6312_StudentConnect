package controllerLogic;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import ui.LoginScreen;
import ui.StudentWelcome;

public class Login implements ActionListener {

	String username = "admin";
	String password = "admin";
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("Login")){
			
			login(e);
		}
		
	}

	public void login(ActionEvent e){
		if(LoginScreen.textField.getText().equals(username) && LoginScreen.textField_1.getText().equals(password)){
			Component component = (Component) e.getSource();
			JFrame frame = (JFrame) SwingUtilities.getRoot(component);
			frame.dispose();
			new StudentWelcome().setVisible(true);
		}
	}
}
