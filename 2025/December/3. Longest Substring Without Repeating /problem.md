# LeetCode 3 — Longest Substring Without Repeating Characters

**Difficulty:** Medium  
**Topic:** String, Sliding Window, Hash Set  

---

## Problem Statement

Given a string `s`, find the length of the **longest substring** without repeating characters.

---

## Examples

### Example 1

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

### Example 2

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.


### Example 3

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

---

## Key Insight

- The problem asks for a **substring**, not a subsequence
- Substring means **continuous characters**
- Use a **sliding window** to maintain a window with unique characters
- Each character is added and removed at most once

---

## Approach

1. Use two pointers: `left` and `right`
2. Maintain a `HashSet` to track characters in the current window
3. Expand the window by moving `right`
4. If a duplicate character appears:
   - Shrink the window from the left until the duplicate is removed
5. Update the maximum window size during traversal

---

## Algorithm

1. Initialize `left = 0`, `maxLen = 0`, and an empty set
2. Loop `right` from `0` to `n - 1`
3. While `s[right]` exists in the set:
   - Remove `s[left]` from the set
   - Increment `left`
4. Add `s[right]` to the set
5. Update `maxLen = max(maxLen, right - left + 1)`
6. Return `maxLen`

---

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(min(n, charset))

---

