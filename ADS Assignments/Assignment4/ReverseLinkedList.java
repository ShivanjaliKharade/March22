//reverse LinkedList using recursion
class ReverseLinkedList{
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
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	 Node reverse(Node curr, Node prev)
    {
        if (head == null)      //when list is empty
            return head;
        
        if (curr.next == null) {      //if head reach last node
            head = curr;
  
            curr.next = prev;   //assign prev to next
  
            return head;
        }
  
        Node next1 = curr.next;
        curr.next = prev;
  
        reverse(next1, curr);        //recursive call
        return head;
    }
	
	public static void main(String args[]){
		ReverseLinkedList l1 = new ReverseLinkedList();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		System.out.println("Original list");
		l1.display();
		
		System.out.println("Reverse list");
		Node res =l1.reverse(l1.head, null);
		l1.display();
}
}