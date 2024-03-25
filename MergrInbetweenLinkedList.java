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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode  prevA = list1;
        ListNode nodeb = list1;
        for(int index=0; index<b; index++){
            if(index == a-1){
                prevA = nodeb;
            }
            nodeb = nodeb.next;
        }

        // list end
        ListNode list2End = list2;
        while(list2End.next!=null){
            list2End = list2End.next;
        }
        prevA.next=list2;
        list2End.next = nodeb.next;
        nodeb.next= null;
        return list1;
        
    }
}