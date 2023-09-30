x=5;
var x;
console.log(x);//5
x=7;
console.log(x);//7

// y=6;
// let y;
// console.log(y);// we get error,, hoisting.js:5 
  //Uncaught ReferenceError: Cannot access 'y' before initialization at hoisting.js:5:2
  let z=6;
  console.log(z);//6
  //declaration
  var a;
  console.log(a);//undefined global
  let b;
  console.log(b);//undefined local
//   const c;//must be initialized
//   console.log(c);
//declaration and initialization
var a=10;
console.log(a);//10
let m=20;
console.log(m);//20
const n=30;
console.log(n);//30
//re-initialization
var a=10;
a='hello';
console.log(a);//hello

let p=20;
p='world'
console.log(p);//world

// const u=30;//Uncaught TypeError: Assignment to constant variable.at hoisting.js:37:2
// u='hi'
// console.log(u);
//re-initialization and redeclaration

var a=10;
console.log(a);//10
var a='hello'
console.log(a);//hello

let v=20;
console.log(v);//20
// let v='world';
// console.log(v);//Uncaught SyntaxError: Identifier 'v' has already been declared (

const c=30;
console.log(c);//30
// const c=40;
// console.log(c);//Uncaught SyntaxError: Identifier 'v' has already been declared (

//Hoisting
console.log(a);//we get hello bcoz we already declared up
var a=10;

console.log(s);//undefined
var s=10;

var s;
console.log(s);//10

// console.log(q);//Uncaught ReferenceError: Cannot access 'q' before initialization
// let q=20;

// console.log(d);//Uncaught ReferenceError: Cannot access 'd' before initialization
// const d=30;

