package com.glitterlabs.datastructures.queue;

import junit.framework.TestCase;

public class QueueClassTest extends TestCase 
{
	
	public QueueClassTest(String aName)
	{
		 		super(aName);
		 }

	protected void setUp() throws Exception 
	{
		super.setUp();
		queue3 = new QueueClass(3);
 		queue4 = new QueueClass(4);
	}

	protected void tearDown() 
		 	{
		 		queue3 = null;
		 		queue4 = null;
			}
		 
		 	public void testFIFO() 
		 	{
				queue4.enQueue("Dave Dee");
		 		queue4.enQueue("Dozy");
		 		queue4.enQueue("Beaky");
		 		assertEquals(queue4.deQueue(), "Dave Dee");
		 		assertEquals(queue4.deQueue(), "Dozy");
		 		assertEquals(queue4.deQueue(), "Beaky");
		 	}
		 
		 	public void testQueueFull() {
		 		queue4.enQueue("Dave Dee");
		 		queue4.enQueue("Dozy");
		 		queue4.enQueue("Beaky");
		 		queue4.enQueue("Mick");
		 		assertTrue("Queue Full", !queue4.enQueue("Tich"));
		 	}
		 
		 	public void testQueueEmpty() {
		 		assertNull(queue3.deQueue());
		 
		 		queue3.enQueue("Dave Dee");
		 		queue3.enQueue("Dozy");
		 		queue3.enQueue("Beaky");
		 		queue3.deQueue();
		 		queue3.deQueue();
		 		queue3.deQueue();
		 		assertNull("Queue Empty", queue3.deQueue());
		 	}
		 
		 	public static void main(String[] args) {
		 		// Runs an entire TestSuite using Swing UI
		 		junit.swingui.TestRunner.run(QueueClassTest.class);
		 	}
		 
		 	private QueueClass queue3,queue4;
		 	
}
