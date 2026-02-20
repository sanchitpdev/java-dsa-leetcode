# 6. Zigzag Conversion

**Difficulty:** Medium  
**Topic:** Strings, Simulation

---

## 🧾 Problem Statement

Given a string `s` and an integer `numRows`, write the string in a zigzag pattern on the given number of rows and then read line by line.

Example (numRows = 3):

```

P   A   H   N
A P L S I I G
Y   I   R

```

Return the string formed by reading row by row.

---

## 📌 Examples

### Example 1

Input:  s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

### Example 2

Input:  s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

### Example 3

Input:  s = "A", numRows = 1
Output: "A"

---

## 🔑 Key Insight

Instead of building a 2D zigzag matrix, simulate the **movement of a pointer (pin)** that moves:

down → down → down → up → up → ...

The row index follows a wave pattern:

0 → 1 → 2 → ... → numRows-1 → ... → 1 → 0 ...

Whenever the pointer hits:

- top row (`0`)
- bottom row (`numRows - 1`)

the direction flips.

---

## 🧠 Approach (Simulation Method)

1. Handle edge case:
   - If `numRows == 1` or `numRows >= s.length()` return `s`.

2. Create `numRows` containers using `StringBuilder`.

3. Maintain:
   - `currentRow`
   - `goingDown` (direction flag)

4. For each character:
   - Append it to `rows[currentRow]`
   - Flip direction if at boundary
   - Move row pointer up or down

5. Concatenate all rows from top to bottom.

---

## ⚙️ Algorithm

if numRows == 1:
return s

create list of StringBuilder rows

currentRow = 0
goingDown = false

for each character c in s:
rows[currentRow].append(c)

if currentRow == 0 OR currentRow == numRows-1:
    goingDown = !goingDown

if goingDown:
    currentRow++
else:
    currentRow--

combine all rows into result
return result

---

## ⏱️ Complexity Analysis

**Time Complexity:** `O(n)`  
- Each character is processed once.

**Space Complexity:** `O(n)`  
- Extra storage for row builders.
