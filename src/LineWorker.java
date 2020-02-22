
public class LineWorker extends Employee{
	
	private double hourlyWage;
	private double hoursWorked;
	
	public LineWorker(){
		
		super();
		this.hourlyWage = this.hoursWorked = 0;
		
	}
	
	public LineWorker(String name, String id, double wage, double hours){
		
		super(name, id);
		this.hourlyWage = wage;
		this.hoursWorked = hours;
		
	}
	
	public double pay(){
		
		return this.hourlyWage * this.hoursWorked;
		
	}
	
	public String toString(){
		
		return super.toString()+"\tWage: " + this.hourlyWage + "\tHours " + this.hoursWorked;
		
	}

}
