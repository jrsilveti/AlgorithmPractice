package com.company.linkedList;

import java.util.Stack;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static Stack<Integer> makeStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        while(current != null) {
            stack.push(current.val);
            System.out.println("Pushing... " + current.val);
            current = current.next;
        }

        return stack;
    }

    public static ListNode reverseList(ListNode head) {
        Stack<Integer> reversedListValues = makeStack(head);

        ListNode newHead = new ListNode(reversedListValues.pop());
        newHead.next = new ListNode(reversedListValues.peek());

        ListNode current = newHead;
        while(!reversedListValues.empty()) {
            current.next = new ListNode(reversedListValues.pop());
            current = current.next;
        }
        return newHead;
    }

    public static ListNode reverseListPointers(ListNode head) {

        if(head == null)
            return head;

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        ListNode second = new ListNode(2);
        head.next = second;

        ListNode third = new ListNode(3);
        second.next = third;

        ListNode fourth = new ListNode(4);
        third.next = fourth;

        ListNode fifth = new ListNode(5);
        fourth.next = fifth;



        ListNode current = reverseListPointers(head);

        while(current != null) {
            System.out.println(current.val);
            current = current.next;
        }


    }
}
