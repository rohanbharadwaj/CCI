package Chapter2;

import java.util.Hashtable;

import DS.LinkedList.LinkedListNode;

public class Question1 {

	public void deleteDups(LinkedListNode n) {
		// Time : O(N) , Space : O(N)
		Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
		LinkedListNode previous = null;
		while (n != null) {
			if (table.containsKey(n.data)) {
				previous.next = n.next;
			} else {
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}

	}

	public void deleteDups1(LinkedListNode head) {
		// Time : O(N^2) , Space : O(1)
		if (head == null)
			return;
		LinkedListNode current = head;
		while (current != null) {
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data)
					runner.next = runner.next.next;
				else
					runner = runner.next;
			}
			current = current.next;

		}

	}

}
