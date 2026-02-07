# 142. Linked List Cycle II

**Difficulty:** Medium  
**Topic:** Linked List, Two Pointers (Floyd’s Cycle Detection)

---

## Problem Statement

Given the `head` of a linked list, return the **node where the cycle begins**.  
If there is **no cycle**, return `null`.

> Do **not** modify the linked list.

---

## Example

### Example 1

Input:

head = [3,2,0,-4], pos = 1

Output:

Node with value 2

Explanation:
- There is a cycle in the linked list.
- The tail connects to the **1st index node** (0-based), which has value `2`.

---

### Example 2

Input:

head = [1,2], pos = 0

Output:

Node with value 1

---

### Example 3

Input:

head = [1], pos = -1

Output:

null

---

## Key Insight

- If a cycle exists, **slow and fast pointers will meet** inside the cycle.
- Once they meet:
  - Move **one pointer to head**
  - Move **both pointers one step at a time**
  - The node where they meet again is the **start of the cycle**

This is a mathematical property of cycle lengths — not a coincidence.

---

## Approach

Use **Floyd’s Tortoise and Hare Algorithm**:

### Phase 1: Detect Cycle
- `slow` moves 1 step
- `fast` moves 2 steps
- If they meet → cycle exists

### Phase 2: Find Cycle Start
- Move `slow` to `head`
- Move both pointers 1 step at a time
- The meeting point is the **cycle entry**

---

## Algorithm

1. Initialize `slow = head`, `fast = head`
2. While `fast != null && fast.next != null`
   - `slow = slow.next`
   - `fast = fast.next.next`
   - If `slow == fast`, break
3. If no meeting happened → return `null`
4. Reset `slow = head`
5. While `slow != fast`
   - `slow = slow.next`
   - `fast = fast.next`
6. Return `slow`

---
## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

---

