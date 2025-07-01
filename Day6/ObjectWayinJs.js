/*
How many way can create an object in javascripts
===============================================
1. Object literal way
let person = {
    name:"Amit",
    id:101,
    Job:"QA"
}
2.  create class level object
class classname{
    }  

  vartype  variable name = new clasname();

  3. Constructor function based object.
  4. Object.create(): prototype based.
*/

function Student(id, name, subject){
        this.id = id;
        this.name = name;
        this.subject = subject;

        //function
        this.print = function(){
            console.log("id: "+ this.id + "name: "+ this.name + " subject:"+ this.subject);
            
        }
}
let s1 = new Student("101","Amit","QA Automaiton");
s1.print();

console.log(" ----Object.create() ------");

// Test

let Test={ 
    subject: "Testing",
    id:101,
    marks:60
}

//creates an object that has the specified prototype or that has replica of existing  feature(properties)

    let t1 = Object.create(Test);
    console.log(t1.subject);
    console.log(t1.marks);
    console.log(t1.id);
    
    

