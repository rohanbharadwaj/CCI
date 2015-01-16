package Chapter2;

import DS.LinkedList.LinkedListNode;

/*
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 *  given only access to that node.
 *  
 * The solution is simply to copy the data from the next node over to
 *	the current node, and then to delete the next node.
 */

public class Question3 {
public static boolean deleteNode(DS.LinkedList.LinkedListNode n) {
	if(n==null||n.next==null) return false;
	LinkedListNode next =n.next;
	n.data = next.data;
	n.next = next.next;
	return true;
}
}
