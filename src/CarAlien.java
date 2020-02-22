
public class CarAlien {
	
	private String id;
	private CarAlien next;
	
	public CarAlien(){
		
		next = null;
		id = "A" + (int) (Math.random() * 100);
		
	}
	
	public String toString(){
		return this.id;
	}
	
	public void setNext(CarAlien c){
		
		next = c;
		
	}
	
	public CarAlien getNext(){
		return this.next;
	}

}
