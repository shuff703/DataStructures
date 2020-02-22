
public class Stack {
	
	private Money first;
	
	public Stack(){
		
		first = null;
		
	}
	
	public void push(Money m){
		
		m.setNext(this.first);
		this.first = m;
		
	}
	
	public boolean empty(){
		return first == null;
	}
	
	public Money pop(){
		
		if(empty()){
			
			return null;
			
		}
		
		Money m = this.first;
		this.first = this.first.getNext();
		return m;
		
	}
	
	public Money peek(){
		
		return this.first;
		
	}
	
}
