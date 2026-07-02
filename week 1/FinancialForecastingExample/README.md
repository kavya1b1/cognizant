# Financial Forecasting Example

## Description

This project demonstrates financial forecasting using a recursive algorithm in Java.

The future value is calculated based on:

- Current Value
- Annual Growth Rate
- Number of Years

---

## Project Structure

```text
src/
├── FinancialForecast.java
└── ForecastTest.java
```

---

## Formula Used

Future Value = Current Value × (1 + Growth Rate)^Years

The recursive algorithm repeatedly applies the annual growth until the specified number of years is reached.

---

## Sample Output

```text
Current Value : ₹10000.0
Growth Rate   : 10.0%
Years         : 5
Future Value  : ₹16105.10
```

---

## Time Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

where **n** is the number of years.

---

## Optimization

The recursive solution can be optimized by:

- Using **Memoization** to store previously computed results.
- Using an **Iterative Approach** to reduce recursion overhead.
- Using the direct mathematical formula:

```
Future Value = Current Value × (1 + Growth Rate)^Years
```

This computes the result in constant time when using efficient exponentiation.

---

## Design Concept

This exercise demonstrates the use of **Recursion** for solving forecasting problems.