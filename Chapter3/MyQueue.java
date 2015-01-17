package Chapter3;

import java.util.Stack;

/*
 *  Implement a MyQueue class which implements a queue 
 *  using two stacks.
 *  Dequeue Time complexity : When old stack is empty then only we
 *  make transfer so on average O(1).
 */
public class MyQueue<T> {
	Stack<T> newStack, oldStack;

	public MyQueue() {
		newStack = new Stack<T>();
		oldStack = new Stack<T>();
	}

	public void enqueue(T value) {
		// Push on newStack
		newStack.push(value);
	}

	public void shiftStacks() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}

	public T dequeue() {
		shiftStacks();
		return oldStack.pop();
	}

	public T peek() {
		shiftStacks();
		return oldStack.peek();
	}

}
