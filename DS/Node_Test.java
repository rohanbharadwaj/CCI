package DS;

public class Node_Test {
public static void main(String[] args) {
	Node n1 = new Node(1);
	n1.appendToTail(2);
	n1.appendToTail(3);
	while(n1!=null)
	{
		System.out.print(n1.data+"-->");
		n1=n1.next;
	}
	System.out.print("End");
}
}
