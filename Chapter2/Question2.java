package Chapter2;

import DS.LinkedList.LinkedListNode;

/*
 *  Implement an algorithm to find the kth to last element of a singly 
 *  linked list.
 *  Two Pointers. Move p2 k nodes in linked list when p1 is still at begining.
 *  Then move p1 and p2 at same pace. When p2 reaches end then p1 is k nodes from end.
 *  
 */
public class Question2 {
private static LinkedListNode nthToLast(LinkedListNode head, int k) {

	if(k<0) return null;
	LinkedListNode p1 = head;
	LinkedListNode p2 = head;
	for(int i=0;i<k-1;i++)
	{
		if(p2==null) return null;
		p2=p2.next;
	}
	if(p2==null) return null;
	while(p2.next!=null)
	{
		p1=p1.next;
		p2=p2.next;
	}
	return p1;
}
	public static void main(String[] args) {
		LinkedListNode head=null;
		int k = 0;
		nthToLast(head, k);
	}
	
}
