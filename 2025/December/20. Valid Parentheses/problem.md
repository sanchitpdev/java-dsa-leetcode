# 20. Valid Parentheses

**Difficulty:** Easy  
**Topic:** Stack, String

---

## Problem Statement

Given a string `s` containing only the characters:

- `'(' , ')'`
- `'{' , '}'`
- `'[' , ']'`

Determine if the input string is **valid**.

A string is valid if:
1. Open brackets are closed by the **same type** of brackets.
2. Open brackets are closed in the **correct order**.
3. Every closing bracket has a corresponding opening bracket.

---

## Example

### Example 1

Input:

s = "()"

Output:

true

---

### Example 2

Input:

s = "()[]{}"

Output:

true

---

### Example 3

Input:

s = "(]"

Output:

false

---

### Example 4

Input:

s = "([)]"

Output:

false

---

## Key Insight

- This is a **classic stack problem**.
- Every opening bracket must be **closed later** and in the **correct order**.
- Stack naturally enforces **Last In, First Out (LIFO)** behavior.

---

## Approach

1. Use a stack to store opening brackets.
2. Traverse the string character by character.
3. If the character is an opening bracket → push to stack.
4. If it is a closing bracket:
   - Stack must not be empty.
   - Top of stack must be the **matching opening bracket**.
5. At the end, stack must be empty.

---

## Algorithm

1. Initialize an empty stack.
2. For each character `c` in the string:
   - If `c` is `'('`, `'{'`, `'['` → push to stack.
   - Else:
     - If stack is empty → return `false`.
     - Pop top and check if it matches `c`.
3. After traversal:
   - If stack is empty → return `true`
   - Else → return `false`

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

