let fruits = ["Orange","Mango","apple","Banana","Kiwi"]

fruits.map((fruit) =>{
    console.log(fruit)
})

console.log("-------------------------");
let radius =[3.1,2.2,5.3,6.5,8.4,4.5]

let area=radius.map((r)=>{
    return (3.14 * r * r)
})

console.log(area);

console.log("-------------------------");
let radius1 = [2,4,6,8]
let diameter = radius1.map(r =>
    console.log(2 * r)
)

console.log("-------------------------");
let radius2 = [2,3,4,5,6]
let diameter1 = radius2.map( r =>{
    return (2 * 3.14 * r);
    
})
console.log(diameter1);

console.log("-------------------------");

let radius3 = [2,3,5,7]
let circumference = radius3.map( r => (2 * 3.14 * r));

console.log(circumference);