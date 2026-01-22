# Rotate Image

**Difficulty:** Medium  
**Topic:** Array, Matrix, Simulation  

---

## Problem Statement

You are given an `n × n` 2D matrix representing an image.  
Rotate the image **90 degrees clockwise in-place**.

You must modify the input matrix directly without using another 2D matrix.

---

## Examples

### Example 1
**Input:**

[
[1,2,3],
[4,5,6],
[7,8,9]
]

**Output:**

[
[7,4,1],
[8,5,2],
[9,6,3]
]

---

### Example 2
**Input:**

[
[ 5, 1, 9,11],
[ 2, 4, 8,10],
[13, 3, 6, 7],
[15,14,12,16]
]

**Output:**

[
[15,13, 2, 5],
[14, 3, 4, 1],
[12, 6, 8, 9],
[16, 7,10,11]
]

---

## Key Insight

- Rotation is done **layer by layer**, like onion rings.
- Each rotation operation swaps **4 elements at once**.
- Therefore, we do **NOT** need to traverse the entire matrix.
- Traversing more than half will cause **duplicate rotations**.

---

## Approach

1. Treat the matrix as multiple **layers**.
2. For each layer:
   - Traverse only **half of the columns** in the current row.
3. Perform a **4-way swap** for every valid `(i, j)`:
   - top → right → bottom → left → top
4. Loop limits ensure:
   - No duplicate rotations
   - Proper handling of odd and even `n`

---

## Algorithm

1. Let `n = matrix.length`
2. Loop `i` from `0` to `(n + 1) / 2`
   - `i` represents the **current layer**
3. Loop `j` from `0` to `n / 2`
   - `j` selects **unique starting points**
4. Rotate the following 4 positions:
   - `(i, j)`
   - `(n-1-j, i)`
   - `(n-1-i, n-1-j)`
   - `(j, n-1-i)`

---
## Complexity Analysis

* **Time Complexity:** `O(n²)`

  * Each element is moved exactly once.
* **Space Complexity:** `O(1)`

  * Rotation is done in-place.
