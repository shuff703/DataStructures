
public abstract class Employee {
	
	private String name;
	private String employeeID;
	
	public Employee(){
		
		this.name = this.employeeID = "";
		
	}
	
	public Employee(String name, String id){
		
		this.name = name;
		this.employeeID = id;
		
	}
	
	public abstract double pay();
	
	public String toString(){
		
		return "Name: " + this.name + "\tID: " + this.employeeID;
		
	}
	
}
