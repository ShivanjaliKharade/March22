//Swap pairs in given LinkedList
class LinkedListPairSwap{
	
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
			System.out.print(n.data+" ");   
			n=n.next;                     
		}
		System.out.println();
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
	
	//insert at specific position
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
	
	
	//Swap pairs
	void swapPairs()
    {
        Node temp = head;
        while (temp != null && temp.next != null) {
 
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
	
	public static void main(String args[]){
		LinkedListPairSwap l1 = new LinkedListPairSwap();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		l1.insert(70);
		l1.insert(80);
		l1.insert(90);
		l1.insert(100);
		l1.display();
		
		l1.swapPairs();
		System.out.println();
		l1.display();
		
	}
	
}