// Add Two Numbers
// https://leetcode.com/problems/add-two-numbers/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int findLength(ListNode node) {
        int len = 0;
        while(node!=null) {
            len ++;
            node = node.next;
        }
        return len;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           int carry = 0;
           ListNode ptr1 = l1;
           ListNode ptr2 = l2;
           // Find list of longer linked list
           int len1 = findLength(l1);
           int len2 = findLength(l2);
           String longerList = "L2";
           if (len1 > len2) {
               longerList = "L1";
           }
           //System.out.println(longerList);
           while(ptr1 != null && ptr2 != null) {
               int addition = carry + ptr1.val + ptr2.val;
               carry = addition/10;
               //System.out.println(addition%10);
               if (longerList == "L1") {
                   ptr1.val = addition%10;
               } else {
                   ptr2.val = addition%10;
               }
               ptr1 = ptr1.next;
               ptr2 = ptr2.next;
           }
           // add remaining numbers
           while(ptr1 != null) {
               int addition = carry + ptr1.val;
               carry = addition/10;
               ptr1.val = addition%10;
               // If carry is greater than zero then add to longer list end
               if (carry > 0 && ptr1.next == null) {
                   //System.out.println("Carry greater than zero "+carry);
                   ListNode node = new ListNode();
                   node.val = carry;
                   node.next = null;
                   ptr1.next = node;
                   break;
               }
               ptr1 = ptr1.next;
           }
           while(ptr2 != null) {
               int addition = carry + ptr2.val;
               carry = addition/10;
               ptr2.val = addition%10;
               // If carry is greater than zero then add to longer list end
               if (carry > 0 && ptr2.next == null) {
                   //System.out.println("Carry greater than zero");
                   ListNode node = new ListNode();
                   node.val = carry;
                   node.next = null;
                   ptr2.next = node;
                   break;
               }
               ptr2 = ptr2.next;
           }
           if (longerList == "L1") {
               return l1;
           } else {
               return l2;
           }
    }
}