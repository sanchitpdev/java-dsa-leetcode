# 160. Intersection of Two Linked Lists

Difficulty: Easy  
Topic: Linked List, Two Pointers  

---

## Problem Statement

Given the heads of two singly linked lists `headA` and `headB`, return the node at which the two lists intersect.

If the two linked lists do not intersect, return `null`.

Intersection is based on reference, not value. Two nodes intersect only if they are the same node in memory.

---

## Examples

Example 1:

Input:

ListA = [4,1,8,4,5]
ListB = [5,6,1,8,4,5]
Intersection = 8

Output:

Intersected at node with value 8

---

Example 2:

Input:

ListA = [1,9,1,2,4]
ListB = [3,2,4]
Intersection = 2

Output:

Intersected at node with value 2

---

Example 3:

Input:

ListA = [2,6,4]
ListB = [1,5]

Output:

null

---

## Key Insight

To find the intersection efficiently:

* Compute lengths of both lists.
* Move the longer list pointer ahead until both lists have equal remaining nodes.
* Traverse both lists together.
* The first node where both pointers match is the intersection.

---

## Approach

1. Find lengths of both linked lists.
2. Align the heads by skipping extra nodes in the longer list.
3. Move both pointers step by step until they meet.

---

## Algorithm

1. Compute `lenA` and `lenB`
2. Advance the longer list head by `abs(lenA - lenB)`
3. Traverse both lists:

   * If `headA == headB`, return that node
4. Return `null` if no intersection

---

## Complexity

Time Complexity:

O(n + m)

Space Complexity:

O(1)

---

