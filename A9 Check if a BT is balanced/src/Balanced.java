class Node {
	Node left;
	Node right;
	int data;

	public Node(int a) {
		this.data = a;
	}
}

public class Balanced {
	public static void main(String[] args) {
		Node root = new Node(7);
		root.left = new Node(4);
		root.right = new Node(9);
		root.right.right = new Node(11);
		root.right.right.right = new Node(13);
		System.out.println(isBalanced(root));
	}

	private static boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		} else if (maxHeight(root) - minHeight(root) <= 1) {
			return true;
		}
		return false;
	}

	private static int minHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.min(minHeight(root.left), minHeight(root.right));
	}

	private static int maxHeight(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
	}
}
