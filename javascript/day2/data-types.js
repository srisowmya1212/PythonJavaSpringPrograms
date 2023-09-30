var a=10;
console.log(a)
console.log(typeof a)
console.log(typeof 10.5);
console.log(typeof -10);

console.log(typeof Number);//function starts with upper N
console.log(Number);
console.log(Number());//0
console.log(typeof String);//function
console.log(typeof number);//undefined bcoz data type starts with lower n

//string
var c='hello'
console.log(c);
console.log(typeof c);

var d="hello world"
console.log(d);
console.log(typeof d);

var e='iam developer'
console.log(e);

var f="i'm developer"
console.log(f);

console.log(`The movie                is
         good               *`);
var a=10;
var b=20;
var c=a+b;
console.log(`The sum of ${a} and ${b} = ${c}`);//interpolation it doesn't work with single and double quotes
console.log('The sum of ${a} and ${b} = ${c}');

var h;
console.log(h);//undefined
console.log(typeof h)//undefined

var b=null;
console.log(b);//null
console.log(typeof b);//object. in js at the end everything comes under object

console.log(true);
console.log(typeof true);

console.log(10n);
console.log(typeof 10n);

//In primitive datatypes ,until the programmer changes the value,it will not be changed.Example:
var a=10;
console.log(a);//10

var b=a;
console.log(b);//10

var a='hello'
console.log(a);//hello
console.log(b);//10

var b=a;
console.log(b);//hello
//A prototype is nothng but copy of the object.By using prototype only, we perform all oops concepts
//Non primitive datatype:where the value can be changed
var obj={
    id:1,
    name:'sri'
}
console.log(obj);
var obj1=obj;
console.log(obj1);
obj1.id=100;
console.log(obj1);
console.log(obj);

