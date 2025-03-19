let mlaGreet : String = "Komedi King";

console.log(mlaGreet);

let age : number = 23;

let fname : String = "Kunal";

let message : String = "Java is Fun"+`  TS response name is ${fname}. the age is ${age}`;

console.log(message);

class Employee1{
    name : String;
    age : number;
}

interface Employee2{
    name : String;
    age : number;
}

//SPA

let emp1 : Employee1[]=[
                        {name:"Rohit",age:47},
                        {name:"Virat", age:18},
                        {name:"Dhoni", age:7}];

let emp2 : Employee2[]=[
                        {name:"Rohit",age:47},
                        {name:"Virat", age:18},
                        {name:"Dhoni", age:7}];

console.log(emp1[1].name);
console.log(emp2[2].name+' '+emp2[0].age);

let compid : String | number = 9600;
let colgid : String | number = 'JU69';

console.log(compid);
console.log(colgid);


let mlaTuple : [string, number, boolean, string];

mlaTuple=['Kohli',18, true, "Playing"];

console.log(mlaTuple);
