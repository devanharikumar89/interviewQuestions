class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

class G2G { /* You are required to complete this function */
	int getLevelDiff(Node root) {
		return sum(root, 0, 0) - sum(root, 1, 0);
	}

	int sum(Node root, int indicator, int height) {
		if (root == null) {
			return 0;
		}
		if (height % 2 == indicator) {
			return root.data + sum(root.left, indicator, height + 1) + sum(root.right, indicator, height + 1);
		} else {
			return sum(root.left, indicator, height + 1) + sum(root.right, indicator, height + 1);
		}
	}
}