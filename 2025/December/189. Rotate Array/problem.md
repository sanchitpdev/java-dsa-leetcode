# 189. Rotate Array

**Difficulty:** Medium  
**Topic:** Array, Two Pointers, In-Place Reversal

---

## 🧾 Problem Statement
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

You must solve it **in-place** with **O(1)** extra space.

---

## 📌 Examples

### Example 1
**Input:**
nums = [1,2,3,4,5,6,7], k = 3  

**Output:**
[5,6,7,1,2,3,4]

---

### Example 2
**Input:**
nums = [-1,-100,3,99], k = 2  

**Output:**
[3,99,-1,-100]

---

## 🔑 Key Insight
- Rotating right by `k` means moving the last `k` elements to the front.
- Think of the array as two blocks:

[A | B]

Where:
- `B` = last `k` elements
- Goal → `[B | A]`

Instead of shifting repeatedly, use **reversal** to rearrange blocks efficiently.

---

## 🧠 Approach
1. First normalize rotations using:
k = k % n
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.

This swaps block positions and restores internal order.

---

## ⚙️ Algorithm
1. If array is null or length ≤ 1 → return.
2. Compute `n = nums.length`.
3. Reduce rotations using `k = k % n`.
4. If `k == 0` → return.
5. reverse(nums, 0, n-1)
6. reverse(nums, 0, k-1)
7. reverse(nums, k, n-1)

---

## ⏱ Complexity
- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

