
 // Definition for singly-linked list.
  public class RemoveNthNodeFromEndOfTheList {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        //int c=n;
        // Maintain gap in between first and second pointer
        while(n>0 && second != null){
            second = second.next;
            n--;
        }
        if(second == null){
            if(n>0){
                return head;
            }
            // deletion at the head
            if(n==0){
                ListNode temp = head;
                head = head.next;
                temp.next = null;
                return head;

            }
        }   
        // ListNode first = head;
        ListNode prev = null;
        while(second!=null){
            prev = first;
            first = first.next;
            second = second.next;

        }
        //delete Nth node from the end
        prev.next = first.next;
        first.next=null;
        return head;
        
        
       
 }
}

