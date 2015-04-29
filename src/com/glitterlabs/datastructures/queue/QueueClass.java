package com.glitterlabs.datastructures.queue;

public class QueueClass
{
	public QueueClass(int aCapacity) 
	{
		 		capacity = aCapacity;
		 		queue = new Object[capacity];
		 	}
		 
		 	public boolean enQueue(Object anItem) 
		 	{
		 		if (count == capacity) 
		 		{
		 			return false;
		 		}
		 
		 		queue[last] = anItem;
		 		last = next(last);
		 		count++;
		 		return true;
		 	}
	 
		 	public Object deQueue() 
		 	{
		 		if (count == 0) 
		 		{
		 			return null;
		 		}
		 
		 		Object frontItem = queue[first];
				queue[first] = null;
		 		count--;
		 		first = next(first);
		 		return frontItem;
		 	}
		 
			private int next(int index) 
			{
		 		return (index + 1) % capacity;
		 	}
		 
		 	private int count;
		 	private int capacity;
		 	private Object[] queue;
		 	private int first, last;
}
