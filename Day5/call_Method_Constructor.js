/*
Function : group of statement we write to perform certain actions.
Method : is function only but which is belongs to object of class.

classname object =new clasname(); // java
let  refereceName = new classname();
*/

class Student{

    constructor(id,name){
        this.id = id; // local
        this.tool =name; // local
    }

    //inorder to make local variable global (user this keyword and remove (let,const, var))
//method
// test2(id,name){
//     console.log("this method is setting up data");
//     //  let id = "101"; // local
//     //  let tool ="selenium"; // local

//     //global variable
//     this.id = id; // local
//      this.tool =name; // local
// }

test3(){
    console.log("id is "+ this.id + " and tool is "+ this.tool);
    
}

}

// let s1 = new Student();
// s1.test2();
// s1.test3();

let s2 = new Student(201,"Selenium");
//s1.test2(201,"javaScript");
s2.test3();