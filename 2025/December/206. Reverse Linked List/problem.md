# LeetCode 206 — Reverse Linked List

## Problem
Reverse a singly linked list and return the new head.

## Example
Input:  1 → 2 → 3 → 4 → 5  
Output: 5 → 4 → 3 → 2 → 1  

## Idea
Use 3 pointers:
- prev
- curr
- next

Reverse links step by step.

## Steps
1. prev = null  
2. curr = head  
3. while curr != null  
   - save next node  
   - reverse pointer  
   - move forward  

## Time Complexity
O(n)

## Space Complexity
O(1)

