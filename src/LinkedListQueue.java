/**
 * LinkedListQueue represents a Data structure formed by
 * individual objects referencing the next object in the
 * list.  The queue also keeps track of the first element,
 * last element, and the size of the queue.
 * 
 * @author Scott Huff
 * @version September 29, 2016
 *
 */
public class LinkedListQueue {
	
	private Course first, last;
	private int size;
	
	/**
	 * Default no-args constructor, instantiates an empty
	 * LinkedListQueue
	 */
	public LinkedListQueue(){
		
		this.size = 0;
		this.first = null;
		this.last = null;
		
	}
	
	/**
	 * Peek method views the first element in the queue,
	 * allowing it to be manipulated without removing it.
	 * 
	 * @return Customer - first element in queue
	 */
	public Course peek(){
		
		return this.first;
		
	}
	
	/**
	 * Enqueue method adds a customer to the end of queue,
	 * checks to see if queue is empty, updates first and
	 * last in the queue, also updates the next reference
	 * for the previous last object in the queue.
	 * 
	 * @param Customer - object to add to the end of queue 
	 */
	public void enqueue(Course c){
		
		//Check first value
		if(this.first == null){
			
			this.first = c;
			
		}
		else{
			
			//Link last element to new element
			this.last.setNext(c);
			
		}
		//Update last element and queue size
		this.last = c;
		size++;
	}
	
	/**
	 * Dequeue method removes first object from the queue.
	 * Checks if queue is empty, checks if after removal of
	 * first object that queue will be empty and updates 
	 * first, last and size accordingly.
	 * 
	 * @return Customer - First object in queue to be removed
	 */
	public Course dequeue(){
		
		Course c = this.first;
		
		if(first == null){
			System.out.println("The line is empty.");
			return null;
		}
		
		this.first = this.first.getNext();
		size--;
		
		if(first == null){
			last = null;
		}
		
		return c;

	}
	
	/**
	 * Size method retrieves current size of queue
	 * 
	 * @return int - size of queue
	 */
	public int size(){
		
		return this.size;
		
	}

}
