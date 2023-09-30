function operation(task){
    console.log("i am higher order function");
    let c=task()
    return c;
}
let res1=operation(function(){
    window.alert('i am call back function')
})


let res2=operation(function(){
    document.write("i am 2nd call back function")
})
console.log(res2);

let a=Number(prompt("enter a"))
let b=Number(prompt("enter b"))
let c=Number(prompt("enter c"))
function demo1(a,b,c,task){
    let d=task(a,b,c);
    return d;
}
var demo3=demo1(a,b,c,function(a,b,c){
    return a-b-c;
})
console.log(`The subtraction of three numbers is: ${demo3}`);
var demo4=demo1(a,b,c,function(a,b,c){
    return a*b*c;
})
console.log(`The multiplication of three numbers is: ${demo4}`);
var demo5=demo1(a,b,c,function(a,b,c){
    let e=(a>b) ? a :b
    let f=(e>c) ?e :c
    return f;
})
console.log(`The largest of three numbers is: ${demo5}`);
var demo6=demo1(a,b,c,function(a,b,c){
    let e=(a>b) ? a :b
    let g=e/b;
    let f=(g>c) ?g :c
    
    let h=f/c;
    return h;
})
console.log(`The division of three numbers is: ${demo6}`);

function demo7(task){
    let b=task()
    return b

}
console.log(demo7(function(){
    let h1=document.getElementsByTagName("h1");
    console.log(h1[0]);
    h1[0].style.backgroundColor="red"
}))
console.log(demo7(function(){
    document.title="flipkart"
    
}))


function demo1(a,b,c,task){
    let d=task(a,b,c);
    return d;
}
let demo3=demo1(a=Number(prompt("enter a")),b=Number(prompt("enter b")),c=Number(prompt("enter c")),function(a,b,c){
    return a-b-c;
})
console.log(`The subtraction of three numbers is: ${demo3}`);
let demo4=demo1(a=Number(prompt("enter a")),b=Number(prompt("enter b")),c=Number(prompt("enter c")),function(a,b,c){
    return a*b*c;
})
console.log(`The multiplication of three numbers is: ${demo4}`);
let demo5=demo1(a=Number(prompt("enter a")),b=Number(prompt("enter b")),c=Number(prompt("enter c")),function(a,b,c){
    let e=(a>b) ? a :b
    let f=(e>c) ?e :c
    return f;
})
console.log(`The largest of three numbers is: ${demo5}`);
let demo6=demo1(a=Number(prompt("enter a")),b=Number(prompt("enter b")),c=Number(prompt("enter c")),function(a,b,c){
    let e=(a>b) ? a :b
    let g=e/b;
    let f=(g>c) ?g :c
    
    let h=f/c;
    return h;
})
console.log(`The division of three numbers is: ${demo6}`);


