//only deletion at specified position
class LinkedListDeletion1{
	
	Node head;
	
	static class Node{      
		int data;
		Node next;       
		
		Node(int d){     
			data=d;
			next=null;
		}
	}
	
	void display(){
		Node n = head;     
		while(n!=null){    
			System.out.println(n.data);   
			n=n.next;                     
		}
	}
	//above codes are common for linkedlist
	
	//inset at beginning
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	//insert in between
	void insertAfter(Node prev, int new_data){
		if(prev==null){
			System.out.println("Insertion not possible.");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev.next;
		prev.next = new_node;
	}
	
	//insert at end(append)
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;          //error???????
			return;
		}
		new_node.next = null;
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
		return;
	}
	
	void delete(int key){
		Node temp = head, prev = null;
		//case1 : delete first node
		if(temp.data == key && temp != null){
			head = temp.next;
			return;
		}
		//case2 : delete inbetween
		while(temp!=null && temp.data!=key){
			prev = temp;         
			temp = temp.next;     
		}
		//case3 : last node
		if(temp==null)      
			return;          
		
		//just to establish connection
		prev.next = temp.next;
	}
	
	//delete at specified position
	static void deleteAt(Node head, int position){
		
		Node n = head;
		int index = 0;
		
		while(index < position-1){
			n = n.next;
			index++;
		}
		n.next = n.next.next;
	}
	
	
	
	public static void main(String args[]){
		LinkedListDeletion1 l1 = new LinkedListDeletion1();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		l1.insert(70);
		l1.insert(80);
		l1.display();
		
		
		l1.deleteAt(l1.head,3);
		System.out.println();
		l1.display();
	}
}