package Sample;

public class Linked {
	
	private ListNode head;
	private ListNode tail;
	
	//creating a double linked list so creating a static class
	public static Node head1;
	
	  static class Node { 
		   
	        Object data; 
	        Node next, prev; 
	  
	        Node(Object d) { 
	            data = d; 
	            next = prev = null; 
	        } 
	    } 
	 
	    
	
	/**
	 * Adds the specified object to the end of the list.
	 * @param obj
	 */
	public void add(Object obj) {
		ListNode node = new ListNode();
		node.obj = obj;
		
		if(tail != null) {
			tail.next = node;
		} else {
			head = node;
		}
		tail = node;
	}
	

	
	/**
	 * Removes the first occurrence of the specified object, if it exists.
	 * @return True if the object was removed, false if it was not found.
	 */
	public boolean remove(Object obj) {
		ListNode cur = head;
		ListNode prev = null;
		while(cur != null) {
			if(cur.obj.equals(obj)) {
				if(prev != null) {
					prev.next = cur.next;
				}
				if(cur == head) {
					head = cur.next;
				}
				return true;
			}
			
			prev = cur;
			cur = cur.next;
		}
		return false;
	}
	
	public Object getFirst() {
		return head == null ? null : head.obj;
	}
	
	public Object getLast() {
		return tail == null ? null : tail.obj;
	}
	
	public Iterator iterator() {
		Iterator iter = new Iterator();
		iter.next = head;
		return iter;
	}
	
	public class Iterator {
		
		private ListNode prev;
		private ListNode cur;
		private ListNode next;
		
		public boolean hasNext() {
			return next != null;
		}
		
		public Object next() {
			if(!hasNext()) {
				throw new IllegalStateException("This collection has no more elements.");
			}
			prev = cur;
			cur = next;
			next = next.next;
			return cur.obj;
		}
		
		/**
		 * Removes from the underlying collection the last element returned by the iterator;
		 * @return
		 */
		public Object remove() {
			if(cur == null) {
				throw new IllegalStateException("next() has not been called yet, or remove() has already been called for this item");
			}
			if(prev != null) {
				prev.next = next;
			}
			if(head == cur) {
				head = next;
			}
			if(tail == cur) {
				tail = prev;
			}
			Object obj = cur.obj;
			cur = null;
			return obj;
		}
		
	}
	
	private class ListNode {
		
		Object obj;
		ListNode next;
		
	}
	
	 
	//push some data to the node.
 public void push(Object data) { 
       
        Node node = new Node(data); 
  
        node.prev = null; 

        node.next = head1; 
  	      
        if (head1 != null) { 
            head1.prev = node; 
        }   
     
        head1 = node; 
    } 


  
  /* method to reverse a Doubly Linked List */
  public  void reverse() { 
        Node temp = null; 
        Node current = head1; 
  
      
        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        } 
  
       
        if (temp != null) { 
            head1 = temp.prev; 
        } 
    } 
    
  public void printList(Node node)
  {
	  while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
  }
    
	
	public static void main(String[] args) {
		
		   
	      Linked list = new Linked();   
	      
	      list.push("2");
	      list.push("3");
	      list.push("4");
	      
	      System.out.println("Original linked list ");
	      list.printList(head1);
	      
	      list.reverse();
	      
	      System.out.println("The reversed Linked List is "); 
	      list.printList(head1);
	      
	}


}
