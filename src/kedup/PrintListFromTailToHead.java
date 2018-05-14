package kedup;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 */
public class PrintListFromTailToHead {


    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode head = null;
        ListNode current = null;
        for (int i = 0; i < 5; i++) {
            if (head == null) {
                head = new ListNode(i);
                current = head;
            } else {
                current.next = new ListNode(i);
                current = current.next;
            }
        }


        System.out.println(printListFromTailToHead(head));

    }
}
