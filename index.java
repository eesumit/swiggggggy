ListNode prev = null;
ListNode curr = head;
ListNode next = null;

while(curr!=null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;

}