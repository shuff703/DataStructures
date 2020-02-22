/**
 * 
 * non-indexed, holds references between nodes (Like LinkedList)
 * 		-Left, Right (References to children)
 * 
 * Do not have to be complete
 * 		-Holes and gaps can exist
 * 
 * Ordering Rule:
 * 		Values <= go to left
 * 		Values > go right 
 * 
 * Direct access to root node
 * 
 * Add Algorithm
 * 		1.  Compare new nodes value with subroot
 * 		2.  If <= go left, else go right
 * 		3.  Check if L/R child is null
 * 		4.  If null, put new node there.  If not
 * 			null, go to step 1 and set L/R child as 
 * 			the new subroot.
 * 
 * O(logn) complexity
 * 
 * *Rotation Concept*
 * 
 * Primarily used for searching
 * 
 * Traversal -- Algorithm that visits every node in a structure
 * 		Pre Order: Root, Left Subtree, Right Subtree
 * 		In Order: Left Subtree, Root, Right Subtree
 * 
 * 		(8, 11, 12, 13, 42, 68, 92)
 * 
 * 		Post Order: Left Subtree, Right Subtree, Root
 * 
 *
 */
public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree(){
		
		this.root = null;
		
	}
	
	public void insert(String s){
		
		
		if(this.root == null){
			
			this.root = new Node(s);
			
		}
		
		else{
			
			insert(s, root);
			
		}
	}
	
	private void insert(String s, Node subroot){
		
		if(s.equals(subroot.getValue())){
			
			subroot.incFrequency();
			
		}else{
			
			if(s.compareTo(subroot.getValue())>0){
				
				if(subroot.getRight() == null){
					
					subroot.setRight(new Node(s));
					
				}
				else{
					
					insert(s, subroot.getRight());
					
				}
				
			}else{
				
				if(subroot.getLeft() == null){
					
					subroot.setLeft(new Node(s));
					
				}
				else{
					
					insert(s, subroot.getLeft());
					
				}
			}
			
		}
		
	}
	
	
	public Node search(String key){
		
		if(this.root == null){
			
			System.out.println("EMPTY TREE");
			return null;
			
		}else{
			
			return search(key, root);
			
		}
		
	}
	
	private Node search(String key, Node subroot){
		
		if(key.equals(subroot.getValue())){
			
			System.out.println("Found: "+subroot.toString());
			return subroot;
			
		}
		else{
			if(key.compareTo(subroot.getValue()) > 0){
				
				if(subroot.getRight() == null){
					System.out.println("Not Found");
					return null;
					
				}
				else{
					
					return search(key, subroot.getRight());
					
				}
			}
			else{
				
				if(subroot.getLeft() == null){
					System.out.println("Not Found");
					return null;
					
				}
				else{
					
					return search(key, subroot.getLeft());
					
				}
			}
		}
	}
	
	public void printPreOrder(){
		
		System.out.println("-----PRE-ORDER-----");
		
		printPreOrder(this.root);
		
	}
	
	private void printPreOrder(Node subroot){
		
		System.out.println(subroot.toString());
		
		if(subroot.getLeft() != null){
			printPreOrder(subroot.getLeft());
		}
		if(subroot.getRight() != null){
			printPreOrder(subroot.getRight());
		}
		
	}
	
	public void printPostOrder(){
		
		System.out.println("-----POST-ORDER-----");
		printPostOrder(this.root);
		
	}
	
	private void printPostOrder(Node subroot){
		
		if(subroot.getLeft() != null){
			printPostOrder(subroot.getLeft());
		}
		if(subroot.getRight() != null){
			printPostOrder(subroot.getRight());
		}
		System.out.println(subroot.toString());
	}
	
	public void printInOrder(){
		
		System.out.println("-----IN-ORDER-----");
		printInOrder(this.root);
		
	}
	
	private void printInOrder(Node subroot){
		
		if(subroot.getLeft() != null){
			printInOrder(subroot.getLeft());
		}
		System.out.println(subroot.toString());
		
		if(subroot.getRight() != null){
			printInOrder(subroot.getRight());
		}
		
	}
	

}
