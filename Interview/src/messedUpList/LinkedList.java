package messedUpList;

public class LinkedList {
	
	private ListNode head;
	private ListNode tail;
	
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

}
