Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

 

Example 1:
            1->0->1

Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

//直接版
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
       int cnt = 0;
       int sum = 0;
       ListNode p = head;
       ListNode q = head;
       while(p != null){
           cnt++;
           p = p.next;
       }
       while(q != null){
           sum += q.val * Math.pow(2,--cnt);
           q = q.next;
       }
       return sum;
    }
}

//大佬版
public int getDecimalValue(ListNode head) {
        ListNode cur = head;
        int ans = 0;
        while (cur != null) {
            ans <<= 1;
            ans += cur.val;   //ans = 2*ans + cur.val;
            cur = cur.next;
        }
        return ans;
    }
链表移动到右侧下一个节点的过程，其实就是二进制数左移1位的结果。
