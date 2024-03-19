// 4. Assign9ent: Building a Student Manage9ent System
// Description:
// You are taske" with buil"ing a stu"ent management s>stem using JavaScript. The s>stem shoul" allow >ou to
// perform various operations on a list of stu"ents, inclu"ing a""ing, up"ating, "eleting, an" "ispla>ing stu"ent
// information.
// Requirements:
// $ere is an initial arra> of stu"ents. Each stu"ent is represente" as an object with the following properties: i",
// firstName, lastName, age, an" gra"e.
// Implement the following functions using pure JavaScript (without any external libraries or frameworks):
// a. Add a Student: Create a function to add a new student to the array.
// b. Update Student Information: Create a function to update a student's information based on their id.
// c. Delete a Student: Create a function to delete a student based on their id.
// d. List All Students: Create a function to display a list of all students.
// e. Find Students by Grade: Create a function to find all students who have a specific grade.
// f. Calculate Average Age: Create a function to calculate the average age of all students using array method.


const students = [
    { id: 1, firstName: "Joe", lastName: "Don", age: 20, grade: "A" },
    { id: 2, firstName: "Jane", lastName: "Smith", age: 22, grade: "B" },
    { id: 3, firstName: "Bob", lastName: "Johnson", age: 19, grade: "A" }
]

students.push({ id: 4, firstName: "Jayant", lastName: "Kushwah", age: 24, grade: "A" })

function updateStudentInformation(id, newInfo) {
    let index = students.findIndex(student => student.id === id)

    if (index !== -1) {
        students[index] = { ...students[index], ...newInfo };
    } else {
        console.log(`ID not found`);
    }
}
updateStudentInformation( 3 , {firstName : "Kirti" , lastName : "Kushwah" , age : 21} )

function deleteStudentInformation(id) {
    let index = students.findIndex(student => student.id === id)

    if (index !== -1) {
        students.splice(index, 1)
    } else {
        console.log(`ID not found`);
    }
}
deleteStudentInformation(1)

function listAllStudents() {
    students.forEach(student => {
        console.log(`ID: ${student.id}, Name: ${student.firstName}  ${student.lastName}, Age: ${student.age}, Grade: ${student.grade}`);
    });
}
listAllStudents()

function findStudentsByGrade(grade) {
    return students.filter(student => student.grade == grade)

}
console.log(findStudentsByGrade("A"))

function averageAge(sum){
    
    students.forEach(element => {
        sum += element.age ; 
    });
    return sum;
}
console.log(averageAge(0));
