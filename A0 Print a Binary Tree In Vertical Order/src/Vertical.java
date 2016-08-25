import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class Vertical {
	static Map<Integer, List<Node>> locationMap = new LinkedHashMap<Integer, List<Node>>();

	public static void main(String[] args) {
		Node root = new Node(1, new Node(2, new Node(4, null, null), new Node(5, null, null)),
				new Node(3, new Node(6, null, null), null));
		printVertical(root);

	}

	private static void printVertical(Node root) {
		printRecur(root, 0);
		for (Integer in : locationMap.keySet()) {
			locationMap.get(in).stream().forEach(a -> System.out.print(" " + a.data));
			System.out.println();
		}
	}

	private static void printRecur(Node root, int column) {
		if (root == null) {
			return;
		}

		printRecur(root.left, column - 1);

		if (!locationMap.keySet().contains(column)) {
			List<Node> nodeList = new ArrayList<Node>();
			nodeList.add(root);
			locationMap.put(column, nodeList);
		} else {
			locationMap.get(column).add(root);
		}

		printRecur(root.right, column + 1);
	}
}
