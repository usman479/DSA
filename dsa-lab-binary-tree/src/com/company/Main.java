package com.company;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(19);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(21);
        bst.insert(15);
        bst.insert(4);
        System.out.println(bst.search(100));
        bst.inOrder(bst.root);
        System.out.println();
        bst.preOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
    }
}
