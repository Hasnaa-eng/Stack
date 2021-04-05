package pack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s1 = new Stack(5);
		int x;
		System.out.println("please enter numbers : ");
		for (int i = 0; i < 5; i++) {
			x = sc.nextInt();
			s1.push(x);
		}
		System.out.println();
		System.out.println("Numbers is : ");
		for (int i = 0; i < 5; i++) {
			System.out.println(s1.pop());
		}

	}

}
