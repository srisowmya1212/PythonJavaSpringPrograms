//implicit type-casting
//The process of converting one data type into another datatype is known as typecasting.@ types:1)implicit and2)explicit
//The process of converting one datatype into another datatype implicitly is known as implicit typecasting.
//the process of converting one datatype into another datatype by programmer is known as Explicit typecasting
//the explicit inbuilt   functions are number,string,boolean
console.log(5+5);//10
console.log(5+'5');//55 number will be converted into string,,concatenation
console.log(5+'a');//5a
console.log(5-5);//0
console.log(5-'5');//0 string will be converted into number,but here no concatenation
console.log(5-'a');//nan ,,we get this output when a string is not able to convert into number
console.log(typeof NaN);//number ,Nan is not a number ,but it is a number
console.log((NaN)? true:false);//false,in js nan,false,0,undefined are considered as false
//other than 0 ,negative and positive is considered as true injs
//typeof is a unary operator,bcoz it uses single operand.It tells the programmer,which type of datatype used by the programmer
console.log((0)?true:false);//false
console.log((undefined)?true:false);//false
console.log((null)?true:false);//false
console.log((10)?true:false);//true
console.log((-10)?true:false);//true

//explicit type-casting
console.log(5+Number('5'));//10
console.log(String(5)+5);//55
console.log(Boolean(19));//true
console.log(Boolean(0));//false
console.log(5+Boolean(10));//here boolean(10) considered as true which is 1 ,so 5+1=6
console.log('5'+Boolean(10));//here 5true bcoz string
console.log(5+Boolean(0));//5+0=5

console.log(Number.parseInt('56.4'));//56
console.log(Number.parseFloat('5.5'));//5.5
console.log(Number.isFinite(5n));//false
console.log(Number.isInteger(5.5));//false
console.log(Number.isFinite(5));//true
console.log(Number.parseFloat('fr'));//nan

//function-declaration statement
console.log(demo);//a function declaration statement can be hoisted...we get entire body
console.log(demo());//hello and undefined
function demo(){
    console.log('hello');
}
console.log(demo);//we get entire body of the function, bcoz a reference object is directly given
console.log(demo());//we get, hello and undefined.To avoid undefined,we go for return keyword
//use of return keyword:1)It will stop the execution of function
//2)It will give control to the caller
function demo(){
    console.log('hello world');
    return 'hello'
   // console.log('hello world');//we don't get output bcoz it is after return
}
console.log(demo);//entire function
console.log(demo());//hello world , hello
//write a function to perform the addition of two number,input will be given the end users
//if we want to take input from the users,use prompt method present in window object.
//prompt method implicitly converts into string,which performs concatenation.i.e; implicitly typecasting
let a=Number(prompt("enter a"))
let b=Number(prompt("enter b"))
console.log(add(a,b));//hoisting
function add(a,b){
    return a+b;
}
console.log(add(5,6));//input given by programmer
console.log(add(5,10));
console.log(add(a,b));

//let a=20; we get error, bcoz we cannot re-initialize a let variable
//let is a local variable which can be re-declared ,but cannot be re-initialized.
//var is  a global varibale which can be redeclared and reinitialized.
//A function is usEd to perform a specific task
//A function expression doesn't hoisted.It uses an anonymous function
//to print the actual arguments that we are passing , we use one object i.e; arguments object.
//A function declaration statement is pure statement
function Demo(){
console.log(arguments);//Arguments(3) [10, 20, 30, callee: ƒ, Symbol(Symbol.iterator): ƒ]
console.log(arguments[0]);//10
console.log(arguments[1]);//20
}
console.log(Demo(10,20,30));//undefined

//function expression
let demo2=function(){
    console.log('hello world');
}
console.log(demo2);//entire body of function
console.log(demo2());//hello world, undefined

var demo3=function demo4(){
    console.log('function expression with function declaration');
}
console.log(demo3);//entire body of function
//console.log(demo4);//Uncaught ReferenceError: demo4 is not defined
console.log(demo3());//function expression with function declaration,undefined
//console.log(demo4());//Uncaught ReferenceError: demo4 is not defined

// console.log(demo5());//Uncaught TypeError: demo5 is not a function
// var demo5=function(){//instead of var if u use let or const,we get reference error
//     console.log("hello");
// }


