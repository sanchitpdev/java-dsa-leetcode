# 155. Min Stack

**Difficulty:** Medium  
**Topic:** Stack, Design, Data Structure  

---

## Problem Statement

Design a stack that supports push, pop, top, and retrieving the minimum element in **constant time**.

Implement the `MinStack` class:

- `MinStack()` initializes the stack object.
- `void push(int val)` pushes the element `val` onto the stack.
- `void pop()` removes the element on the top of the stack.
- `int top()` gets the top element of the stack.
- `int getMin()` retrieves the minimum element in the stack.

All operations must run in **O(1)** time.

---

## Example

### Input

["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

### Output

[null,null,null,null,-3,null,0,-2]

### Explanation

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   // returns -3
minStack.pop();
minStack.top();      // returns 0
minStack.getMin();   // returns -2

---

## Key Insight

- When an element is popped, the **minimum may change**.
- We must **remember previous minimum values**.
- Using an extra stack allows tracking minimum values efficiently.
- Each minimum is pushed only when it changes.

---

## Approach

Use **two stacks**:
1. **Main stack** → stores all values
2. **Min stack** → stores minimum values at each level

- Push value to min stack only if it is **≤ current minimum**
- Pop from min stack only if popped value equals current minimum

---

## Algorithm

1. Initialize two stacks: `stack` and `minStack`
2. On `push(val)`:
   - Push `val` to `stack`
   - If `minStack` is empty or `val <= minStack.top()`, push `val` to `minStack`
3. On `pop()`:
   - Remove top element from `stack`
   - If removed element equals `minStack.top()`, pop from `minStack`
4. On `top()`:
   - Return top element of `stack`
5. On `getMin()`:
   - Return top element of `minStack`

---

## Complexity Analysis

* **Time Complexity:**

  * `push`, `pop`, `top`, `getMin` → **O(1)**

* **Space Complexity:**

  * **O(n)** (extra stack for minimum values)

---

