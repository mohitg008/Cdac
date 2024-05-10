/* let div =document.querySelector("div");
console.log(div);

let id = div.getAttribute("id");
console.log(id);

let name = div.getAttribute("name");
console.log(name);
 */
/*  let para  = document.querySelector("p");
console.log(para);
console.log(para.getAttribute("class"));
  */

/* let para = document.querySelector("p");

console.log(para.setAttribute("class","newClass")); */

/* let div = document.querySelector("div");

div.style.backgroundColor = "purple";
div.style.visibility="hidden";

div.style.fontSize = "26px";
div.innerText="Hello!"; */


/* 
let newBtn = document.createElement("button");
newBtn.innerText = "click me";
console.log(newBtn);

 let div = document.querySelector("div");
div.append(newBtn);
div.prepend(newBtn);
div.before(newBtn);
div.after(newBtn); 
let div = document.querySelector("p");
div.after(newBtn);  
 */


/* let newHeading = document.createElement("h1");
newHeading.innerHTML = "<i>Hi, I am New! </i>";

document.querySelector("body").prepend(newHeading);

let para = document.querySelector("p")
para.remove();

newHeading.remove(); */


let para = document.querySelector("p");

para.classList.add("newClass");

let newBtn = document.createElement("button");
newBtn.innerText="Click me";
newBtn.style.color="white";
newBtn.style.backgroundColor="red";

document.querySelector("body").prepend(newBtn);