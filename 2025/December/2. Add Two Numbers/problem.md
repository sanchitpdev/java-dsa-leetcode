# LeetCode 2 — Add Two Numbers

**Difficulty:** Medium  
**Topic:** Linked List, Math, Recursion  

---

## Problem Statement

You are given two **non-empty linked lists** representing two non-negative integers.

- The digits are stored in **reverse order**
- Each node contains a single digit

Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain leading zeros except the number 0 itself.

---

## Examples

### Example 1

**Input**

l1 = [2,4,3]  
l2 = [5,6,4]

**Output**

[7,0,8]

**Explanation**

342 + 465 = 807

---

### Example 2

**Input**

l1 = [0]  
l2 = [0]

**Output**

[0]

---

### Example 3

**Input**

l1 = [9,9,9,9,9,9,9]  
l2 = [9,9,9,9]

**Output**

[8,9,9,9,0,0,0,1]

---

## Key Insight

We simulate the addition exactly like manual addition:

- Add digits node-by-node
- Maintain a `carry`
- Create a new linked list for the result

---

## Approach

- Use a dummy head node for easier list building
- Traverse both linked lists until both are exhausted
- Add corresponding digits and carry
- Store current digit in a new node
- Update carry
- At the end, if carry remains, add a new node

---

## Algorithm

1. Initialize dummy node and pointer `curr`
2. Initialize `carry = 0`
3. While `l1` or `l2` or `carry` exists:
   - Get values from nodes (0 if null)
   - Sum = val1 + val2 + carry
   - New digit = sum % 10
   - carry = sum / 10
   - Create node with new digit
4. Return `dummy.next`

---

## Complexity

- **Time Complexity:** O(max(N, M))
- **Space Complexity:** O(max(N, M))

Where N and M are lengths of the two linked lists.
