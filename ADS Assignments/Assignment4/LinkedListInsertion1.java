//Insertion At specified position in singly linkedlist
class LinkedListInsertion1{
	
	Node head;
	
	static class Node{      //regular inner class
		int data;
		Node next;       //next is ref obj of Node 
		
		Node(int d){     //constructor
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
	
	static void insertbetween(Node head, int new_data, int position){
		Node new_node = new Node(new_data);
		Node n = head;
		int index = 0;
		
		while(index < position-1){
			n = n.next;
			index++;
		}
		new_node.next =n.next;
		n.next = new_node;
		
		//return head;
	}
	
	//insert at end(append)
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(head == null){
			head = new_node;        
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
	
	
	public static void main(String args[]){
		LinkedListInsertion1 l1 = new LinkedListInsertion1();
		
		l1.append(33);   //to chk append if list is empty... only this line
		
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.display();
		
		l1.insertAfter(l1.head,60);
		System.out.println();
		l1.display();
		
		l1.insertAfter(l1.head.next,70);
		//l1.append(44);
		//l1.append(55);
		System.out.println();
		l1.display();
		
		l1.insertbetween(l1.head,200,4);
		System.out.println();
		l1.display();
	}
	
}