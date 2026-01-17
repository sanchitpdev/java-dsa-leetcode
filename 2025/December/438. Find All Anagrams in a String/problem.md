# LeetCode 438 – Find All Anagrams in a String

**Difficulty:** Medium  
**Topic:** Sliding Window, Hashing, Strings  

---

## 📘 Problem Statement

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`.

An **anagram** is a rearrangement of characters, typically using all the original characters exactly once.

---

## 🧪 Examples

### Example 1
```

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]

```

### Example 2
```

Input: s = "abab", p = "ab"
Output: [0,1,2]

````

---

## 💡 Key Insight

- An anagram requires the same character frequency
- Window size must be equal to `p.length()`
- Sliding Window + Frequency Array avoids sorting

---

## 🧠 Approach

1. Use two frequency arrays of size 26
2. One array stores frequency of characters in `p`
3. Second array stores frequency of current window in `s`
4. Slide a fixed-size window across `s`
5. Compare both frequency arrays at each step

---

## 🧾 Algorithm

1. If `s.length < p.length`, return empty list
2. Initialize two arrays of size 26
3. Fill frequency of string `p`
4. Fill frequency of first window in `s`
5. Compare arrays
6. Slide window:
   - Add right character
   - Remove left character
7. Store valid starting indices

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

