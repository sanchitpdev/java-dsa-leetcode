# LeetCode 73 – Set Matrix Zeroes

## Difficulty
Medium

## Topic
Array, Matrix, In-Place Algorithm

---

## Problem Statement

Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`.

You must do it **in place**, meaning you cannot use extra space proportional to the matrix size.

---

## Examples

### Example 1

**Input:**

matrix =
[
 [1, 1, 1],
 [1, 0, 1],
 [1, 1, 1]
]

**Output:**

[
 [1, 0, 1],
 [0, 0, 0],
 [1, 0, 1]
]

---

### Example 2

**Input:**

matrix =
[
 [0, 1, 2, 0],
 [3, 4, 5, 2],
 [1, 3, 1, 5]
]

**Output:**

[
 [0, 0, 0, 0],
 [0, 4, 5, 0],
 [0, 3, 1, 0]
]

---

## Key Insight

- If we directly set rows and columns to zero while scanning,
  we may accidentally spread zeros incorrectly.
- We need a way to mark which rows and columns should become zero.
- Best approach: Use the **first row and first column as markers**.

---

## Approach

1. Check if the first row contains any zero.
2. Check if the first column contains any zero.
3. Use the first row and first column to mark zero positions:
   - If matrix[i][j] == 0, mark:
     - matrix[i][0] = 0
     - matrix[0][j] = 0
4. Iterate through the matrix (excluding first row/col) and set zeros based on markers.
5. Finally, update first row and first column if needed.

---

## Algorithm

1. Initialize two flags:
   - firstRowZero
   - firstColZero
2. Scan first row for zeros.
3. Scan first column for zeros.
4. Mark rows and columns using first row/col.
5. Set matrix cells to zero using markers.
6. Apply zeroing for first row and first column if required.

---

## Complexity

- Time Complexity: O(m × n)
- Space Complexity: O(1)

---
