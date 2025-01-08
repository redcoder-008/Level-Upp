import java.util.LinkedList;
import java.util.HashMap;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Info {
    Node node;
    int hd;

    public Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class TopViewOfTree {
    public static void topView(Node root) {
        if (root == null) {  // Change: Added check for null root
            return;
        }

        // Level order traversal
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (!map.containsKey(curr.hd)) {  // First time the horizontal distance occurs
                map.put(curr.hd, curr.node);
            }

            // Update horizontal distance range
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);  // Change: Corrected range update
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);  // Change: Corrected range update
            }
        }

        // Print the top view
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}
