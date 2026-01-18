# LeetCode 567 – Permutation in String

**Difficulty:** Medium  
**Topic:** Sliding Window, Hashing, Strings  

---

## 📘 Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

A permutation means rearranging all characters of `s1` exactly once.

---

## 🧪 Examples

### Example 1

Input: s1 = "ab", s2 = "eidbaooo"
Output: true

### Example 2

Input: s1 = "ab", s2 = "eidboaoo"
Output: false

---

## 💡 Key Insight

- A permutation requires the same character frequency
- The window size must always be equal to `s1.length()`
- This is a fixed-size sliding window problem
- Same logic as LeetCode 438, but returns boolean instead of indices

---

## 🧠 Approach

1. Create a frequency array for `s1`
2. Create a frequency array for a sliding window in `s2`
3. Initialize the first window of size `s1.length()`
4. Slide the window one character at a time:
   - Add the new right character
   - Remove the leftmost character
5. If frequencies match at any point, return `true`

---

## 🧾 Algorithm

1. If `s1.length > s2.length`, return `false`
2. Initialize two arrays of size 26
3. Fill frequency array for `s1`
4. Fill frequency array for the first window in `s2`
5. Compare both arrays
6. Slide the window until the end of `s2`
7. If no match found, return `false`

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
