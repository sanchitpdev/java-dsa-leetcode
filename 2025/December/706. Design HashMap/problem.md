# 706. Design HashMap

**Difficulty:** Easy  
**Topics:** Array, Design, Hash Table  

---

## 🧾 Problem Statement
Design a HashMap without using any built-in hash table libraries.

Implement the `MyHashMap` class:

- `MyHashMap()` initializes the object with an empty map.
- `void put(int key, int value)` inserts a `(key, value)` pair into the HashMap. If the key already exists, update the corresponding value.
- `int get(int key)` returns the value mapped to the key, or `-1` if no mapping exists.
- `void remove(int key)` removes the key and its corresponding value if present.

**Constraints:**
- `0 <= key, value <= 10^6`
- At most `10^4` calls will be made to `put`, `get`, and `remove`.

---

## 📥 Examples

**Example 1**

Input:
["MyHashMap","put","put","get","get","put","get","remove","get"]
[[],[1,1],[2,2],[1],[3],[2,1],[2],[2],[2]]

Output:
[null,null,null,1,-1,null,1,null,-1]

**Explanation**

MyHashMap myHashMap = new MyHashMap();
myHashMap.put(1,1);
myHashMap.put(2,2);
myHashMap.get(1);    // return 1
myHashMap.get(3);    // return -1
myHashMap.put(2,1);  // update value
myHashMap.get(2);    // return 1
myHashMap.remove(2);
myHashMap.get(2);    // return -1

---

## 🔑 Key Insight
Since keys are bounded (`0 → 10^6`), we can use **Direct Addressing** instead of building a complex hashing structure.

👉 Use an array where:

index = key
value = array[key]

No collision handling required.

---

## 🚀 Approach
1. Create an integer array of size `1000001`.
2. Initialize all values with `-1` (meaning no mapping exists).
3. For `put(key,value)` → store value at index `key`.
4. For `get(key)` → return stored value.
5. For `remove(key)` → reset index to `-1`.

---

## 🧩 Algorithm

Initialize array map[1000001] with -1

put(key,value):
map[key] = value

get(key):
return map[key]

remove(key):
map[key] = -1

---

## ⏱ Complexity Analysis

Time Complexity:
put    → O(1)
get    → O(1)
remove → O(1)

Space Complexity:
O(10^6)

---

