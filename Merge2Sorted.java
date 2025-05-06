// Definition for singly-linked list.
public class Merge2Sorted {
    int val;
    Merge2Sorted next;

    Merge2Sorted() {}

    Merge2Sorted(int val) { 
        this.val = val; 
    }

    Merge2Sorted(int val, Merge2Sorted next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode(0); // Dummy node
        ListNode current = list;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining part
        current.next = (list1 != null) ? list1 : list2;

        return list.next; // Return the merged list (skipping dummy node)
    }
}
