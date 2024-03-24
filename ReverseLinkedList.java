// Reverse Linked List
 // Definition for singly-linked list.
  public class ReverseLinkedList {
      int val;
      ReverseLinkedList next;
      ReverseLinkedList() {}
      ReverseLinkedList(int val) { this.val = val; }
      ReverseLinkedList(int val, ReverseLinkedList next) { this.val = val; this.next = next; }
  }
 
 class ReverseList {
    public ReverseLinkedList reverseList(ReverseLinkedList head) {
        ReverseLinkedList prev = null;
        ReverseLinkedList curr = head;
        while(curr != null){
            ReverseLinkedList nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
        
    }
}
