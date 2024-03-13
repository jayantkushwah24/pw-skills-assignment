// Q1. Write a JavaScript function called outerFunction that takes a parameter and returns an inner function.
// The inner function should access both the parameter of outerFunction and a variable declared within
// outerFunction. Demonstrate how lexical scoping allows the inner function to maintain access to these
// variables even after outerFunction has finished executing.


function outerFunction(str){
    let a = 1;
    let b = 2;

      // Return the inner function
    return function innerFunction(){
        console.log(`  ${a + b} `); //Accessing the variable declared within outerFunction
        console.log(`  ${str} `); //Accessing the parameter of outerFunction
 
    }
}
let outerFunc = outerFunction("namaste")
outerFunc()  // Call the inner function returned by outerFunction
