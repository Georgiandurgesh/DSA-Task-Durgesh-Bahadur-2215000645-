# DSA-Task-

# For Any Doubt 💬

Reach out to *Piyush* at *6397415707* Or *Parth* at *9559805577*.


# Week 1 Task: Let's Master "Subarray" Related Problems 🚀

## 1. Understand the Problem Clearly:

- Carefully read the problem and break it down.
- Are you asked to find a subarray with certain properties (e.g., smallest, largest sum, divisible sum)?
- Are you asked to maximize, minimize, or check for the existence of a condition?
- Does the problem allow for negative numbers or only positive ones?

Understanding these questions is the first step towards identifying which algorithm or technique might work best for solving the problem.

---

## 2. Analyze the Subarray Nature:

Subarrays are contiguous parts of an array, and different categories of subarray-related problems exist. 
- *Key Point*: Each category has specific patterns and hints towards a particular type of solution, so recognizing the subarray nature in the problem is crucial.

---

## 3. Look for Common Patterns:

### 1) Sliding Window or Two-Pointer Technique:

- *When to Use*:
  - Finding a subarray with a fixed sum or length.
  - Finding a subarray with conditions that can be checked as you move from one end of the array to another.
  
- *Why It Works*: This technique is efficient because it processes the array in linear time, expanding and contracting the window as needed.

- *Common Problem Types*:
  - Finding the smallest subarray with a sum greater than X.
  - Longest subarray with distinct elements or fixed-length subarrays.

- *Example*:
  - If you’re asked to find the longest subarray with sum ≤ k, sliding window is often the best approach.

---

### 2) Kadane’s Algorithm (Dynamic Programming):

- *When to Use*:
  - Finding the maximum subarray sum.

- *Why It Works*:
  - This algorithm efficiently tracks the maximum subarray sum ending at each index.
  - It's optimal as it builds solutions to subproblems (maximum sums ending at earlier indices) and extends them to solve larger problems.

- *Common Problem Types*:
  - Finding the maximum subarray sum, especially when there are no constraints on subarray length or when negative values are allowed.

- *Example*:
  - Given an array, find the maximum sum of any subarray.

---

### 3) Prefix Sum & HashMap:

- *When to Use*:
  - Modulo arithmetic (e.g., sum divisible by a number).
  - Checking sums over subarrays (especially when the subarray can be of any size).

- *Why It Works*:
  - The prefix sum allows us to break down a subarray sum into differences between two prefix sums.
  - HashMaps are used for fast lookups of previously seen sums, especially useful for problems with conditions like "sum divisible by k."

- *Common Problem Types*:
  - Finding subarrays that sum to k, or removing a subarray to make a sum divisible by a given value.

- *Example*:
  - Find the smallest subarray whose sum is divisible by a number p.

---

## 4. Practice Questions

### Easy Problems:

