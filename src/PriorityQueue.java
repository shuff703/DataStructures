
public class PriorityQueue {
	
	private PriorityCustomer [] heap;
	private int size;
	
	/**
	 * Constructor to set heap with a defined size
	 * 
	 * @param heapSize
	 */
	public PriorityQueue(int heapSize){
		
		heap = new PriorityCustomer[heapSize];
		this.size = 0;
		
	}
	
	/**
	 * Adds object to heap and sorts based on max
	 * value.
	 * 
	 * @param pc - Object to add to heap
	 */
	public void enqueue(PriorityCustomer pc){
		
		//Out of bounds check
		if(++size < heap.length){
			
			//Assign arguments to bottom left open node
			heap[size] = pc;
			int i = size;
			
			//swap added node with parent nodes until less than
			//or equal to parent
			while(i>1){
				
				i/=2;
				
				if(heap[i].getPriority() < pc.getPriority()){
					
					heap[size] = heap[i];
					heap[i] = pc;
					
				}
				else{
					
					break;
					
				}
			}
			
		}
		//if heap is full print message 
		else{
		
			System.out.println("Heap is full");
			size--;
			
		}
		
	}
	
	/**
	 * Removes top element from heap and restructures tree
	 * by max value
	 * 
	 * @return root - Top element of heap
	 */
	public PriorityCustomer dequeue(){
		
		//Null Check
		if(size == 0){
			
			return null;
			
		}
		
		//index
		int i = 1;
		
		//Assign reference to root and remove from heap
		//Last node assigned to root
		PriorityCustomer root = heap[i];
		
		heap[i] = heap[size];
		heap[size--] = null;
		
		//Null check
		if(size == 0){
			
			return root;
			
		}
		
		int leftPriority;
		int rightPriority;
		
		//Check child node's priority vs parent node
		//Pushing the node assigned to root down the tree
		
		//Check for null values
		while(i*2 <= size){
			
			leftPriority = heap[i*2].getPriority();
			
			rightPriority = Integer.MIN_VALUE;
			
			//Null check for right child
			if(heap[i*2+1] != null){
				
				rightPriority = heap[i*2+1].getPriority();
				
			}
			
			PriorityCustomer temp;
			
			//Test against left child node for swap
			if(leftPriority > rightPriority){
				
				//swap nodes if necessary
				if(heap[i].getPriority()<leftPriority){
					temp = heap[i];
					heap[i] = heap[i*2];
					heap[i*2] = temp;
					
					i *= 2;
					
				}
				else{
					break;
				}
			}
			
			//test against right child node for swap
			else{
				
				//swap nodes if necessary
				if(heap[i].getPriority() < rightPriority){
					
					temp = heap[i];
					heap[i] = heap[i*2+1];
					heap[i*2+1] = temp;
					
					i = i*2+1;
				}
				else{
					break;
				}
			}
		}
		
		//Return initial root reference
		return root;
	}
	
	/**
	 * Method to return size field (index) of the heap
	 * 
	 * @return size 
	 */
	public int size(){
		
		return this.size;
		
	}
	

}
