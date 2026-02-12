# 21. Merge Two Sorted Lists

**Difficulty:** Easy  
**Topic:** Linked List, Recursion, Two Pointers

---

## 🧾 Problem Statement

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted linked list**. The merged list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

---

## 🧪 Examples

### Example 1

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

### Example 2

Input: list1 = [], list2 = []
Output: []

### Example 3

Input: list1 = [], list2 = [0]
Output: [0]

---

## 💡 Key Insight

Since both lists are already **sorted**, we don’t need to sort again.

Use a **two-pointer technique**:
- Compare current nodes of both lists.
- Attach the smaller node to the result.
- Move that list forward.

This is similar to the **merge step of Merge Sort**.

---

## ⚙️ Approach

### ✅ Iterative Approach (Most Common)

1. Create a dummy node to simplify edge cases.
2. Maintain a pointer `current`.
3. Compare values from both lists:
   - Attach smaller node to `current.next`.
   - Move pointer forward.
4. When one list ends, attach the remaining nodes.

### ✅ Recursive Approach (Alternative)
- Base case: if one list is null, return the other.
- Compare heads and recursively merge remaining nodes.

---

## 🧩 Algorithm

1. Create `dummy` node.
2. Set `current = dummy`.
3. While both lists are not null:
   - If `list1.val <= list2.val`
     - `current.next = list1`
     - move `list1`
   - else
     - `current.next = list2`
     - move `list2`
   - move `current`
4. Attach remaining list.
5. Return `dummy.next`.

---

## ⏱️ Complexity

- **Time Complexity:** O(n + m)  
  (Traverse both lists once)

- **Space Complexity:**  
  - Iterative → O(1)  
  - Recursive → O(n + m) (call stack)

Where:
- `n` = length of list1
- `m` = length of list2

---

