package com.example.leetcode;

import com.example.leetcode.easy.reserveList.ListNode;
import com.example.leetcode.easy.reserveList.Solution;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class ReserveListTests {

//    @MockBean // 有 mock 规则则生效，无 mock 规则按默认值
//    Solution solution;

    @SpyBean // 有 mock 规则则生效，无 mock 规则按原逻辑
    Solution solution;

    @Test
    void case1() {
        String actual="";
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
        ln5.next = null;

//        when(solution.reverseList(ln1)).thenReturn(ln1);

        ListNode head = solution.reverseList(ln1);
        ListNode temp = head;//不再对head使用可以直接用head来输出 使用建议先获取出以防找不到头节点避免了重新获取

        while (temp != null) {
            actual = actual + temp.val + " ";
            temp = temp.next;
        }

        Assertions.assertEquals("5 4 3 2 1 ",actual);
    }
    @Test
    void case2() {
        String actual="";
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ln1.next = ln2;
        ln2.next = null;
        Solution s = new Solution();
        ListNode head = s.reverseList(ln1);
        ListNode temp = head;//不再对head使用可以直接用head来输出 使用建议先获取出以防找不到头节点避免了重新获取
        while (temp != null) {
            actual = actual + temp.val + " ";
            temp = temp.next;
        }

        Assertions.assertEquals("2 1 ",actual);
    }
    @Test
    void case3() {
        String actual="";
        ListNode ln1 = null;
        Solution s = new Solution();
        ListNode head = s.reverseList(ln1);
        ListNode temp = head;//不再对head使用可以直接用head来输出 使用建议先获取出以防找不到头节点避免了重新获取
        while (temp != null) {
            actual = actual + temp.val + " ";
            temp = temp.next;
        }
        Assertions.assertEquals("",actual);
    }

}
