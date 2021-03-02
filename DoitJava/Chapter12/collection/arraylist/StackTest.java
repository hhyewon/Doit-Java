package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		
		return arrayStack.remove(len -1);
		//String data = arrayStack.remove(arrayStack.size() -1);
	}
	
	public String peek() { //맨 위에 있는걸 꺼내본다.
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		//하나씩 꺼낸다. ==> remove //꺼내본다 ==> get
		return arrayStack.get(arrayStack.size() -1);
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek()); //c
		System.out.println(stack.peek()); //c //없어지지 않는다.
		System.out.println(stack.pop()); //c
		
		System.out.println(stack.pop()); //c
		System.out.println(stack.pop()); //b
		System.out.println(stack.pop()); //a
	

		 
	}
}
