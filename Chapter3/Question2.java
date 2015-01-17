package Chapter3;
/*
 *  How would you design a stack which, in addition to push and pop, also has a
 *	function min which returns the minimum element? Push, pop and min should all
 *	operate in 0(1) time. 
 */

import java.util.Stack;

public class Question2 {

	Stack<Integer> dataStack;
	Stack<Integer> minStack;
	
	public Question2() {
		dataStack = new Stack<Integer>();
		minStack = new Stack<Integer>();
	}
	void push(int val)
	{
		if(dataStack.isEmpty()&&minStack.isEmpty())
		{
			dataStack.push(val);
			minStack.push(val);
		}
		else if(val<dataStack.peek())
		{
			dataStack.push(val);
			minStack.push(val);
		}
		else
		{
			dataStack.push(val);
		}
		
	}
	int pop()
	{
		int val = dataStack.pop();
		if(val==minStack.peek())
			minStack.pop();
		return val;
	}
	int min()
	{
		return minStack.peek();
	}
	
	public static void main(String[] args) {

		Question2 obj = new Question2();
		obj.push(7);
		obj.push(4);
		obj.push(3);
		obj.push(10);
		obj.push(32);
		System.out.println("min : "+obj.min());
	}
	
}
