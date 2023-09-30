let demo=document.getElementById("demo")
console.log(demo)
demo.textContent="hello world"
// why js is object based bcoz it has inbuilt object where we can access by using . operator where it gives methods present in that object
console.log(typeof console)//object
console.log(typeof console.log)//function
console.log(typeof log)//undefined
let a;
console.log(a)//undefined
//console in js means it is used to print in the browser

let object={
    id:1,
    name:'abhi'
}
console.log(object)
console.table(object)//to get in table format
console.error("i am error")//to create our own error
console.warn("i am warning")//to give warning msg

console.group("names")//to create drop box
console.log("raju")
console.log("rani")
console.groupEnd

//console.clear()