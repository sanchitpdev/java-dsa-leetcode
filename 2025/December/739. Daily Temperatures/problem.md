# 739. Daily Temperatures

**Difficulty:** Medium  
**Topic:** Stack, Monotonic Stack

---

## Problem Statement
Given an array `temperatures` where `temperatures[i]` represents the temperature
on the i-th day, return an array `answer` such that `answer[i]` is the number of
days you have to wait after the i-th day to get a warmer temperature.
If there is no future day for which this is possible, put `0`.

---

## Examples

### Example 1
**Input:**  
temperatures = [73,74,75,71,69,72,76,73]

**Output:**  
[1,1,4,2,1,1,0,0]

**Explanation:**  
Each value tells how many days to wait until a warmer temperature occurs.

---

## Key Insight
To find the next warmer day efficiently, we must avoid repeated comparisons.
A monotonic decreasing stack helps resolve answers as soon as a warmer
temperature appears.

---

## Approach
- Use a monotonic decreasing stack that stores indices.
- Traverse temperatures from left to right.
- When the current temperature is greater than the temperature at the stack’s top,
  pop the index and calculate the difference in days.

---

## Algorithm
1. Initialize an empty stack and an answer array.
2. Iterate through the temperature array.
3. While stack is not empty and current temperature is greater than the temperature
   at stack top:
   - Pop index from stack.
   - Set answer[index] = current_day - index.
4. Push current index onto the stack.
5. Return the answer array.

---

## Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

