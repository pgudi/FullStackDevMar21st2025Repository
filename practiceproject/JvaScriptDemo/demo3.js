let student={
    "firstname":"Santosh",
    "Course":"Resarch and Science",
    "age":22
}
// it doesn't work for objects
let {x,y,z} = student
console.log(x,y,z);

//It works fine
var {firstname,Course,age} = student
console.log(firstname,Course,age);

var {firstname, cityname="Dallas"} = student
console.log(firstname,cityname);

