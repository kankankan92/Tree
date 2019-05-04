package com.company;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
//        tree.add(8);
//        tree.add(4);
//        tree.add(7);
//        tree.add(13);
//        tree.add(12);
//        tree.add(9);
//        tree.add(2);
//        tree.add(3);
//        tree.add(15);

        tree.addAll(8, 4, 7, 13, 12, 9, 2, 3, 10);

        System.out.println(tree.depth());
        int i = 0;
    }
}
