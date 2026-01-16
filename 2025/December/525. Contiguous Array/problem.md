# LeetCode 525 – Contiguous Array

**Difficulty:** Medium  
**Topic:** Array, HashMap, Prefix Sum

---

## 📘 Problem Statement

Given a binary array `nums`, return the maximum length of a contiguous subarray with an equal number of `0` and `1`.

---

## 🧪 Examples

### Example 1

Input: nums = [0,1]
Output: 2

### Example 2

Input: nums = [0,1,0]
Output: 2

---

## 💡 Key Insight

The core idea is to **transform the problem**.

- Replace:
  - `0 → -1`
  - `1 → +1`
- Now the task becomes:
  > Find the **longest contiguous subarray with sum = 0**

This allows the use of **prefix sum + hashmap** to achieve an `O(n)` solution.

---

## 🛠️ Approach

1. Initialize a running `sum = 0`
2. Use a `HashMap` to store:
   - `prefixSum → first index where it appears`
3. Insert `(0 → -1)` initially to handle subarrays starting from index `0`
4. Traverse the array:
   - Add `-1` for `0`
   - Add `+1` for `1`
5. If the same prefix sum is seen again:
   - The subarray between indices has sum `0`
   - Update maximum length
6. If not seen before:
   - Store prefix sum with its index

---

## 🧩 Algorithm

1. Create a `HashMap<Integer, Integer>`
2. Put `(0, -1)` into the map
3. Initialize `sum = 0`, `maxLen = 0`
4. For each index `i`:
   - If `nums[i] == 0`, `sum -= 1`
   - Else `sum += 1`
   - If `sum` exists in map:
     - `maxLen = max(maxLen, i - map.get(sum))`
   - Else:
     - `map.put(sum, i)`
5. Return `maxLen`

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

