# 🚀 LeetCode 334 — Increasing Triplet Subsequence

**Difficulty:** Medium  
**Topics:** Greedy, Array, Subsequence

---

# 🧩 Problem Statement

Given an integer array `nums`, return `true` if there exists a triplet of indices  
`(i, j, k)` such that:

i < j < k
nums[i] < nums[j] < nums[k]

If no such triplet exists, return `false`.

---

# 🧪 Examples

### Example 1

Input: nums = [1,2,3,4,5]
Output: true
Explanation: (1,2,3) forms an increasing triplet.

### Example 2

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No increasing subsequence of length 3.

### Example 3

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: (0,4,6) is a valid triplet.

---

# 🔑 Key Insight

We do **not** need to store the actual triplet.

Instead, maintain two thresholds:

- `small` → smallest value seen so far
- `second` → smallest value greater than `small`

If we ever find a number greater than both, an increasing triplet exists.

Greedy idea:

Keep small and second as LOW as possible
so the chance of finding the third number increases.

---

# 🧠 Approach (Greedy)

1. Initialize:

small = +∞
second = +∞

2. Traverse the array:

- If `num <= small` → update `small`
- Else if `num <= second` → update `second`
- Else → we found:
  ```
  small < second < num
  ```
  return `true`

3. If traversal finishes, return `false`.

---

# ⚙️ Algorithm

small = INF
second = INF

for each num in nums:
if num <= small:
small = num
else if num <= second:
second = num
else:
return true

return false

---

# ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
  - Single pass through the array.

- **Space Complexity:** `O(1)`
  - Only two variables are used.

---

