# LeetCode 152 – Maximum Product Subarray

**Difficulty:** Medium  
**Topic:** Array, Dynamic Programming  

---

## Problem Statement

Given an integer array `nums`, find a **subarray** that has the **largest product**, and return the product.

A **subarray** is a contiguous non-empty sequence of elements within an array.

---

## Example 1

**Input**

nums = [2,3,-2,4]

**Output**

6

**Explanation**  
The subarray `[2,3]` has the largest product `6`.

---

## Example 2

**Input**

nums = [-2,0,-1]

**Output**

0

**Explanation**  
The result cannot be `2`, because `[-2,-1]` is not a contiguous subarray.

---

## Key Insight

- Unlike **Maximum Sum Subarray**, product behaves differently because:
  - A **negative number can flip** the minimum product into a maximum.
  - Zero breaks the subarray.
- At every index, we must track:
  - **Maximum product ending here**
  - **Minimum product ending here**

Why minimum?  
Because multiplying a negative number with a minimum (negative) product can become the new maximum.

---

## Approach

Use **Dynamic Programming** while iterating through the array:

1. Maintain:
   - `maxProd` → maximum product ending at current index
   - `minProd` → minimum product ending at current index
2. For each element:
   - If the element is negative, swap `maxProd` and `minProd`
   - Update:
     - `maxProd = max(nums[i], maxProd * nums[i])`
     - `minProd = min(nums[i], minProd * nums[i])`
3. Track the global maximum result.

---

## Algorithm

1. Initialize:
   - `maxProd = nums[0]`
   - `minProd = nums[0]`
   - `result = nums[0]`
2. Traverse array from index `1`:
   - If `nums[i] < 0`, swap `maxProd` and `minProd`
   - Update `maxProd` and `minProd`
   - Update `result`
3. Return `result`

---

## Complexity Analysis

* **Time Complexity:** O(n)
* **Space Complexity:** O(1)

