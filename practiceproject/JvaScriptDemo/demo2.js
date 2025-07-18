let fruit="Watermelon"

let[a,b,c,d,e]=fruit

console.log(a,b,c,d,e);
console.log("---------------------");
let [x,,,,,,,,,y]=fruit
console.log(x,y);
console.log("---------------------");
let [p,q,...rest]=fruit
console.log(p,q);
console.log(rest);
