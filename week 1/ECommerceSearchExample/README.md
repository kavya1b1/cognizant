# E-commerce Search Function

## Description

This project demonstrates two searching algorithms used in an e-commerce platform:

- Linear Search
- Binary Search

## Files

```
src/
├── Product.java
├── LinearSearch.java
├── BinarySearch.java
└── SearchTest.java
```

## Time Complexity

### Linear Search

- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

### Binary Search

- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

## Comparison

| Algorithm | Best | Average | Worst |
|-----------|------|---------|-------|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Conclusion

Binary Search is more efficient for large datasets because it repeatedly divides the search space in half. However, it requires the data to be sorted before searching.