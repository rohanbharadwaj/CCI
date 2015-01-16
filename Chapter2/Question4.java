package Chapter2;

import DS.LinkedList.LinkedListNode;

public class Question4 {
public LinkedListNode partition(LinkedListNode node,int x) {

	LinkedListNode beforeStart = null;
	LinkedListNode afterStart = null;
	while(node!=null)
	{
		LinkedListNode next = node.next;
		if(node.data<x)
		{
			node.next = beforeStart;
			beforeStart = node;
		}
		else
		{
			node.next = afterStart;
			afterStart = node;
		}
		node  = next;
	}
	if(beforeStart == null) return afterStart;
	LinkedListNode head = beforeStart;
	while(beforeStart.next!=null) beforeStart = beforeStart.next;
	beforeStart.next = afterStart;
	
	return head;
}
}
