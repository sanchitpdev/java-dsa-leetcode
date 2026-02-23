# 767. Reorganize String

## Difficulty
Medium

## Topic
Greedy, Heap (Priority Queue), String, HashMap

---

## Problem Statement

Given a string `s`, rearrange the characters so that no two adjacent characters are the same.

Return any possible rearrangement of `s` or return an empty string `""` if not possible.

---

## Examples

### Example 1
Input:
s = "aab"  
Output:
"aba"

### Example 2
Input:
s = "aaab"  
Output:
""

---

## Key Insight

- The character with the highest frequency determines whether a valid arrangement is possible.
- If any character frequency is greater than `(n + 1) / 2`, a valid rearrangement cannot exist.
- A greedy strategy works by always selecting the two characters with the highest remaining frequencies and placing them alternately.

---

## Approach (Greedy + Max Heap)

1. Count frequency of each character using an array.
2. Insert characters into a max heap based on frequency.
3. Rebuild the string by repeatedly picking the top two most frequent characters.
4. Append them to the result and decrease their frequencies.
5. Push them back into the heap if their frequency is still greater than zero.
6. If one character remains, it must have frequency 1; otherwise return an empty string.

---

## Algorithm

1. Create an integer array `freq[26]`.
2. Build a max heap storing pairs `{charIndex, frequency}`.
3. Initialize a `StringBuilder` for the result.
4. While heap size is at least two:
   - Pop two elements.
   - Append both characters.
   - Decrement counts and reinsert if needed.
5. Handle the remaining character if present.

---

## Complexity

Time Complexity: O(n log 26) ≈ O(n)  
Space Complexity: O(26) ≈ O(1)

---

