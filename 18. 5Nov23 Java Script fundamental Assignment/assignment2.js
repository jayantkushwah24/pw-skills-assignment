// Describe the usage of the comma operator in JavaScript and provide an example.


// The comma operator in JavaScript allows you to combine multiple expressions into a single expression. It evaluates each of the expressions from left to right and returns the value of the rightmost expression. It's important to note that all the expressions are still evaluated, but only the value of the rightmost one is used.
// Here's the syntax:
// expression1, expression2, expression3, ..., expressionN
// And here's a simple example:
// Using the comma operator
var a = 5, b = 10, c = 15;
// The value of the entire expression is the value of the last expression (c)
var result = (a++, b++, c++);
console.log(result); // Output: 15
console.log(a);      // Output: 6
console.log(b);      // Output: 11
console.log(c);      // Output: 16
// In this example, the expressions a++, b++, and c++ are combined using the comma operator. The overall value of the expression is the value of the last expression (c++), which is 15. Additionally, you can see that the variables a, b, and c have been incremented due to the use of the postfix increment operator (++).




