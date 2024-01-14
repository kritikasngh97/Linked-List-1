
/** Recursive MEthod */
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :



/** Iterative */
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this :



public class ReverseLinkedList{
    ListNode reversed;
    int count = 0;


    /*public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
          
            curr = temp;
        }
       
        return prev;
    }*/
    public ListNode reverseList(ListNode head) {
        /*if(head == null || head.next == null)
            return head;
       return helper(head,null);*/
       if(head == null) return null;
        helper(head);
        return reversed;
    }

    // recursive
    public void helper(ListNode head)
    {
        if(head.next == null)
        {
            reversed = head;
            count++;
            return;
        }
        helper(head.next);
        head.next.next = head;
        head.next = null;


    }
    /*public ListNode helper(ListNode curr, ListNode prev)
    {
        if(curr == null)
            return prev;
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return helper(curr, prev);    
    }*/

    public static void main(String args [])
    {
        ReverseLinkedList list = new ReverseLinkedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
 
     
        list.printList(node);
        node = list.reverseList(node);
        System.out.println("Reverse linked list");
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
