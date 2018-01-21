package Stack;

public class Stack {
	int top;
	int[] stack;
	int size;
	
	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}
	
	public void peek() {
		System.out.println("현재 peek 값 : " + stack[top]);
	}
	
	public void push(int value) {
		stack[++top] = value;
		System.out.println("push : " + value);
	}
	
	public int pop() {
		System.out.println("pop : " + stack[top]);
		return stack[top--];
	}
	
	public void printStack() {
		System.out.println("Stack Status");
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
}

class Main {
	public static void main(String args[]) {
		Stack stack = new Stack(5);
		
		stack.push(5);
		stack.push(3);
		stack.push(4);
		
		stack.peek();
		
		stack.pop();
		
		stack.printStack();
	}
}