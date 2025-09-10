/*Write a Java program to merge two sorted linked lists into a single new sorted linked list.
The new list should be made by splicing together the nodes of the first two lists.*/
// Define the ListNode class first
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeSortLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the logic
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes from the non-empty list
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next; // The real head of the merged list
    }

    // Helper method to print the list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSortLists solution = new MergeSortLists();

        // Create list 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create list 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        solution.printList(list1);
        System.out.print("List 2: ");
        solution.printList(list2);

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        solution.printList(mergedList);
    }
}
/*
output:
List 1: 1 -> 2 -> 4 -> null
List 2: 1 -> 3 -> 4 -> null
Merged List: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
 */
