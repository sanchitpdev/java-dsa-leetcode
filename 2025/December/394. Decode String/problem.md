# 394. Decode String

**Difficulty:** Medium  
**Topics:** Stack, String, Recursion

---

## 🧾 Problem Statement
Given an encoded string, return its decoded string.

The encoding rule is:

k[encoded_string]

Where the `encoded_string` inside the square brackets is repeated exactly `k` times.  
You may assume that the input string is always valid, and there are no extra white spaces.

Constraints:
- `1 <= s.length <= 30`
- `s` consists of lowercase English letters, digits, and square brackets `[]`.
- The test data guarantees that the output length will never exceed `10^5`.

---

## 📌 Examples

### Example 1

Input:  s = "3[a]2[bc]"
Output: "aaabcbc"

### Example 2

Input:  s = "3[a2[c]]"
Output: "accaccacc"

### Example 3

Input:  s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"

---

## 🔑 Key Insight
- Whenever we see `[`, we start a **new decoding context**.
- Use a **stack** to store:
  - previous string
  - repeat count
- When `]` appears, build the repeated string and merge it with the previous one.

---

## 🚀 Approach
1. Traverse the string character by character.
2. If digit → build the number.
3. If `[` → push current string and number into stacks.
4. If `]` → pop count and previous string, repeat current substring.
5. If letter → append to current result.

---

## 🧠 Algorithm
1. Create:
   - `Stack<Integer>` for counts
   - `Stack<StringBuilder>` for strings
2. Maintain:
   - `currentString`
   - `currentNumber`
3. Loop through characters:
   - digit → update number
   - `[` → push and reset
   - `]` → pop and build
   - char → append
4. Return final string.

---

## ⏱ Complexity
- **Time Complexity:** `O(n * k)` where `k` is max repetition count.
- **Space Complexity:** `O(n)` due to stacks.

---

