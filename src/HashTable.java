
public class HashTable {
	
	private int size;
	LinkedListQueue [] map;
	
	public HashTable(){
		this.size = 500;
		map = new LinkedListQueue[size];
		for(int i = 0; i<map.length; i++){
			map[i] = new LinkedListQueue();
		}
	}
	
	public HashTable(int size){
		this.size = size;
		map = new LinkedListQueue[this.size];
		for(int i = 0; i<map.length; i++){
			map[i] = new LinkedListQueue();
		}
	}
	
	public void add(Course c){
		map[hash(c.hashCode())].enqueue(c);
	}
	
	public Course search(int key){
		Course c = map[hash(key)].peek();
		if(c.hashCode() != key){
			
		}
	}
	
	public Course remove(int key){
		
	}
	
	private int hash(int key){
		return key%size;
	}

}
