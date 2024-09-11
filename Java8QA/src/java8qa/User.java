package java8qa;

import java.util.List;

public class User {
	
	private String name;
	private long phone;
	private List<String> emails;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String name, long phone, List<String> emails) {
		super();
		this.name = name;
		this.phone = phone;
		this.emails = emails;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public List<String> getEmails() {
		return emails;
	}


	public void setEmails(List<String> emails) {
		this.emails = emails;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", emails=" + emails + "]";
	}
	
	
	

}
