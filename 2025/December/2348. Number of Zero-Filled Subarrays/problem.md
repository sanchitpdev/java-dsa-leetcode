# 2348. Number of Zero-Filled Subarrays

## 🟢 Difficulty
Medium

## 🧭 Topic
Array, Math, Counting, Prefix Contribution

---

## 📘 Problem Statement
Given an integer array `nums`, return the number of subarrays filled with `0`.

A **subarray** is a contiguous non-empty sequence of elements within an array.  
A subarray is considered **zero-filled** if all elements inside it are equal to `0`.

---

## 🧪 Examples

### Example 1
**Input:**
nums = [1,3,0,0,2,0,0,4]

**Output:**
6

**Explanation:**
Zero-filled subarrays are:
[0], [0], [0,0], [0], [0], [0,0]

---

### Example 2
**Input:**
nums = [0,0,0,2,0,0]

**Output:**
9

---

### Example 3
**Input:**
nums = [2,10,2019]

**Output:**
0

---

## 🔑 Key Insight
Instead of generating all subarrays, observe that:

If there are `k` consecutive zeros, then the number of zero-filled subarrays formed is:

k + (k-1) + ... + 1

Rather than calculating this separately, we maintain a running count of consecutive zeros (`currZero`).  
At each index:

- If current element is `0`, increment `currZero`
- Add `currZero` to total answer

This counts all zero-subarrays ending at the current index.

---

## 🚀 Approach
- Traverse the array once.
- Maintain a counter `currZero` for consecutive zeros.
- If `nums[i] == 0`, increase `currZero` and add it to total.
- If non-zero appears, reset `currZero` to 0.
- Use `long` for total because the result may exceed `int` range.

---

## 🧩 Algorithm
1. Initialize:
   - `currZero = 0`
   - `total = 0`
2. Loop through array:
   - If element is `0`:
     - increment `currZero`
     - `total += currZero`
   - Else:
     - reset `currZero = 0`
3. Return `total`.

---

## ⏱️ Complexity

**Time Complexity:**  
O(n) — Single traversal of the array.

**Space Complexity:**  
O(1) — Only constant extra variables used.

