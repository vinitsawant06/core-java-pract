package com.practice.Trees;

import org.jetbrains.annotations.NotNull;

class Node {
    int data;
    Node left;
    Node right;
}

class BSTImplMethods {
    public Node insert(Node node, int val) {
        if(node == null) {
            return createNewNode(val);
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if(val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    @NotNull
    private Node createNewNode(int val) {
        Node n = new Node();
        n.data = val;
        n.left = null;
        n.right = null;
        return n;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        BSTImplMethods bstImplMethods = new BSTImplMethods();
        Node root = null;
        root = bstImplMethods.insert(root, 8);
        root = bstImplMethods.insert(root, 3);
        root = bstImplMethods.insert(root, 6);
        root = bstImplMethods.insert(root, 10);
        root = bstImplMethods.insert(root, 14);
        root = bstImplMethods.insert(root, 12);
        root = bstImplMethods.insert(root, 9);

    }
}
