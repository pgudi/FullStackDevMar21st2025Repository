let fruits = ["Mango","Orange","Apple","Banana","Kiwi"]

let [x,y]=fruits

console.log(x);
console.log(y);
console.log("---------------------------------------");

let[a,,,,b] = fruits
console.log(a);
console.log(b);
console.log("---------------------------------------");

let [p,q,...rest] = fruits
console.log(p);
console.log(q);
console.log(rest);
