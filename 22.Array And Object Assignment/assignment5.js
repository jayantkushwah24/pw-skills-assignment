// 5. You are given a JavaScript object representing a student's information. Your task is to use the 'for...in' loop
// to iterate over the properties of the object and perform various operations.
// a. Create a function displayStudentInfo that takes the student object as a parameter. Inside this function, use a
// 'for...in' loop to iterate over the properties of the student object and print each property and its corresponding
// value to the console. The output should look something like this:

const student = {
    name : "Alice",
    age : 22,
    major : "Computer Science",
    GPA : 3.8,
    isEnrolled : true
};

function displayStudentInfo(student) {
    for (const key in student) {
        console.log(`Property : ${key} , Value : ${student[key]}`);
    } 
}
displayStudentInfo(student)