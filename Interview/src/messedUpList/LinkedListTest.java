package messedUpList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testAdd() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		assertEquals("A", list.getFirst());
		assertEquals("C", list.getLast());
	}
	
	@Test
	public void testRemoveFirst() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		assertTrue(list.remove("A"));
		assertEquals("B", list.getFirst());
		assertEquals("C", list.getLast());
	}
	
	@Test
	public void testRemoveLast() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		assertTrue(list.remove("C"));
		assertEquals("A", list.getFirst());
		assertEquals("B", list.getLast());
	}
	
	@Test
	public void testIterate() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		LinkedList.Iterator iter = list.iterator();
		assertTrue(iter.hasNext());
		assertEquals("A", iter.next());
		assertTrue(iter.hasNext());
		assertEquals("B", iter.next());
		assertTrue(iter.hasNext());
		assertEquals("C", iter.next());
		assertFalse(iter.hasNext());
	}
	
	@Test
	public void testIteratorRemoveFirst() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		LinkedList.Iterator iter = list.iterator();
		iter.next();
		assertEquals("A", iter.remove());
		assertTrue(iter.hasNext());
		assertEquals("B", iter.next());
		
		assertEquals("B", list.getFirst());
	}
	
	@Test
	public void testIteratorRemoveMiddle() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		LinkedList.Iterator iter = list.iterator();
		iter.next();
		iter.next();
		assertEquals("B", iter.remove());
		assertTrue(iter.hasNext());
		assertEquals("C", iter.next());
		
		assertEquals("A", list.getFirst());
		assertEquals("C", list.getLast());
	}
	
	@Test
	public void testIteratorRemoveLast() {
		LinkedList list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		LinkedList.Iterator iter = list.iterator();
		iter.next();
		iter.next();
		iter.next();
		assertEquals("C", iter.remove());
		assertFalse(iter.hasNext());
		
		assertEquals("A", list.getFirst());
		assertEquals("B", list.getLast());
	}
	
}
