// Q2. Create a JavaScript program that demonstrates the basic usage of regular expressions. Write a function
// that takes a regex pattern and a string as input and returns true if there is a match, and false otherwise. Test
// the function with various patterns and strings.


function checkMatch(regexPattern, inputString) {
    // Create a regular expression object with the provided pattern
    const regex = new RegExp(regexPattern);
  
    // Test if the inputString matches the regex pattern
    return regex.test(inputString);
  }
  
  // Test the function with various patterns and strings
  const pattern1 = /hello/;
  const string1 = "Hello, world!";
  console.log(checkMatch(pattern1, string1)); // Output: false
  
  const pattern2 = /\d{3}-\d{2}-\d{4}/; // Match a social security number pattern
  const string2 = "123-45-6789";
  console.log(checkMatch(pattern2, string2)); // Output: true
  
  const pattern3 = /^[A-Za-z]+$/; // Match only letters (uppercase or lowercase) from the beginning to the end
  const string3 = "AbCdEfG";
  console.log(checkMatch(pattern3, string3)); // Output: true
  
  const pattern4 = /\b\d+\b/; // Match whole words consisting of digits
  const string4 = "The price is $45.";
  console.log(checkMatch(pattern4, string4)); // Output: false
  