package com.company;

public class Node<T> {

    private Node left = null;
    private Node right = null;
    private T obj;


    public Node(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }


//    public void setObj(T obj) {
//        this.obj = obj;
//    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
