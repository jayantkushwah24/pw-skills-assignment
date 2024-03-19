// 3. Object Extensibility and Sealing
// a) Use the Object.preventEatensions metho" to prevent an> further a""itions of properties to the stu"ent object.
// b) Use the Object.isEatensible metho" to check if the stu"ent object is eatensible. Store the result in a variable
// calle" eatensibleStatus.
// c) Create a new object calle" teacher with a 'subject' propert> set to 'Math'.
// ") Use the Object.seal metho" to seal the teacher object, preventing an> a""itions or "eletions of properties.
// e) Use the Object.isSeale" metho" to check if the teacher object is seale". Store the result in a variable calle"
// seale"Status.
// f) Print the eatensibleStatus an" seale"Status to the console.


Student = {
    name : "Jayant Kushwah"
}
Object.preventExtensions(Student);
let extensibleStatus = Object.isExtensible(Student)


let teacher = {
    subject : "Math"
}
Object.seal(teacher)
let sealedStatus = Object.isSealed(teacher)

console.log(extensibleStatus , sealedStatus);    //false , true