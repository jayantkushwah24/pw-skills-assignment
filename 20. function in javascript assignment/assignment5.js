// JavaScript function to calculate the factorial of a non-negative integer using recursion
function factorial(n) {
    if (n === 0 || n === 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
  
  // Test the function with different inputs
  console.log(`Factorial of 0: ${factorial(0)}`); // Output: 1
  console.log(`Factorial of 1: ${factorial(1)}`); // Output: 1
  console.log(`Factorial of 5: ${factorial(5)}`); // Output: 120
  console.log(`Factorial of 8: ${factorial(8)}`); // Output: 40320
  