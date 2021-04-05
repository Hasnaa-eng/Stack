package pack;

public class Stack {

	private int size;
	private int arr[];
	private int index = 0;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
	}

	public void push(int a) {

		if (index < size) {
			arr[index] = a;
			index++;
		} else
			System.out.println("you cant enter any number");

	}

	public int pop() {
		/*
		 * int flag = 0; if (index < size && index>0) { flag = 1; } if (flag == 1)
		 * return arr[index]; index--; return flag;
		 */
	if (index == size )
	{
		index --;
	}
		if (index >= 0 ) {
			int x = arr[index];
			index--;
			return x;
		} else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
} 
