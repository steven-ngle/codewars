package kyu4.SortBinaryTreeByLevels;

import java.util.*;

public class SortBinaryTreeByLevels {

    public static List<Integer> treeByLevels(Node node) {

        if (node == null) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.value);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}
