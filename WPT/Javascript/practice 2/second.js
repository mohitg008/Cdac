/* let a = 5
let b = "2" */


/*console.log("a+b =", a+b);
console.log("a+b =", a-b);
console.log("addtion of", "a =",a,  "b =",b,"a+b =", a+b);

console.log("a**b =", a**b);*/

/*
//a +=4;
console.log(a);

//a = a*4;
console. log(a);

a **= 5;
console.log(a);

console.log(a == b);
console.log(a != b);
console.log(a === b);
console.log(a !== b);

console.log(a && b);
console.log(a<b || b ==a);
console.log(!(a<b));  */


// conditional statements

/* let age = 16;
if(age > 18){
    console.log("you can vote");
}

if(age < 18){
    console.log("you can not vote");
} */

/* let mode = "dark";
let color;

if(mode == "dark"){
    color = "black";
}

if(mode == "light"){
    color = "white";
}

console.log(color);
 */

/* let age = 16;

if(age >= 18){
    console.log("can vote");
}
else{
    console.log("cannot vote");
} */

/* let num = 20;

if(num%2 == 0 ){
    console.log(num,"is even");
}
else{
    console.log(num,"is odd");
}
 */
/* 
let mode = "blue";
let color;

if(mode == "dark"){
    color = "black";
}
else if(mode == "blue"){
    color = "blue";
}
else {
    color = "white";
}

console.log(color); */
/* 
let age =25;

let result = age >= 18 ? "adult" : "not adult";
console.log(result); */

/* let n =prompt("hello!");
console.log(n); */

/* let num = prompt("Eneter a number");

if(num % 5 ==0){
    console.log(num,"is multiple of 5");
}
else {
    console.log(num,"is NOT multiple of 5");

} */

let m = prompt("Enter marks of student between (0-100)");
let grade;
if(m <= 100 && m>=80){
    grade = "A";
}
else if(m <=89 && m>= 70){
    grade = "B"
}
else if(m <= 69 && m >=60){
    grade = "C";
}
else if(m <=59 && m>=50){
    grade ="D";
}
else if(m <= 49 || m  == 0){
    grade = "F";
}

console.log("marks of student is ",m, "and grade is ", grade);