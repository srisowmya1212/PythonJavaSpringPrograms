// console.log(window);
// console.log(typeof window);
// console.log(document);
// console.log(typeof document);

// window.alert();
// window.confirm();
// window.prompt();
// document.write('hello')
// document.writeln('hello-world')//we get one tab space
// document.writeln('hello-world')
console.log(document.head);
console.log(document.title);
document.title='flipkart'
console.log(document.body);
console.log(document.URL);
console.log(document.links);
let demo=document.links
console.log(demo);
console.log(demo[0].setAttribute("href","http://www.google.com"));
console.log(demo[1].setAttribute("href","http://www.flipkart.com"));
console.log(demo[2].setAttribute("href","http://www.amazon.com"));
for(let i=0;i<demo.length;i++){
    console.log(demo[i]);
    demo[i].className="demo1"
    
}
//demo[0].href="http://www.google.com"
console.log(demo[3]);
demo[3].setAttribute("href","http://www.google.com")

console.log(document.images);
let img=document.images;
console.log(img);
for(let i=0;i<img.length;i++){
    console.log(img[i]);
    img[i].style.height="200px";
    img[i].style.width="200px"
    img[i].style.borderRadius="100%"
}
//create three forms and target using document.forms and iterate using for loops and use css property 
console.log(document.forms);
let form=document.forms;
console.log(form);
for(let i=0;i<form.length;i++){
    console.log(form[i]);
}
form[0].style.border="3px solid black"
form[0].style.backgroundColor="green"
form[0].style.margin="30px"
form[0].style.padding="40px"

let submit=document.getElementById("submit")
console.log(submit);
submit.addEventListener("click",(e)=>{
    e.preventDefault()
    let name=document.getElementById("name").value
    console.log(name);
    let password=document.getElementById("password").value
    console.log(password);
})
