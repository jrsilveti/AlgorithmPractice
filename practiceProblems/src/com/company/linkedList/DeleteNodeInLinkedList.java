package com.company.linkedList;

public class DeleteNodeInLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if(node == null || node.next == null)
            return;

        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        // write your code here
    }
}
