// 1. Write a function ‘delayedGreeting’ that consoles a greeting message after a delay of 2 seconds
// using setTimeout.
const delayedGreeting = () =>
  setTimeout(() => console.log("Hello, welcome to my portfolio!"), 2 * 1000);
// delayedGreeting();
// Hello, welcome to my portfolio!

// 2. Write a function ‘delayedAddition’ that takes in two numbers and consoles their sum after a
// delay of 4 seconds using setTimeout.
const delayedAddition = (a, b) =>
  setTimeout(() => {
    console.log(a + b);
  }, 4000);
// delayedAddition(2, 3);
// 5

// 3. Write a function ‘delayAlert’ that takes in a message ‘Hello, world!’ and a delay time in
// milliseconds, and displays the message in an alert box after the specified delay time using setTimeout.
const delayedAlert = (message, timeout) =>
  setTimeout(() => {
    console.log(message);
  }, timeout);
// delayedAlert('Hello, world!', 2000);
// Should display an alert box with the message, Hello, world!

// 4. Write a function delayedLoop that takes a number 3 and consoles a message 'Hello' three times
// after a delay of 1 second each, using a for-loop and setTimeout
const delayedLoop = (n) => {
  for (let i = 1; i <= n; i++) {
    setTimeout(() => {
      console.log("Hello");
    }, i * 1000);
  }
};
// delayedLoop(3);
// should print Hello three times after 1 second each
// Output:
// Hello -- after 1 second
// Hello -- after another 1 second
// Hello -- after another 1 second

// 5. Make a fake fetch call that takes a message and a boolean value to get data and console the
// message received from the server. A fake fetch has been provided.
const fakeFetch = (msg, shouldSucceed) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (shouldSucceed) {
        resolve(`message from server: ${msg}`);
      }
      reject(`error from server: ${msg}`);
    }, 3000);
  });
};
// fakeFetch("Hi", true)
//   .then((res) => console.log(res))
//   .catch((rej) => console.log(rej));
// Hi -- after 3 seconds

// 6. EXAMPLE QUESTION: (Solution has been provided for this question for your understanding)
// Use this URL - https://example.com/api/itemlist to make a fake fetch call and handle errors if
// any. Show a proper message to the user on the DOM, as per the status and message received
// from the server. A fakeFetch has been provided. Use HTML, CSS & JS template in REPL or
// Vanilla template in CodeSandbox for this question.
const fakeFetch1 = (url) => {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (url === "https://example.com/api/itemlist") {
        reject({
          status: 404,
          message: "Items list not found.",
        });
      } else {
        resolve({
          status: 200,
          data: {
            message: "Success",
            data: [
              { itemName: "Bread", price: 30 },
              { itemName: "Water Bottle", price: 50 },
              { itemName: "Dairy Milk", price: 20 },
            ],
          },
        });
      }
    }, 2000);
  });
};
// Your Code here (Solution Given)
// const displayOutput = document.querySelector("#output");
fakeFetch1("https://example.com/api/itemlist")
  .then((response) => console.log(response))
  .catch((error) => {
    if (error.status === 404) {
      displayOutput.textContent =
        "The data you are looking for, does not exist.";
    }
  });
// Output on the DOM should be:
// The data you are looking for, does not exist.
// Explanation:
// In the above code solution, we are making a fakeFetch function call with the
// URL https://example.com/api/itemlist.
// If the Promise is resolved, the **then**method is executed with the successful response as the
// argument, and the console.log statement outputs the response object to the console.
// If the Promise is rejected, the **catch**method is executed with the error object as the
// argument, and the ifstatement checks if the error status is equal to 404. If the error status is
// 404, the message "The data you are looking for, does not exist." is displayed in the HTML
// element with ID "output".
