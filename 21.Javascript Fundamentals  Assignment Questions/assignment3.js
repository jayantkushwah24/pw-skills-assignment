// Q3. Write a JavaScript program that demonstrates the use of character classes in regular expressions.
// Create a function that searches for specific character classes in a given string and returns the matches. Test
// the function with patterns for digits, uppercase letters, lowercase letters, and special characters.

function searchCharacterClass(inputString) {
    // Define regular expressions for various character classes
    const digitPattern = /\d/g; // Matches any digit
    const uppercasePattern = /[A-Z]/g; // Matches any uppercase letter
    const lowercasePattern = /[a-z]/g; // Matches any lowercase letter
    const specialCharPattern = /[^A-Za-z0-9]/g; // Matches any special character (non-alphanumeric)
  
    // Execute regular expressions on the input string and store matches
    const digits = inputString.match(digitPattern) || [];
    const uppercaseLetters = inputString.match(uppercasePattern) || [];
    const lowercaseLetters = inputString.match(lowercasePattern) || [];
    const specialCharacters = inputString.match(specialCharPattern) || [];
  
    // Return the matches for each character class
    return {
      digits,
      uppercaseLetters,
      lowercaseLetters,
      specialCharacters
    };
  }
  
  // Test the function with a sample string
  const sampleString = "Hello World! 123 $pecial";
  const matches = searchCharacterClass(sampleString);
  console.log("Digits:", matches.digits);
  console.log("Uppercase Letters:", matches.uppercaseLetters);
  console.log("Lowercase Letters:", matches.lowercaseLetters);
  console.log("Special Characters:", matches.specialCharacters);
  