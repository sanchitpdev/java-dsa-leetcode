# LeetCode 25 – Reverse Nodes in k-Group

**Difficulty:** Hard  
**Topic:** Linked List, Recursion

---

## Problem Statement

Given the head of a linked list, reverse the nodes of the list **k at a time**, and return the modified list.

- `k` is a positive integer.
- If the number of nodes is not a multiple of `k`, the remaining nodes stay as they are.
- You may not change node values, only node links.

---

## Examples

### Example 1
**Input:**  
`head = [1,2,3,4,5], k = 2`  
**Output:**  
`[2,1,4,3,5]`

### Example 2
**Input:**  
`head = [1,2,3,4,5], k = 3`  
**Output:**  
`[3,2,1,4,5]`

---

## Key Insight

Reverse the linked list in fixed-size blocks of `k` nodes.  
If fewer than `k` nodes remain, do not reverse that part.

---

## Approach

1. Check whether at least `k` nodes exist.
2. Reverse the first `k` nodes.
3. Recursively process the remaining list.
4. Connect the reversed part with the rest.

---

## Algorithm

1. Traverse `k` nodes to verify availability.
2. Reverse `k` nodes using pointer manipulation.
3. Recursively call the function for the remaining list.
4. Return the new head of the reversed group.

---

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n) (recursion stack)

---
