
class Node {
	Node left;
	Node right;
	int data;

	public Node(int a) {
		this.data = a;
	}
}

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Node root = makeBST(arr, 0, arr.length - 1);
		printInorder(root);
	}

	private static void printInorder(Node root) {
		if (root == null) {
			return;
		}
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
	}

	private static Node makeBST(int[] arr, int low, int high) {
		if (low > high) {
			return null;
		}
		int mid = low + (high - low) / 2;
		Node root = new Node(arr[mid]);
		root.left = makeBST(arr, low, mid - 1);
		root.right = makeBST(arr, mid + 1, high);

		return root;

	}
}
