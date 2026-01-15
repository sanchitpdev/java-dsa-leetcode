# LeetCode 560 – Subarray Sum Equals K

## Difficulty
Medium

## Topic
Array, Prefix Sum, HashMap

## Problem Statement
Given an integer array `nums` and an integer `k`, return the **total number of continuous subarrays** whose sum equals `k`.

A **subarray** is a contiguous non-empty sequence of elements within an array.

## Example 1

### Input

nums = [1,1,1], k = 2

### Output

2

### Explanation
The subarrays that sum to `2` are:
- `[1,1]` (index 0 to 1)
- `[1,1]` (index 1 to 2)

## Example 2

### Input

nums = [1,2,3], k = 3

### Output

2

### Explanation
The subarrays that sum to `3` are:
- `[1,2]`
- `[3]`

## Key Insight
- Subarrays must be **contiguous**
- Brute-force checking all subarrays leads to poor performance
- Efficient solutions rely on **prefix sums** and **frequency tracking**

## Approach
1. Traverse the array while maintaining a running sum
2. Use previously seen sums to determine valid subarrays
3. Count how many times a required sum condition is satisfied
4. Avoid checking all subarrays explicitly

## Algorithm
1. Initialize required data structures
2. Iterate through the array
3. Update running sum
4. Check conditions related to `k`
5. Update count accordingly

## Constraints
- `1 <= nums.length <= 2 * 10^4`
- `-1000 <= nums[i] <= 1000`
- `-10^7 <= k <= 10^7`

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Code Reference
- Java
- Uses arrays and standard collections

## Handwritten Notes
notes.jpg


