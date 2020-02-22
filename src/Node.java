
public class Node {
	
	private Node leftChild, rightChild;
	private String value;
	private int frequency;
	
	public Node(){
		
		this.leftChild = this.rightChild = null;
		this.value = null;
		this.frequency = 0;
		
	}
	
	public Node(String value){
		
		this.leftChild = this.rightChild = null;
		this.value = value;
		this.frequency = 1;
		
	}
	
	public void setLeft(Node left){
		
		this.leftChild = left;
		
	}
	
	public void setRight(Node right){
		
		this.rightChild = right;
		
	}
	
	public void setValue(String value){
		
		this.value = value;
		
	}
	
	public void incFrequency(){
		
		this.frequency++;
		
	}
	
	public Node getLeft(){
		
		return this.leftChild;
		
	}
	
	public Node getRight(){
		
		return this.rightChild;
		
	}
	
	public String getValue(){
		
		return this.value;
		
	}
	
	public String toString(){
		
		return "Value: "+this.value+"\tFrequency: "+this.frequency;
		
	}

}
