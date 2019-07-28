package com.practice.design.pattern.structural.composite;

import com.practice.design.pattern.structural.composite.api.ITree;
import com.practice.design.pattern.structural.composite.impl.TreeComposite;
import com.practice.design.pattern.structural.composite.impl.TreeLeaf;

public class MainApp {

    public static void main(String[] args) {

        ITree root = new TreeComposite();

        root.addChildren(getLeafNode());

        root.addChildren(getCompositeNode());

        System.out.println(root);
    }

    private static ITree getLeafNode() {
        ITree leaf = new TreeLeaf();
        leaf.setData((int) Math.random());
        leaf.setChildren(null);
        return leaf;
    }

    private static ITree getCompositeNode() {
        ITree compositeNode = new TreeComposite();
        compositeNode.setData((int) Math.random());
        compositeNode.addChildren(getLeafNode());

        return compositeNode;
    }

}
