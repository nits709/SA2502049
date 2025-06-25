/*
Functions in javascripts
1. function declaration
2. Function expression (Modern Js after 2016)
    anonymous function
    arrow function.
*/

console.log("function declaration");
// without parameter
function test1()
{
   console.log("calling function");
   
}

//call the function
test1();

console.log("---------function declaration with parameter-----");


function printName(name){
    console.log("Welcome "+ name);
    
}

printName("John");


console.log("-------------functino declaration with parameter with return----");


function test3(num1,num2){
    return num1+num2;
}

        console.log(test3(40,50));
        let result = test3(60,70);
        console.log(result);
           




