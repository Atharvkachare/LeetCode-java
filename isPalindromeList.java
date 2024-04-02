public class isPalindromeList {
    public boolean isPalindrome(ListNode head){
        // ref the first half
        if(head==null) return true;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
           //rev
           ListNode nextNode = slow.next;
           slow.next = prev;
           prev = slow;
           slow = nextNode;

        }

        //in case of odd list, move the slow pointer by 1 step
        if(fast!=null){
            slow = slow.next;

        }
        while(slow != null){
            if(prev.val != slow.val){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }

        return true;

    }
    
}
