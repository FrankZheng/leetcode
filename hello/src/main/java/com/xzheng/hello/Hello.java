package com.xzheng.hello;

import com.xzheng.hello.list.ListNode;
import com.xzheng.hello.list.ListSolution;
import com.xzheng.hello.sort.SortSolution;
import com.xzheng.hello.tree.TreeNode;
import com.sun.deploy.util.StringUtils;
import com.xzheng.hello.tree.TreeSolution;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhengxiaoqiang on 15/3/12.
 */
public class Hello {

    private static int getDigitsSum(int n) {
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit * digit;
        }
        return sum;
    }

    private static boolean isHappyNumber(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;

        int sum = getDigitsSum(n);
        while(sum >= 10) {
            sum = getDigitsSum(sum);
        }
        return sum == 1;

    }

    private static void testHappyNumber() {

        System.out.println(getDigitsSum(19));
        System.out.println(getDigitsSum(119));
        System.out.println(getDigitsSum(1189));
        System.out.println(isHappyNumber(7));

        for( int i = 0 ; i < 1000 ; i++) {
            if(isHappyNumber(i)) {
                System.out.println(i + " is happy number");
            }
        }
    }

    private static void testTreeLevelTraverse() {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = TreeNode.createTreeNode(2);
        root.right = TreeNode.createTreeNode(3);
        root.left.left = TreeNode.createTreeNode(4);
        root.left.right = TreeNode.createTreeNode(5);
        root.right.left = TreeNode.createTreeNode(6);
        root.right.right = TreeNode.createTreeNode(7);

        new TreeSolution().levelTraverse(root, new TreeSolution.ITraverse() {
            @Override
            public void walk(TreeNode node) {
                System.out.println(node.data);
            }
        });
    }

    private static void testBubbleSort() {
        Integer[] numbers = {5,4,3,1,2,9,8,7,6};
        new SortSolution().bubbleSort(numbers);
    }

    private static void testReverseList() {
        ListNode<Integer> node1 = new ListNode(1);
        ListNode<Integer> node2 = new ListNode(2);
        ListNode<Integer> node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node = new ListSolution().reverse(node1);
        System.out.println(node);
    }

    public static void main(String[] args) {
        testReverseList();
    }

















}
