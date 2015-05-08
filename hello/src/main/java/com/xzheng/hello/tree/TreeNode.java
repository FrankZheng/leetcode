package com.xzheng.hello.tree;

/**
 * @author Frank Zheng
 * @date 15/5/8.
 */
public class TreeNode<T> {
    public T data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(T data) {
        this.data = data;
    }

    public static <T> TreeNode<T> createTreeNode(T data) {
        return new TreeNode<T>(data);
    }
}
