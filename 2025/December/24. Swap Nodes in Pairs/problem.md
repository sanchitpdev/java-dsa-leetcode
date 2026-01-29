# 24. Swap Nodes in Pairs

**Difficulty:** Medium  
**Topic:** Linked List  

---

## Problem Statement

Given a linked list, swap every two adjacent nodes and return its head.

You must solve the problem **without modifying the values** in the nodes.  
Only node pointers should be changed.

---

## Example

### Input

Head = [1,2,3,4]

### Output

[2,1,4,3]

---

### Input

Head = [1]

### Output

[1]

---

## Key Insight

- We need to swap nodes in pairs:  
  (1,2), (3,4), (5,6)...
- Swapping must be done by changing links, not values.
- A dummy node helps manage head changes easily.

---

## Approach

- Use a dummy node before head.
- Traverse the list two nodes at a time.
- Swap each pair by adjusting pointers.

---

## Algorithm

1. Create a dummy node pointing to head.
2. Set a pointer `prev` at dummy.
3. While two nodes exist (`first` and `second`):
   - Store `second.next`
   - Swap the pair:
     - `prev.next = second`
     - `second.next = first`
     - `first.next = nextPair`
   - Move `prev` forward to `first`
4. Return `dummy.next`

---

## Complexity

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)  

---

