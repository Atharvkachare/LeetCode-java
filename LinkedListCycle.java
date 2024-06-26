
 class ListNode{
     int val;
     ListNode next;
     ListNode(int x){
        val = x;
        next = null;
     }

}
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null ||fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        while(head != slow.next){
            slow = slow.next;
            head = head.next;
        }

        return head;
    }
}
