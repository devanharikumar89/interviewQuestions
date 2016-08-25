
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	public TreeNode(TreeNode left, TreeNode right, int data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
}

public class BTT2DLL {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(null, null, 10);
		TreeNode head = convert(node);
		System.out.println(head.data);
	}

	private static TreeNode convert(TreeNode node) {
		if (node == null) {
			return node;
		}
		if (node.left != null) {
			// Make the rightmost element in the left tree(after converting
			// the left subtree) the inorder predecessor of the node
			TreeNode left = convert(node.left);
			for (; left.right != null; left = left.right)
				;
			left.right = node;
			node.left = left;

		}
		if (node.right != null) {
			// Make the leftmost element in the right tree(after converting
			// the right subtree) the inorder successor of the node
			TreeNode right = convert(node.right);
			for (; right.left != null; right = right.left)
				;
			right.left = node;
			node.right = right;

		}

		return node;
	}
}
