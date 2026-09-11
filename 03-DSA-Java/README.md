# 03 · DSA in Java

**Weeks 1–12** · 60 min a day · 2 problems a day · [← Main README](../README.md) · [Roadmap](../ROADMAP.md)

## 📅 Weekly Plan

| Week | Topic | Problems | Folder |
|---|---|---|---|
| 1 | Complexity + Arrays | 12 | [01-Arrays](01-Arrays/) |
| 2 | Strings | 6 | [02-Strings](02-Strings/) |
| 2 | Hashing | 6 | [03-Hashing](03-Hashing/) |
| 3 | Two pointers + Sliding window | 12 | [04-Two-Pointers-Sliding-Window](04-Two-Pointers-Sliding-Window/) |
| 4 | Sorting + Binary search | 12 | [05-Sorting-Binary-Search](05-Sorting-Binary-Search/) |
| 5 | Recursion + Backtracking | 12 | [06-Recursion-Backtracking](06-Recursion-Backtracking/) |
| 6 | Linked list | 12 | [07-Linked-List](07-Linked-List/) |
| 7 | Stack + Queue | 12 | [08-Stack-Queue](08-Stack-Queue/) |
| 8 | Trees + BST | 12 | [09-Trees-BST](09-Trees-BST/) |
| 9 | Heaps + Greedy | 12 | [10-Heaps-Greedy](10-Heaps-Greedy/) |
| 10 | Graphs | 12 | [11-Graphs](11-Graphs/) |
| 11 | Dynamic programming | 12 | [12-Dynamic-Programming](12-Dynamic-Programming/) |
| 12 | Timed mixed revision | 18 | [below](#week-12--timed-mixed-revision-18-problems) |
| | **Total** | **150** | |

Problem numbers are LeetCode numbers — search them on [leetcode.com](https://leetcode.com/problemset/).

## 🔁 How to Solve Each Problem
1. Try on your own for 25 minutes before looking at any hint.
2. Say the brute-force idea first, then improve it.
3. Save the solution in the topic folder as `ProblemName.java`, using the template below.
4. Update the problem's status in that folder's table: ✅ solved alone, 🔁 needed help.
5. On Day 7, re-solve your 🔁 problems without looking at your old code.

## 🧾 Solution Template

```java
/*
 * LC 1672 · Richest Customer Wealth · Easy
 * Approach: sum each customer's row and keep the maximum.
 * Time: O(m × n) · Space: O(1)
 */
public class RichestCustomerWealth {

    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int money : customer) wealth += money;
            max = Math.max(max, wealth);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));   // expected: 6
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})); // expected: 10
    }
}
```

Run it with `java RichestCustomerWealth.java`.

## Week 12 — Timed Mixed Revision (18 problems)
- [ ] Days 1–6: 3 problems a day in 90 minutes, each from a different topic, no hints
- [ ] Pick them from your 🔁 problems first, then from topics where your weekly test was weakest
- [ ] For each one, explain the approach and complexity out loud, as you would in an interview
