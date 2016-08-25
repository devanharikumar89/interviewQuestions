import java.util.LinkedList;
import java.util.Queue;

class Node {
	Node left;
	Node right;
	int data;

	public Node(int data, Node left, Node right) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}

public class Level {
	public static void main(String[] args) {
		Node root = new Node(1, new Node(0, null, null), new Node(2, null, null));
		root.left.left = new Node(3, null, null);
		root.left.right = new Node(8, null, null);
		root.right.left = new Node(6, null, null);
		root.right.right = new Node(5, null, null);
		level(root);

	}

	private static void level(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node a = queue.poll();
			System.out.println(a.data);
			if (a.left != null) {
				queue.add(a.left);
			}
			if (a.right != null) {
				queue.add(a.right);
			}
		}
	}
}
