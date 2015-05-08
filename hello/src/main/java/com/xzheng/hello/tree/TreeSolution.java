package com.xzheng.hello.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank Zheng
 * @date 15/5/8.
 */
public class TreeSolution {

    public static interface ITraverse {
        public void walk(TreeNode node);
    }

    public void levelTraverse(TreeNode root, ITraverse traverse) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(root);
        while(!list.isEmpty()) {
            TreeNode node = list.remove(0);

            if(traverse != null) {
                traverse.walk(node);
            }

            if(node.left != null) {
                list.add(node.left);
            }
            if(node.right != null) {
                list.add(node.right);
            }
        }
    }
}
