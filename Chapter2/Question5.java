package Chapter2;

import DS.LinkedList.LinkedListNode;

public class Question5 {
	public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
	    LinkedListNode prev = new LinkedListNode();
		LinkedListNode head = prev;
		int carry = 0;
		while(l1!=null||l2!=null||carry!=0)
		{
		LinkedListNode cur = new LinkedListNode();
		int sum = ((l2==null)?0:l2.data)+((l1==null)?0:l1.data)+carry;
		cur.data = sum%10;
		carry = sum/10;
		prev.next = cur;
		prev = cur;
		l1 = (l1==null)?l1:l1.next;
		l2 = (l2==null)?l2:l2.next;
		}   
		return head.next;     
	        
	    }
}
