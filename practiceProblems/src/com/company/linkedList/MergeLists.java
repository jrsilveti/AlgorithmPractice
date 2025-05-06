package com.company.linkedList;

public class MergeLists {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

         if(list1 == null) {
             return list2;
         } else if (list2 == null) {
             return list1;
         }

         ListNode left = list1;
         ListNode right = list2;

         ListNode currentResultNode;

         if(left.val <= right.val) {
             currentResultNode = new ListNode(left.val);
             left = left.next;
         } else {
             currentResultNode = new ListNode(right.val);
             right = right.next;
         }

         ListNode resultHead = currentResultNode;

         while (left != null && right != null) {

             if(left.val <= right.val) {
                 currentResultNode.next = new ListNode(left.val);
                 left = left.next;
             } else {
                 currentResultNode.next = new ListNode(right.val);
                 right = right.next;
             }
             currentResultNode = currentResultNode.next;
         }

         if(left != null) {
             while (left != null) {
                 currentResultNode.next = new ListNode(left.val);
                 left = left.next;
                 currentResultNode = currentResultNode.next;
             }
         } else if (right != null) {
             while (right != null) {
                 currentResultNode.next = new ListNode(right.val);
                 right = right.next;
                 currentResultNode = currentResultNode.next;
             }
         }

         return resultHead;
    }

    public static void main(String[] args) {
         ListNode head1 = new ListNode(1);
         ListNode node2 = new ListNode(2);
         ListNode node3 = new ListNode(4);

         head1.next = node2;
         node2.next = node3;

         ListNode head2 = new ListNode(1);
         ListNode node4 = new ListNode(3);
         ListNode node5 = new ListNode(4);

         head2.next = node4;
         node4.next = node5;

         ListNode current = mergeTwoLists(head1, head2);

         while(current != null) {
             System.out.println("Val = " + current.val);
             current = current.next;
         }
    }

}
