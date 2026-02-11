# 692. Top K Frequent Words

- **Difficulty:** Medium  
- **Topic:** HashMap, Heap (Priority Queue), Sorting, String

---

## 🧾 Problem Statement
Given an array of strings `words` and an integer `k`, return the `k` most frequent strings.

The answer should be sorted:
1. By **frequency** in descending order.
2. If frequencies are equal, sort **lexicographically** (alphabetically).

---

## 📌 Examples

### Example 1
Input:
words = ["i","love","leetcode","i","love","coding"], k = 2  

Output:
["i","love"]

### Example 2
Input:
words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4  

Output:
["the","is","sunny","day"]

---

## 🔑 Key Insight
- First count frequency using **HashMap**.
- Then maintain a **Priority Queue (Heap)**:
  - Higher frequency → higher priority.
  - Same frequency → lexicographically smaller word first.

Two approaches exist:
- Sorting all entries → `O(n log n)`
- Min Heap of size `k` → more optimal

---

## ⚙️ Approach
1. Create `HashMap<String, Integer>` to count frequencies.
2. Use a **PriorityQueue** with custom comparator:
   - Frequency descending.
   - If tie → word.compareTo().
3. Add all keys into heap.
4. Poll top `k` elements.

---

## 🧩 Algorithm
1. Iterate over `words` and update frequency map.
2. Build a max heap using comparator rules.
3. Push all map keys into heap.
4. Extract `k` elements from heap into result list.
5. Return result.

---

## ⏱️ Complexity
- **Time Complexity:** `O(n log n)`  
- **Space Complexity:** `O(n)`

---

