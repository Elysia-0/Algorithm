import entity.ListNode;

/**
 * @author Elysia-0
 * date 2023-03-13
 */

/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

示例 1：
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]

示例 2：
输入：l1 = [], l2 = []
输出：[]

示例 3：
输入：l1 = [], l2 = [0]
输出：[0]

提示：
两个链表的节点数目范围是 [0, 50]
-100 <= Node.val <= 100
l1 和 l2 均按 非递减顺序 排列
 */

public class demo0021 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        int[] temp = new int[200];
        int index = 0;
        while (list1!=null || list2!=null){
            if (list1 == null){
                while (list2!=null){
                    temp[index] = list2.val;
                    index++;
                    list2 = list2.next;
                }
                break;
            }

            if (list2 == null){
                while (list1!=null){
                    temp[index] = list1.val;
                    index++;
                    list1 = list1.next;
                }
                break;
            }

            if (list1.val <= list2.val){
                temp[index] = list1.val;
                index++;
                list1 = list1.next;
            }else {
                temp[index] = list2.val;
                index++;
                list2 = list2.next;
            }

        }
        ListNode result = new ListNode();
        for (int i = index - 1; i >=0; i--) {
            ListNode listNode = new ListNode(temp[i]);
            listNode.next = result.next;
            result.next = listNode;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println(listNode);
    }
}





