
public class TestDriver {
	
	public static void main(String [] fuck){
		
		PriorityQueue q = new PriorityQueue(70);
		for(int i = 0; i<100; i++){
			
			q.enqueue(new PriorityCustomer());
			
		}
		
		for(int i = 0; i<100; i++){
			
			PriorityCustomer temp = q.dequeue();
			
			if(temp != null){
				
				System.out.println("Customer "+ (i+1) + " Priority: "+ temp.getPriority());
				
			}
			
		}
	}

}
