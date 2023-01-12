package springmvc;

import java.util.ArrayList;

public class HelloDTO {
	String message;
	ArrayList<String> members;
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<String> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<String> members) {
		this.members = members;
	}
	
	

	
	
}