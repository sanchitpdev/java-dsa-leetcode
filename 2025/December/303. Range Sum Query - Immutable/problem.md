# LeetCode 303 – Range Sum Query: Immutable

## Difficulty
Easy

## Topic
Array, Prefix Sum, Design

## Problem Statement
Given an integer array `nums`, handle multiple queries of the following type:

- `sumRange(left, right)` — return the sum of the elements of `nums` between indices `left` and `right` inclusive.

Implement the `NumArray` class:

- `NumArray(int[] nums)` initializes the object with the integer array `nums`.
- `int sumRange(int left, int right)` returns the sum of the elements between indices `left` and `right`.

The array is **immutable**, meaning it will not change after initialization.

---

## Example

**Input**

nums = [-2, 0, 3, -5, 2, -1]
sumRange(0, 2)
sumRange(2, 5)
sumRange(0, 5)

**Output**

1
-1
-3

---

## Key Insight
- `sumRange` can be called **many times**
- Recalculating sum for each query is inefficient
- Use **prefix sum** to answer each query in `O(1)` time

---

## Approach
1. Create a prefix sum array where each index stores the sum from `0` to that index
2. Precompute the prefix sum in the constructor
3. For each query:
   - If `left == 0`, return `prefix[right]`
   - Otherwise, return `prefix[right] - prefix[left - 1]`

---

## Algorithm
1. Initialize an array `prefix` of size `nums.length`
2. Set `prefix[0] = nums[0]`
3. For each index `i` from `1` to `n-1`, compute:

prefix[i] = prefix[i - 1] + nums[i]

4. For `sumRange(left, right)`:
- If `left == 0`, return `prefix[right]`
- Else return `prefix[right] - prefix[left - 1]`

---

## Complexity

* Time Complexity:

  * Constructor: `O(n)`
  * `sumRange`: `O(1)`
* Space Complexity: `O(n)`

---

## Handwritten Notes
notes.jpg
