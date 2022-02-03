package d3feb;

import java.util.Stack;

public class MinStack {

	Stack<Integer> st;
	Stack<Integer> min;

	public MinStack() {
		st = new Stack<>();
		min = new Stack<>();
	}

	public void push(int val) {
		st.add(val);
		min.add(Math.min(val, min.peek()));

	}

	public void pop() {
		st.pop();
		min.pop();

	}

	public int top() {
		return st.peek();

	}

	public int getMin() {
		return min.peek();

	}

}
