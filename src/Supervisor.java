
public class Supervisor extends Employee{

	private double salary;
	
	public Supervisor(){
		
		super();
		salary = 0;
		
	}
	
	public Supervisor(String name, String id, double salary){
		
		super(name, id);
		this.salary = salary;
		
	}
	
	public double pay(){
		
		return this.salary/12;
		
	}
	
	public String toString(){
		
		return super.toString() + "\tYearly Salary: " + this.salary;
		
	}
	
	

}
