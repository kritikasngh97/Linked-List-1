public class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n)
        {
            count++;
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;
    }

    public static void main(String args [])
    {
        RemoveNode list = new RemoveNode();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        list.printList(node);
        node = list.removeNthFromEnd(node,2);
        System.out.println("after removing nth node ");
        list.printList(node);

        
    
    
    }
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }
}
