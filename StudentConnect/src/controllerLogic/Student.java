// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package controllerLogic;

import controllerLogic.User;

/************************************************************/
/**
 * class Student specializes User {
  * 
  * 	private student_id: Integer;
  * 	public student_name: String;
  * 	public updateStudentInfo(in email: String, in contact: String,
  * 		in address: String, in password: String): Boolean;
  * 	public getStudent_id(): Integer;
  * 	public setStudent_id();
  * 
  * }
 */
public class Student extends User {
	/**
	 * 
	 */
	private int student_id;
	/**
	 * 
	 */
	public String student_name;

	/**
	 * 
	 * @param email 
	 * @param contact 
	 * @param address 
	 * @param password 
	 * @return 
	 */
	public boolean updateStudentInfo(String email, String contact, String address, String password) {
		return true;
	}

	/**
	 * 
	 * @return 
	 */
	public int getStudent_id() {
		return student_id;
	}

	/**
	 * 
	 * @param student_id 
	 */
	public void setStudent_id(int student_id) {
	}
};