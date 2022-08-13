package amazon.binary_tree;

/**
 * Given a binary tree,
 * find the maximum path sum.
 * The path may start and end at any node in the tree.
 */
public class BinaryTree {

    class Node {
        int data;
        Node left, right;

        public  Node(int item){
            data = item;
            left = right = null;
        }
    }

    class Res {
        public int value;
    }

    Node root;

    int findMaxUtil(Node node, Res res){
        if (node == null)
            return 0;
        int left = findMaxUtil(node.left, res);
        int right = findMaxUtil(node.right, res);

        int max_single = Math.max(Math.max(left, right) + node.data, node.data);

        int max_top = Math.max(max_single, left + right + node.data);

        res.value = Math.max(res.value, max_top);

        return max_single;
    }

    int findMaxSum(){
        return findMaxSum(root);
    }

    int findMaxSum (Node node){
        Res res=  new Res();
        res.value = Integer.MIN_VALUE;
        findMaxUtil(node,res);
        return res.value;
    }


}
