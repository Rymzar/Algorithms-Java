package middle_of_the_LinkedList;

class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        int midle = size/2;
        current = head;
        for(int i = 0; i < midle; i++) {
            current = current.next;
        }
        return current;
    }
}
