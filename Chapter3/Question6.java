package Chapter3;

import java.util.Stack;

/*
 *  Write a program to sort a stack in ascending order (with biggest items on top).
 *	You may use at most one additional stack to hold items, but you may not copy the
 *	elements into any other data structure (such as an array). The stack supports the
 *	following operations: push, pop, peek, and isEmpty.
 *  
 *  Time O(N^2) Space O(N)
 *
 *
 */
public class Question6 {

	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (!r.isEmpty() && r.peek() > temp) {
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
	}
}
