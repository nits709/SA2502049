

show();
/*
variables - in JS are used to store data that can be used and changed later in the program.
Javascripts keywords
var
scope - function, Global, block
function -  mean variables declared inside the function, scope of that variable within function only.
Global - variable declared in side the class but outside the fuctions, so scope would accross the class.
block - variable declares inside the block (if, try, while, catch, for) scope would remain within.
var name ="nitin";
var name = "sachin";
redeclaration & re-assigned is allowed.

let - function +block + global
 redeclaration is not allowed. 
 let flag = true
     flag = false re-assigned.

const - (final) is immutable variable
1. Scope - function + blocked + global
2. re-declaration and re-assigned is not allowed.
3. variable are immutable so that re-assigned not possible.
*/

// show();

// // global
//  var fname = "nitin";
//  let id = 709;
//  const email = "nitin@gmail.com";

// //  console.log("==============================Calling variable======================")

//  console.log(fname)
//  console.log(id)
//  console.log(email)

//  function show(){ // function declaration
//     console.log("==============================Calling global variable======================")


//     console.log(fname)
//     console.log(id)
//     console.log(email)

//  }

//  show();  // function calling.

//  console.log("=============Local variables====================")

//  function display(){

//     let uName = "Sachin";
//     var marks = 90;
//     const percentage = 4.5;


//     console.log("uName "+ uName)
//     console.log("marks "+ marks)
//     console.log("percentage "+ percentage)

//  }

//     display();
//     //ReferenceError: uName is not defined
//     //at Object.<anonymous> (/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/
//     // console.log("uName "+ uName)
//     // console.log("marks "+ marks)
//     // console.log("percentage "+ percentage)


//     //block scope

//     if(true){
//         let AutomationName = "Selenium";
//         var SelVersion = "4.33.0";

//         console.log("=======printing inside block================")
//         console.log("AutomationName "+ AutomationName)
//         console.log("SelVersion "+ SelVersion)
//     }

    /*
/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2502049_Workspace/SA2502049_JavaScript/Day2/variablesInJavascripts.js:83
        console.log("AutomationName "+ AutomationName)
    
        console.log("=======printing outside block================")
        console.log("AutomationName "+ AutomationName)
        console.log("SelVersion "+ SelVersion)
        */

            // var data = "testing";
            // console.log("line no .93 "+ data);

            // var data= "programming";
            // console.log("line no .96 "+ data)

            // data= "coding"
            // console.log("Line no 99 "+ data)


//             // in let re-declaration variable is not allowed.
//             let testData = "Chrome Browser";

//             console.log("line no 105" +testData)
//             testData = "firefox Browser";


// console.log("line no 107" +testData)

//     // const final keyword.
//     // java --> final keyword - infront of variable, function and class

//     const valueEnv = "12312ada";
//     //const value ="1232131"; // re-declaration is not allowed.
//     // valueEnv = "12312ada";

//     console.log("======================Hoisting=====================");


    /*

if i have declared someting at linke 123



    */

// console.log("Hoisting with var")

//         console.log("line no. 129"  +a)
//         var a = "xyz";
//         console.log("line no. 131" +a)


        // console.log("Hoisting with let ")

        // console.log("line no. 138"  +abc)
        // let abc = "xyz";
        // console.log("line no. 140" +abc)


        // console.log("Hoisting with const")

        // console.log("line no. 145"  +abc)
        // const abcd = "1234";
        // console.log("line no. 147" +abcd)
//hoisting allowed to function declaration but not function expression.
// function add();  // function declaration
// 1. function without name , 2. arrow function.(anonynomus)

// let sum = function(){}

/*
2 steps
1. preparation (Memory setup)
   a. JS scans your code top to bottom
   b. its finds all var, let, const and function declarations
   c. its sets them aside in memory before any line runs
 
2. Execution.
    1. Now js runs your code line by line
    2. if we use a variable or function before its written , js got to know from step 1

*/

console.log(a); //undefined
var a = 10;

var a; // step1: declaration hoisted.
console.log(a); // step 2 value is undefined.
a = 10 ; // step2 : assignment


// console.log(b);  // error
// let b = 5 ; 
// javascripts knows b exists but doesnt let you touch it until the line where it declared.
//TDZ Temporal dead zone., let and const are hoisted, 

function show(){
    console.log("show function calling")
}

show();


/*
ReferenceError: Cannot access 'sum' before initialization
    at Object.<anonymous> (/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2502049_Workspace/SA2502049_JavaScript/Day2/variablesInJavascripts.js:2:1)
    at Module._compile (node:internal/modules/cjs/loader:1469:14)
    at Module._extensions..js (node:internal/modules/cjs/loader:1548:10)
    at Module.load (node:internal/modules/cjs/loader:1288:32)
    at Module._load (node:internal/modules/cjs/loader:1104:12)
    at Function.executeUserEntryPoint [as runMain] (node:internal/modules/run_main:174:12)
    at node:internal/main/run_main_module:28:49

*/
let sum =function(){
    {
        console.log("calling function without name")
    }
}

sum();





