# LeetCode 53: Maximum Subarray

**Difficulty:** Easy  
**Topic:** Array, Dynamic Programming, Kadane’s Algorithm

---

## 📘 Problem Statement

Given an integer array `nums`, find the **subarray with the largest sum**, and return its sum.

A **subarray** is a contiguous part of an array and must contain at least one element.

---

## 🧪 Examples

### Example 1

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum = 6.

### Example 2

Input: nums = [1]
Output: 1


### Example 3

Input: nums = [5,4,-1,7,8]
Output: 23

---

## 💡 Key Insight

At every index, you have **two choices**:
1. Extend the previous subarray
2. Start a new subarray from the current element

If the previous sum becomes **negative**, it is better to **discard it**.

This idea leads to **Kadane’s Algorithm**.

---

## 🧠 Approach (Kadane’s Algorithm)

- Maintain two variables:
  - `currentSum`: maximum subarray sum ending at current index
  - `maxSum`: maximum subarray sum found so far
- For each element:
  - `currentSum = max(nums[i], currentSum + nums[i])`
  - `maxSum = max(maxSum, currentSum)`

---

## 🧾 Algorithm

1. Initialize `currentSum` and `maxSum` with `nums[0]`
2. Iterate from index `1` to `n-1`
3. At each index:
   - Decide whether to extend or restart the subarray
4. Update `maxSum`
5. Return `maxSum`

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

