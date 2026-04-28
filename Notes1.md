# Data structurte & Algorithms 
   |           |           |
   |           |           |
Information    |           |
   |           |           |
   |       -----------     |-------->Set of Instruction
   |       |Array    |
   |------>|Link List|
   |       |Stack    |
   |       |Queue    |
  Store    |Tree     |
           |Graph    |
           -----------


# Time Complexity Notes

1. Definition:
Time complexity measures how the running time of an algorithm grows with input size (n).

2. Big-O Notation:
Used to represent worst-case time complexity.

3. Common Complexities:
O(1)  → Constant time
O(n)  → Linear time
O(n²) → Quadratic time
O(log n) → Logarithmic time
O(n log n) → Efficient sorting

**Mathematical Equation**
1) Constant Size:- input size does not matter 
2) Liner Function:- y = 2x + 5 ~ x ---> liner growth 
3) Quedratic FUnction:- y = 2n2 + 3x - 5 ~ x2
4) Cudic Function:- y = 3x3 - 2n2 + 5 ~ x3
5) Logarithmc:- y = log x + 2 ~ logx
6) Expontial Function:- y = 3x + 3 ~ 3x

4. Rules:
- Ignore constants → O(2n) = O(n)
- Take highest power → O(n² + n) = O(n²)
- Nested loops multiply → O(n * n) = O(n²)

5. Key Insight:
Time complexity does not measure exact time, but growth rate.

6. Importance:
Helps in writing efficient and scalable programs.

7. Example:
for loop → O(n)
nested loop → O(n²)
binary search → O(log n)

*Example*
10 line of Code --->execute in 1 second  <--->Negligible
90 line of Code --->execute in 90 second

**comparison**
1 < log log n < logn < n < n2 < n3 < n4 ...... < 2n

n = size of input, if n is very very larger
 
**Types of Analysis**
1) Minimum
2) Maxmum
3) Average 

*Case*
1) Best case:- Ω --> (Omega notation)
2) Average case:- θ --> (Theta notation)
3) Warst case:- O --> (Big O-Notation)