1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
2. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)
3. [Count Elements with Maximum Frequency](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
4. [Divide Array into Arrays with Max Difference](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
5. [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
6. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
7. [Minimum Common Value](https://leetcode.com/problems/minimum-common-value/)

---

### Two-Pointer Problems:

1. [3Sum](https://leetcode.com/problems/3sum/)
2. [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
3. [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
4. [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
5. [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)

---

### Prefix Sum Problems:

1. [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
2. [Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)
3. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays)
4. [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
5. [K-radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/)

---

## 5. Let's Solve Some Problems:

### Leetcode Problems:

1. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
2. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)
4. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### OA Problem:

1. LinkedIn - SDE Intern:
   - *Question*: Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions so the final string contains no adjacent equal characters.
   
   Example:  
   Input: ['add', 'boook', 'break']  
   Output: [1, 1, 0]

---

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0004-median-of-two-sorted-arrays) |
| [0011-container-with-most-water](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0018-4sum) |
| [0031-next-permutation](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0031-next-permutation) |
| [0033-search-in-rotated-sorted-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0033-search-in-rotated-sorted-array) |
| [0039-combination-sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0040-combination-sum-ii) |
| [0041-first-missing-positive](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0041-first-missing-positive) |
| [0045-jump-game-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0045-jump-game-ii) |
| [0088-merge-sorted-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0088-merge-sorted-array) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0134-gas-station](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0134-gas-station) |
| [0152-maximum-product-subarray](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0152-maximum-product-subarray) |
| [0179-largest-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0179-largest-number) |
| [0215-kth-largest-element-in-an-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0215-kth-largest-element-in-an-array) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
| [0455-assign-cookies](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0455-assign-cookies) |
| [0787-sliding-puzzle](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0787-sliding-puzzle) |
| [0875-longest-mountain-in-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0875-longest-mountain-in-array) |
| [0890-lemonade-change](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0890-lemonade-change) |
| [1044-find-common-characters](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1044-find-common-characters) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [1755-defuse-the-bomb](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1755-defuse-the-bomb) |
| [1813-maximum-erasure-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1813-maximum-erasure-value) |
| [1886-minimum-limit-of-balls-in-a-bag](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1886-minimum-limit-of-balls-in-a-bag) |
| [2164-two-best-non-overlapping-events](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2164-two-best-non-overlapping-events) |
| [2179-most-beautiful-item-for-each-query](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2179-most-beautiful-item-for-each-query) |
| [2211-k-radius-subarray-averages](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2211-k-radius-subarray-averages) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2343-count-unguarded-cells-in-the-grid) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2634-minimum-common-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2634-minimum-common-value) |
| [2640-maximum-number-of-integers-to-choose-from-a-range-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2640-maximum-number-of-integers-to-choose-from-a-range-i) |
| [2699-count-the-number-of-fair-pairs](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2699-count-the-number-of-fair-pairs) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [2756-buy-two-chocolates](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3241-divide-array-into-arrays-with-max-difference) |
| [3242-count-elements-with-maximum-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3242-count-elements-with-maximum-frequency) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0018-4sum) |
| [0031-next-permutation](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0031-next-permutation) |
| [0088-merge-sorted-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0088-merge-sorted-array) |
| [0151-reverse-words-in-a-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0151-reverse-words-in-a-string) |
| [0455-assign-cookies](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0455-assign-cookies) |
| [0875-longest-mountain-in-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0875-longest-mountain-in-array) |
| [0908-middle-of-the-linked-list](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0908-middle-of-the-linked-list) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [2414-move-pieces-to-obtain-a-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2414-move-pieces-to-obtain-a-string) |
| [2634-minimum-common-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2634-minimum-common-value) |
| [2699-count-the-number-of-fair-pairs](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2699-count-the-number-of-fair-pairs) |
| [3018-make-string-a-subsequence-using-cyclic-increments](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3018-make-string-a-subsequence-using-cyclic-increments) |
## Dynamic Programming
|  |
| ------- |
| [0022-generate-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0022-generate-parentheses) |
| [0032-longest-valid-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0032-longest-valid-parentheses) |
| [0045-jump-game-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0045-jump-game-ii) |
| [0062-unique-paths](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0062-unique-paths) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0152-maximum-product-subarray](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0152-maximum-product-subarray) |
| [0279-perfect-squares](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0279-perfect-squares) |
| [0875-longest-mountain-in-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0875-longest-mountain-in-array) |
| [2164-two-best-non-overlapping-events](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2164-two-best-non-overlapping-events) |
## Enumeration
|  |
| ------- |
| [0875-longest-mountain-in-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0875-longest-mountain-in-array) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0011-container-with-most-water) |
| [0045-jump-game-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0045-jump-game-ii) |
| [0134-gas-station](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0134-gas-station) |
| [0179-largest-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0179-largest-number) |
| [0455-assign-cookies](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0455-assign-cookies) |
| [0890-lemonade-change](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0890-lemonade-change) |
| [2032-largest-odd-number-in-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2032-largest-odd-number-in-string) |
| [2640-maximum-number-of-integers-to-choose-from-a-range-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2640-maximum-number-of-integers-to-choose-from-a-range-i) |
| [2756-buy-two-chocolates](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3241-divide-array-into-arrays-with-max-difference) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0016-3sum-closest) |
| [0018-4sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0018-4sum) |
| [0088-merge-sorted-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0088-merge-sorted-array) |
| [0179-largest-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0179-largest-number) |
| [0215-kth-largest-element-in-an-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0215-kth-largest-element-in-an-array) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
| [0455-assign-cookies](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0455-assign-cookies) |
| [2164-two-best-non-overlapping-events](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2164-two-best-non-overlapping-events) |
| [2179-most-beautiful-item-for-each-query](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2179-most-beautiful-item-for-each-query) |
| [2640-maximum-number-of-integers-to-choose-from-a-range-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2640-maximum-number-of-integers-to-choose-from-a-range-i) |
| [2699-count-the-number-of-fair-pairs](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2699-count-the-number-of-fair-pairs) |
| [2756-buy-two-chocolates](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3241-divide-array-into-arrays-with-max-difference) |
## Hash Table
|  |
| ------- |
| [0017-letter-combinations-of-a-phone-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0041-first-missing-positive](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0041-first-missing-positive) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
| [1044-find-common-characters](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1044-find-common-characters) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [1813-maximum-erasure-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1813-maximum-erasure-value) |
| [2634-minimum-common-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2634-minimum-common-value) |
| [2640-maximum-number-of-integers-to-choose-from-a-range-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2640-maximum-number-of-integers-to-choose-from-a-range-i) |
| [3242-count-elements-with-maximum-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3242-count-elements-with-maximum-frequency) |
## Counting
|  |
| ------- |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
| [3242-count-elements-with-maximum-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3242-count-elements-with-maximum-frequency) |
## String
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0014-longest-common-prefix) |
| [0017-letter-combinations-of-a-phone-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0022-generate-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0022-generate-parentheses) |
| [0032-longest-valid-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0032-longest-valid-parentheses) |
| [0058-length-of-last-word](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0058-length-of-last-word) |
| [0067-add-binary](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0067-add-binary) |
| [0151-reverse-words-in-a-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0151-reverse-words-in-a-string) |
| [0179-largest-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0179-largest-number) |
| [0273-integer-to-english-words](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0273-integer-to-english-words) |
| [0282-expression-add-operators](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0282-expression-add-operators) |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
| [1044-find-common-characters](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1044-find-common-characters) |
| [1078-remove-outermost-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1078-remove-outermost-parentheses) |
| [2032-largest-odd-number-in-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2032-largest-odd-number-in-string) |
| [2414-move-pieces-to-obtain-a-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2414-move-pieces-to-obtain-a-string) |
| [3018-make-string-a-subsequence-using-cyclic-increments](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3018-make-string-a-subsequence-using-cyclic-increments) |
## Binary Search
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0004-median-of-two-sorted-arrays) |
| [0033-search-in-rotated-sorted-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0033-search-in-rotated-sorted-array) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
| [1886-minimum-limit-of-balls-in-a-bag](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1886-minimum-limit-of-balls-in-a-bag) |
| [2164-two-best-non-overlapping-events](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2164-two-best-non-overlapping-events) |
| [2179-most-beautiful-item-for-each-query](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2179-most-beautiful-item-for-each-query) |
| [2634-minimum-common-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2634-minimum-common-value) |
| [2640-maximum-number-of-integers-to-choose-from-a-range-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2640-maximum-number-of-integers-to-choose-from-a-range-i) |
| [2699-count-the-number-of-fair-pairs](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2699-count-the-number-of-fair-pairs) |
## Sliding Window
|  |
| ------- |
| [1755-defuse-the-bomb](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1755-defuse-the-bomb) |
| [1813-maximum-erasure-value](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1813-maximum-erasure-value) |
| [2211-k-radius-subarray-averages](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2211-k-radius-subarray-averages) |
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0002-add-two-numbers) |
| [0029-divide-two-integers](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0029-divide-two-integers) |
| [0062-unique-paths](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0062-unique-paths) |
| [0067-add-binary](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0067-add-binary) |
| [0263-ugly-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0263-ugly-number) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
| [0273-integer-to-english-words](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0273-integer-to-english-words) |
| [0279-perfect-squares](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0279-perfect-squares) |
| [0282-expression-add-operators](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0282-expression-add-operators) |
| [2032-largest-odd-number-in-string](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2032-largest-odd-number-in-string) |
## Bit Manipulation
|  |
| ------- |
| [0029-divide-two-integers](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0029-divide-two-integers) |
| [0067-add-binary](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0067-add-binary) |
| [0268-missing-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0268-missing-number) |
## Divide and Conquer
|  |
| ------- |
| [0004-median-of-two-sorted-arrays](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0004-median-of-two-sorted-arrays) |
| [0215-kth-largest-element-in-an-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0215-kth-largest-element-in-an-array) |
## Linked List
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0002-add-two-numbers) |
| [0237-delete-node-in-a-linked-list](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0237-delete-node-in-a-linked-list) |
| [0908-middle-of-the-linked-list](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0908-middle-of-the-linked-list) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0002-add-two-numbers) |
| [0273-integer-to-english-words](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0273-integer-to-english-words) |
## Stack
|  |
| ------- |
| [0032-longest-valid-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0032-longest-valid-parentheses) |
| [1078-remove-outermost-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1078-remove-outermost-parentheses) |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0014-longest-common-prefix) |
## Backtracking
|  |
| ------- |
| [0017-letter-combinations-of-a-phone-number](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0022-generate-parentheses](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0022-generate-parentheses) |
| [0039-combination-sum](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0039-combination-sum) |
| [0040-combination-sum-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0040-combination-sum-ii) |
| [0282-expression-add-operators](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0282-expression-add-operators) |
## Breadth-First Search
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0104-maximum-depth-of-binary-tree) |
| [0279-perfect-squares](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0279-perfect-squares) |
| [0787-sliding-puzzle](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0787-sliding-puzzle) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
## Simulation
|  |
| ------- |
| [0067-add-binary](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0067-add-binary) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2343-count-unguarded-cells-in-the-grid) |
## Combinatorics
|  |
| ------- |
| [0062-unique-paths](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0062-unique-paths) |
## Heap (Priority Queue)
|  |
| ------- |
| [0215-kth-largest-element-in-an-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0215-kth-largest-element-in-an-array) |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
| [2164-two-best-non-overlapping-events](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2164-two-best-non-overlapping-events) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
## Quickselect
|  |
| ------- |
| [0215-kth-largest-element-in-an-array](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0215-kth-largest-element-in-an-array) |
## Monotonic Stack
|  |
| ------- |
| [1679-shortest-subarray-to-be-removed-to-make-array-sorted](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1679-shortest-subarray-to-be-removed-to-make-array-sorted) |
## Bucket Sort
|  |
| ------- |
| [0451-sort-characters-by-frequency](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0451-sort-characters-by-frequency) |
## Tree
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0104-maximum-depth-of-binary-tree) |
## Depth-First Search
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0104-maximum-depth-of-binary-tree) |
## Binary Tree
|  |
| ------- |
| [0104-maximum-depth-of-binary-tree](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0104-maximum-depth-of-binary-tree) |
## Matrix
|  |
| ------- |
| [0787-sliding-puzzle](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/0787-sliding-puzzle) |
| [1147-flip-columns-for-maximum-number-of-equal-rows](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/1147-flip-columns-for-maximum-number-of-equal-rows) |
| [2343-count-unguarded-cells-in-the-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2343-count-unguarded-cells-in-the-grid) |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
## Graph
|  |
| ------- |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
| [3189-find-champion-ii](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3189-find-champion-ii) |
| [3517-shortest-distance-after-road-addition-queries-i](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/3517-shortest-distance-after-road-addition-queries-i) |
## Shortest Path
|  |
| ------- |
| [2375-minimum-obstacle-removal-to-reach-corner](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2375-minimum-obstacle-removal-to-reach-corner) |
| [2711-minimum-time-to-visit-a-cell-in-a-grid](https://github.com/Georgiandurgesh/DSA-Task-Durgesh-Bahadur-2215000645-/tree/master/2711-minimum-time-to-visit-a-cell-in-a-grid) |
<!---LeetCode Topics End-->