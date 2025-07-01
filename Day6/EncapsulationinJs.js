/*
1. What is OOps/ specific pillar of ops
2. purpose.
3. How to implement?
 To acheive it use getter and setter and define/declared the properties 
 of class within functions or constructors

*/

class Employee{


constructor(){
    let id;
    let name;
}

// getters and setters
setId(id){
    this.id = id;
}

getId(){
    return this.id;
}

setName(name){
    this.name = name;
}

getName(){
    return this.name;
}

}

//access the class members of class using object.
let s1 = new Employee();
s1.setId(101);
s1.setName("Deepak");

console.log("Id : "+ s1.getId() + " : name "+ s1.getName()
);
