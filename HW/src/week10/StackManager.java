package week10;

import java.util.ArrayList;

public class StackManager {
	
	public interface IStack<T>{
		public T pop();
		public boolean push(T ob);
	}

	static class MyStack<T> implements IStack<T>{
		ArrayList<T> l = null;
		public MyStack() {
			l = new ArrayList<T>();
		}
		public T pop() {
			if(l.size()==0) {
				return null;
			} else {
				return l.remove(0);
			}
		}
		public boolean push(T ob) {
			l.add(0,ob);
			return true;
		}
	}

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n + " ");
		}

	}

}
