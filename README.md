# Uncommon Scala Error: Inconsistent Error Handling with Try and Option

This repository demonstrates an uncommon error in Scala related to inconsistent error handling when using `Try` and `Option`. The `bug.scala` file showcases the issue, while `bugSolution.scala` provides a more robust solution.

**Problem:** The original code uses `Try` to handle exceptions, but the error handling for negative numbers and non-numeric input isn't entirely consistent.  A more elegant and informative approach is possible.

**Solution:** The improved code provides more context in the error messages and handles both types of errors more gracefully.