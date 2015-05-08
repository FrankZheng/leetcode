package com.xzheng.hello.list;

/**
 * @author Frank Zheng
 * @date 15/5/8.
 */
public class ListNode<T> {
    public T data;
    public ListNode next;

    public ListNode(T data) {
        this.data = data;
    }

    public static <T> ListNode<T> createListNode(T data) {
        return new ListNode<T>(data);
    }

    @Override
    public String toString() {
        ListNode p = this;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        while(p != null) {
            sb.append(p.data);
            sb.append(",");
            p = p.next;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }
}
