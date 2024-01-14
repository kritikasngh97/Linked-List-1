// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            return null;

        slow = head;
        while(fast!=slow)
        {
            slow = slow.next;
            fast = fast.next;
        }    
        return slow;
    }

    public static void main(String args [])
    {
        LinkedListCycle list = new LinkedListCycle();
        ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = node.next;
        ListNode result = list.detectCycle(node);
        System.out.println(result.val);
        
    
    
    }

   
}
