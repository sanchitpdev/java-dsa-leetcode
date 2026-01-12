# Trapping Rain Water

## Difficulty
Hard

## Topic
Array, Two Pointers, Dynamic Programming, Stack

## Problem Statement
Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

---

## Examples

### Example 1
**Input**

height = [0,1,0,2,1,0,1,3,2,1,2,1]

**Output**

6

---

### Example 2
**Input**

height = [4,2,0,3,2,5]

**Output**

9

---

## Key Insight
The water trapped at any index depends on the **minimum of the maximum height on its left and right**, minus the height at that index.


water[i] = min(maxLeft, maxRight) - height[i]

---

## Approach
Use the **Two Pointers** technique to efficiently compute trapped water.

- Maintain two pointers (`left`, `right`)
- Track the maximum height seen so far from both sides
- Move the pointer with the smaller height
- Accumulate trapped water while traversing

This avoids extra space and works in linear time.

---

## Algorithm
1. Initialize two pointers at the start and end of the array
2. Maintain `leftMax` and `rightMax`
3. Compare heights at both pointers
4. Move the pointer with the smaller height
5. Add trapped water when current height is less than the corresponding max
6. Continue until both pointers meet

---

## Complexity
**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## Code Reference
solution.java

---

## Handwritten Notes
notes.jpg

