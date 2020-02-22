
public class Money {
	
	private Money next;
	private int amount;
	
	public Money(){
		
		next = null;
		switch((int) (Math.random()*6)){
		
		case 0:
			this.amount = 1;
			break;
		case 1:
			this.amount = 5;
			break;
		case 2:
			this.amount = 10;
			break;
		case 3:
			this.amount = 20;
			break;
		case 4:
			this.amount = 50;
			break;
		case 5:
			this.amount = 100;
			break;
		}
	}
	
	public void setNext(Money m){
		this.next = m;
	}
	
	public Money getNext(){
		return this.next;
	}
	
	public String toString(){
		return "$"+this.amount;
	}
	public int getAmount(){
		return this.amount;
	}

}
