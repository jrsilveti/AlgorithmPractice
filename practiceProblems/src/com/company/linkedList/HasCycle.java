package com.company.linkedList;

public class HasCycle {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int x, ListNode next) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode two = new ListNode(2);
        ListNode zero = new ListNode(0);
        ListNode tail = new ListNode(-4);

        head.next = two;
        two.next = zero;
        zero.next = tail;
        tail.next = zero;

        System.out.println("Has cycle? " + hasCycle(head));


    }
}
