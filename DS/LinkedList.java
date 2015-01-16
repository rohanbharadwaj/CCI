package DS;


public class LinkedList {
	LinkedListNode head;
	public LinkedList() {
		head = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void addFirst(int item) {
		head = new LinkedListNode(item, head);
	}
	public void addLast(int item) {
		if(head==null) addFirst(item);
		else
		{
			LinkedListNode temp = head;
			while(temp.next!=null) temp=temp.next;
			temp.next = new LinkedListNode(item,null);
		}
	}
	public void insertAfter(int key,int toInsert)
	{
		LinkedListNode temp =head;
		while(temp!=null&&(temp.data)!=key) temp=temp.next;
		if(temp!=null)
			temp.next = new LinkedListNode(toInsert,temp.next);
	}
	public void insertBefore(int key,int toInsert) {
		if(head==null) return;
		if(head.data==key)
		{
			addFirst(toInsert);
			return;
		}
		LinkedListNode prev = null;
		LinkedListNode cur = head;
		while(cur!=null && cur.data!=key)
		{
			prev = cur;
			cur = cur.next;
		}
		//Insert between cur and prev
		if(cur!=null) 
			prev.next = new LinkedListNode(toInsert,cur);
	}
	public void remove(int key) {
		if(head==null) System.out.println("cannot delete");
		if(head.data==key)
		{
			head.next=head;
			return;
		}
		LinkedListNode prev = null;
		LinkedListNode cur = head;
		while(cur!=null&&cur.data!=key)
		{
			prev = cur;
			cur = cur.next;
		}
		if(cur==null) System.out.println("cannoy delete");
		
		prev.next = cur.next;
	}
	public static class LinkedListNode{
		public int data;
		public LinkedListNode next;
		public LinkedListNode(int data,LinkedListNode next) {
			this.data=data;
			this.next = next;
		}
		public LinkedListNode() {
			// TODO Auto-generated constructor stub
		}
	}
	
}