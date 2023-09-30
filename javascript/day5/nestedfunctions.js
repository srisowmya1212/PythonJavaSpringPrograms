
//lexical scope
function outer(){
    var a=100;
    function inner(){
        console.log(a);
    }
    inner()
}
outer()

var a=20;
function demo1(){
    console.log(++a);
}
demo1();
demo1();

//closure
function parent(){
    console.log("i am parent function");
    function child(){
        let a=10;
        console.log("i am child function");
        function child1(){
            console.log(a);
            console.log("i am child1 function");
        }
        return child1
    }
    return child
}
parent()()();

function parent1(){
    console.log("i am parent1");
    function child2(){
        console.log("i am child2");
        function demo(){
            console.log("i am demo in child2");
        }
        return demo;
    }
    function child3(){
        console.log("i am child3");
    }
    return [child2,child3]//use array method when there are multiple
}
let res=parent1();
res[0]()()//index position of child2 and for demo 
res[1]()
