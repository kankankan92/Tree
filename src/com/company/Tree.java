package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable> {

    private Node head = null;


    public void add(T obj) {
        Node newNode = recursiveAdd(obj, head);
        if (newNode != null) {
            head = newNode;
        }
    }

    private Node recursiveAdd(T obj, Node currentHead) {
        if (currentHead == null) {
            return new Node<T>(obj);
        } else {
            if (obj.compareTo(currentHead.getObj()) < 0) {
                Node newNode = recursiveAdd(obj, currentHead.getLeft());
                if (newNode != null) {
                    currentHead.setLeft(newNode);
                }
            } else {
                Node newNode = recursiveAdd(obj, currentHead.getRight());
                if (newNode != null) {
                    currentHead.setRight(newNode);
                }
            }
            return null;
        }
    }

    public void addAll(T... objs) {
        for (T obj : objs) {
            add(obj);
        }
    }

    public int depth() {
        return recursiveDepth(head);
    }

    private int recursiveDepth(Node current) {
        if (current == null) {
            return 0;
        } else {
            int a = recursiveDepth(current.getLeft());
            int b = recursiveDepth(current.getRight());
            if (a > b) {
                return 1 + a;
            } else {
                return 1 + b;
            }
        }
    }

    public void print(){
        print(head, 0);
    }

    private void print(Node current, int depth) {
        if (current != null) {
            print(current.getRight(), depth+1);
            for (int i = depth*5; i>0; i--){
                System.out.print(" ");
            }
            System.out.println(current.getObj()+" "+depth);
            print(current.getLeft(), depth+1);
        }
    }

    public List<Node> treeToSortedList() {
        List<Node> tree = new ArrayList<>();
        treeToSortedListInner(head, tree);
        return tree;
    }


    private void treeToSortedListInner(Node current, List<Node> tree) {
        if (current != null) {
            treeToSortedListInner(current.getRight(), tree);
            tree.add(current);
            treeToSortedListInner(current.getLeft(), tree);
        }
    }
}

