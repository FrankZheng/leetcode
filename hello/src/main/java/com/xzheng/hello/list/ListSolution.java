package com.xzheng.hello.list;

/**
 * @author Frank Zheng
 * @date 15/5/8.
 */
public class ListSolution implements IReverseList {

    @Override
    public ListNode reverse(ListNode list) {
        ListNode prev = null;
        ListNode current = list;
        ListNode next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
