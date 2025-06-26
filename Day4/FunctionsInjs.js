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
   let result =  test3(60,70);
        console.log(result);


        console.log("===============================Function Expression ==============");
        console.log("====================anonymous Function: function without name==============");
        
      let newtestFunction =  function(id,name)  // function with variables
                                {

                                            console.log("Student id is "+ id);
                                            console.log("Student name is "+ name);
                             }
        
                    //calling anonymous function
                            
                                newtestFunction(201,"Sachin") // arguments


                                let test4 =function(id,name){
                                return `Student id is: ${id} and student name is ${name}`;
                                }

                                console.log(test4(301,"Abhishek"));
                                
console.log("----------arrow function-------");

               let test5 =  (num1,num2)=>{
                     return num1+num2;
               }

               console.log(test5(22,44));
               let res = test5(33,55);
               console.log(res);
               
               