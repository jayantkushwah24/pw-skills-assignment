// Q4. Create a JavaScript program that takes a regex pattern and a string as input. Write a function that not
// only checks if there is a match but also extracts specific parts of the matched text using groups. Test the
// function with patterns that include groups to capture different parts of a date (e.g., day, month, and year)
// from a given string.

function extractDateParts(regexPattern, inputString) {
    const regex = new RegExp(regexPattern);
    const match = regex.exec(inputString);
  
    if (!match) {
      console.log("No match found.");
      return;
    }
  
    // Extract specific parts of the matched text using groups
    const day = match[1];
    const month = match[2];
    const year = match[3];
  
    console.log("Match found:");
    console.log("Day:", day);
    console.log("Month:", month);
    console.log("Year:", year);
  }
  
  // Test the function with a sample date string
  const dateString = "Today is 13-03-2024.";
  const datePattern = /(\d{2})-(\d{2})-(\d{4})/; // Pattern to capture day, month, and year
  extractDateParts(datePattern, dateString);
  