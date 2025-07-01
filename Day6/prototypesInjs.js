/*
prototype is an object which belongs to object and functions
 We can create reusable method or property using prototype
*/

function Employee(id, name){
    this.id = id;
    this.name=name;
}

//design new property which is common accross all objects which is pointing towards same class.
//classname.prototype.language

Employee.prototype.language="javascripts";


let l1 = new Employee(101,"Amit");
//l1.language= "javascripts";

console.log("Id: "+ l1.id + "name: "+ l1.name + "langugage "+ l1.language);

console.log("----------------");

let l2 = new Employee(201,"Sachin");
console.log("Id: "+ l2.id + "name: "+ l2.name + "langugage "+ l2.language);




console.log("--------Reusable Method ---------------");
//String scenario

let data = "Hello Everyone       ";

console.log("length of string "+ data.length);

//console.log("get character count "+ data.trim().length);

// creating functino that returns me true length of my string.
String.prototype.trueLength = function(){

                    return this.trim().length;

}


console.log("true length of my string "+ data.trueLength());







