// Explain the usage of ternary operator with syntax and write a program to check whether the number is even
// or odd using the ternary operator.


// The ternary operator is a concise way to write an if-else statement in a single
// line. Its syntax is:-
// condition ? expression_if_true : expression_if_false;
// Now, let's write a program in a language like JavaScript to check whether a 
// number is even or odd using the ternary operator:

let number = 11;
let check = number%2 == 0 ? true : false;
if (check) {
    console.log(`Number is even`);
}else{
    console.log(`Number is odd`);
}

// In this example, the condition (number % 2 === 0) checks if the number is even. 
// If it's true, the expression returns "Even," otherwise, it returns "Odd." The 
// result is stored in the variable result, which is then returned by the checkEvenOdd function.