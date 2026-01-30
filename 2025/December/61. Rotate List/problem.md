# LeetCode 61 - Rotate List

---

## Difficulty
Medium  

---

## Topic
Linked List, Two Pointers  

---

## Problem Statement
Given the head of a linked list, rotate the list to the right by k places.

---

## Examples

### Example 1

Input:

head = [1,2,3,4,5], k = 2

Output:

[4,5,1,2,3]

Explanation:
- Rotate 1 step: [5,1,2,3,4]  
- Rotate 2 steps: [4,5,1,2,3]

---

### Example 2

Input:

head = [0,1,2], k = 4

Output:

[2,0,1]

Explanation:
- Length = 3  
- k = 4 % 3 = 1  
- Rotate right by 1 step → [2,0,1]

---

## Key Insight
Rotation is repetitive. Rotating by k places is the same as rotating by:

k % length

To rotate efficiently:
- Find the length of the list
- Make the list circular
- Break the circle at the correct position

---

## Approach
1. Handle edge cases (empty list or single node).
2. Find the length of the list and the tail node.
3. Compute k = k % length.
4. Connect tail.next to head to form a circular linked list.
5. Find the new tail at position (length - k).
6. Break the circle and return the new head.

---

## Algorithm
- Traverse list to get length and tail
- Compute effective rotations
- Make list circular
- Move (length - k) steps to find new tail
- Set newHead = newTail.next
- Break link and return newHead

---

## Complexity
Time Complexity: O(n)  
Space Complexity: O(1)  

---
