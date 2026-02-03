# LeetCode 876 — Middle of the Linked List

**Difficulty:** Easy  
**Topic:** Linked List, Two Pointers  

---

## Problem Statement

Given the head of a singly linked list, return the **middle node** of the linked list.

- If there are **two middle nodes**, return the **second middle node**.

---

## Example 1

head = [1,2,3,4,5]

### Output

[3,4,5]

Explanation: The middle node is node `3`.

---

## Example 2

### Input

head = [1,2,3,4,5,6]

### Output

[4,5,6]

Explanation: There are two middle nodes `3` and `4`, so we return the second one.

---

## Key Insight

Use the **fast and slow pointer technique**:

- Slow moves **1 step**
- Fast moves **2 steps**

When fast reaches the end, slow will be at the middle.

---

## Approach

1. Initialize two pointers:
   - `slow = head`
   - `fast = head`

2. Move:
   - `slow` by 1 step
   - `fast` by 2 steps

3. When `fast` becomes `null` or `fast.next` becomes `null`,
   `slow` will point to the middle node.

---

## Algorithm

1. Start both pointers at head.
2. While fast and fast.next are not null:
   - slow = slow.next
   - fast = fast.next.next
3. Return slow.

---

## Complexity Analysis

- **Time Complexity:** `O(N)`  
- **Space Complexity:** `O(1)`
