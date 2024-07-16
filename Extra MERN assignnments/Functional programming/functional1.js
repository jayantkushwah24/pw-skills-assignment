// 1. Write an ES6 function that takes an array of numbers and returns an array with each number
// incremented by 3 using the map method.
const numbers = [1, 2, 3, 4, 5];
const incrementNumbers = (num) => num.map((n) => n + 3);
// console.log(incrementNumbers(numbers));
// Output: [4, 5, 6, 7, 8]

// 2. Write an ES6 function that takes an array of strings and returns an array with all the strings
// capitalised using the map method.
const myArray = ["apple", "banana", "cherry"];
const capitalizeArray = (str) => str.map((s) => s.toUpperCase());
// console.log(capitalizeArray(myArray));
// Output: ["APPLE", "BANANA", "CHERRY"]

// 3. Write an ES6 function that takes an array of objects representing people and returns an array of
// their ages using the map method.
const people = [
  { name: "Ankit", age: 25 },
  { name: "Vinit", age: 24 },
  { name: "Shashi", age: 29 },
];
const ages = getAges(people);
console.log(ages); // Output: [25, 24, 29]
