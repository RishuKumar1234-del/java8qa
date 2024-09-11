package java8qa;

public class Employee {
	
	int id;
	private String name;
	private String dept;
	private int sallary;
	
	
	
	public Employee(int id, String name, String dept, int sallary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sallary = sallary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sallary=" + sallary + "]";
	}
	
	
	
	

}
