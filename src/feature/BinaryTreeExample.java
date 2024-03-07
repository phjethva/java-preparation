package feature;

import utils.StringUtils;

import java.lang.invoke.MethodHandles;

class BinaryTreeExample {

    static {
        String name = MethodHandles.lookup().lookupClass().getSimpleName();
        StringUtils.getGFGHeader(name);
    }

    Node root;

    BinaryTreeExample() {
        root = null;
    }

    BinaryTreeExample(int key) {
        root = new Node(key);
    }

    public static void main(String[] args) {

        BinaryTreeExample tree = new BinaryTreeExample();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }

}

class Node {

    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }

}
