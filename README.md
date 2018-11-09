# MyWork


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
				//this line of code has to be added
				if(cur == tail) {
            tail = prev;
        }
				return true;
			}
			
			prev = cur;
			cur = cur.next;
		}
		return false;
	}
