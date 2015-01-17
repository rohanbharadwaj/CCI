package Chapter3;

/*
 * Describe how you could use a single array to implement three stacks.
 * 
 */
public class Question1 {

	int stackSize = 100;
	int[] buffer = new int[3 * stackSize];
	int[] stackTop = { -1, -1, -1 };

	void push(int stackNum, int value) throws Exception {
		if (stackTop[stackNum] + 1 >= stackSize)
			throw new Exception("out of space");
		stackTop[stackNum]++;
		buffer[getStackTop(stackNum)] = value;
	}

	int pop(int stackNum) throws Exception {
		if (stackTop[stackNum] == -1) {
			throw new Exception("Stack is Empty can't pop");
		}
		int value = buffer[getStackTop(stackNum)];
		buffer[getStackTop(stackNum)] = 0;
		stackTop[stackNum]--;
		return value;
	}

	int peek(int stackNum) {
		return buffer[getStackTop(stackNum)];
	}

	boolean isEmpty(int stackNum) {
		return stackTop[stackNum] == -1;
	}

	public int getStackTop(int stackNum) {
		return stackNum * stackSize + stackTop[stackNum];
	}

}
