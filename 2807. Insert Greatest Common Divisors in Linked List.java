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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temphead = new ListNode();
        ListNode temp =new ListNode() ;
        temphead = temp ;
        int bigger = 0 ;
        int lower = 0 ;
        int divide = 0 ;
        temp.val = head.val ;
        while (head.next != null ) {
            temp.next =new ListNode();
            temp = temp.next ;
            if ( head.val < head.next.val) {
                bigger = head.val ;
                lower = head.next.val ;
            }
            else {
                bigger = head.next.val ;
                lower = head.val ;
            }
            while ( bigger%lower != 0)
            {
                divide = bigger%lower ;
                bigger = lower ;
                lower = divide ;
            }
            temp.val = lower ;

            head = head.next ;
            temp.next =new ListNode();
            temp = temp.next ;
            temp.val = head.val ;
        }
            
        return temphead ;
    }
}
