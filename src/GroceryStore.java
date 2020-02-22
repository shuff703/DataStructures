
public class GroceryStore {
	
	public static void main(String [] args){
		
		PriorityQueue q = new PriorityQueue(49);
		
		//variables for running total and comparison
		int numServiced = 0;
		
		int maxSize = q.size();
		
		PriorityCustomer current = null;
		
		//loop for 60 minutes
		for(int i = 0; i<60; i++){
			
			//25% probability
			if((int) (Math.random()*4) == 1){
				
				PriorityCustomer temp = new PriorityCustomer();
				
				//add customer to queue
				q.enqueue(temp);
				
				//check for largest queue size
				if(q.size() > maxSize){
					
					maxSize = q.size();
					
				}
				
				//adjust queue size if customer is currently being serviced
				if(current == null){
					
					System.out.println("New customer added!  Queue length is now "+q.size());
					
				}
				
				else{
					
					System.out.println("New customer added!  Queue length is now "+(q.size()+1));
					
				}
				
			}
			
			//remove customer from heap
			if(current == null){
				
				current = q.dequeue();
				
			}
			
			//manipulate customer if present
			if(current != null){
				
				//decrease time
				current.decServiceTime();
				if(current.getServiceTime() < 1){
					
					//remove customer if time is 0
					current = null;
					System.out.println("Customer serviced and removed from queue.  Length is now "+q.size());
					numServiced++;
					
				}
				
			}
			System.out.println("----------------------------------------------------------------");
		}
		
		//display max length and number of customers serviced
		System.out.println("Max line length: " + maxSize);
		System.out.println("Number of customers serviced: " + numServiced);
	}

}
