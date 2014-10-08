import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			char expression[] = sc.nextLine().toCharArray();

			Queue<Character> q = new Queue<Character>();
			
			for (char c : expression) {
				q.queue(c);
			}
			
			q.print();
			
			// int length = (int) Math.ceil(Math.log10(expression.length)
			// / Math.log10(2));
			//
			// int tree[] = new int[length];

		}
	}

	public static class Queue<E> {

		private Stack<E> inbox = new Stack<E>();
		private Stack<E> outbox = new Stack<E>();

		public void queue(E item) {
			inbox.push(item);
		}

		public E dequeue() {
			if (outbox.isEmpty()) {
				while (!inbox.isEmpty()) {
					outbox.push(inbox.pop());
				}
			}
			return outbox.pop();
		}

		public void print() {
			while (!inbox.isEmpty()) {
				System.out.println(inbox.pop());
			}
		}

	}
}
