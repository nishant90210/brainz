import java.util.PriorityQueue;

/**
 * Created by abhijeet on 8/31/16.
 * https://leetcode.com/submissions/detail/72402132/
 */
public class MergeKSortedLists {
    public static void main(String[] args) {
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public class Comparator implements java.util.Comparator<ListNode> {
            public int compare(ListNode first, ListNode second) {
                return first.val - second.val;
            }
        }

        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator());
            ListNode solution = null;
            ListNode back = null;

            for (ListNode listNode : lists) {
                if (listNode != null)
                    priorityQueue.offer(listNode);
            }

            while (!priorityQueue.isEmpty()) {
                // Remove the list from the priority queue
                ListNode temp = priorityQueue.poll();

                // Add the top element to the solution
                if (solution == null) {
                    solution = temp;
                    back = solution;
                } else {
                    back.next = temp;
                    back = back.next;
                }

                // If the list is not empty, move the head to next element and add it back to priority queue.
                if (temp.next != null) {
                    temp = temp.next;
                    priorityQueue.offer(temp);
                }
            }
            return solution;
        }
    }
}
