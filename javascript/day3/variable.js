//without using variable we are we are getting output when we declare a=10; clg(a) //10 bcoz it is globally stored in the browser
//in window object a:10 is stored globally.That 's why we didn't get error
//to get the error msg,bcoz it is invalid we use 'use strict'
'use strict'
//var a=10;
//console.log(a);
//console.log(window);
//variables are used to store a block of memory.Variable is dynamic bcoz here we are not providing datatype
//internally javascript engine assigns it is number or string etc datatype
//There are three types of datatypes
//1)script/local
var a=10;
console.log(a);
let b=20;
console.log(b);
const c=30;
console.log(c);
{
    var d='hello';
    console.log(d);
    var e='world';
    console.log(e);
}
