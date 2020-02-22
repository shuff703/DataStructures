
public class StripClub {
	
	private static Stack stack;
	private static int amountBlown = 0;
	
	private static void makeItRain(){
		
		while(stack.empty() == false){
			Money bill = stack.pop();
			amountBlown += bill.getAmount();
			System.out.println(bill.toString());
		}
		System.out.println("Amount Blown: $"+amountBlown);
	}
	
	public static void main(String[] args){
		
		stack = new Stack();
		
		for(int i = 0; i<500; i++){
			
			stack.push(new Money());
			
		}
		
		StripClub.makeItRain();
	}

}
