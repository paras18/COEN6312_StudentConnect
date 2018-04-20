// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package controllerLogic;

import controllerLogic.User;

/************************************************************/
/**
 * class Professor specializes User {
  * 
  * 	private professor_id: Integer;
  * 	public professor_name: String;
  * 	public office_address: String;
  * 	private course_id: Integer;
  * 	public updateProfessorInfo(in email: String, in contact: String,
  * 		in address: String, in password: String, in course_id: Integer): Boolean;
  * 	public getCourse_id(): Integer;
  * 	public setCourse_id(in course_id: Integer);
  * 	public getProfessor_id(): Integer;
  * 	public setProfessor_id(in professor_id: Integer);
  * 
  * }
 */
public class Professor extends User {
	/**
	 * 
	 */
	private int professor_id;
	/**
	 * 
	 */
	public String professor_name;
	/**
	 * 
	 */
	public String office_address;
	/**
	 * 
	 */
	private int course_id;

	/**
	 * 
	 * @param email 
	 * @param contact 
	 * @param address 
	 * @param password 
	 * @param course_id 
	 * @return 
	 */
	public boolean updateProfessorInfo(String email, String contact, String address, String password, int course_id) {
		return true;
	}

	/**
	 * 
	 * @return 
	 */
	public int getCourse_id() {
		return course_id;
	}

	/**
	 * 
	 * @param course_id 
	 */
	public void setCourse_id(int course_id) {
	}

	/**
	 * 
	 * @return 
	 */
	public int getProfessor_id() {
		return course_id;
	}

	/**
	 * 
	 * @param professor_id 
	 */
	public void setProfessor_id(int professor_id) {
	}
};
