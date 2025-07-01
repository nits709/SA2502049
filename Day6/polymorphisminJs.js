/*
Type of poly.
1. complication time (over loading)
2. Runtime (over riding)

*/

class Test{


    print(){
        console.log("print1 ---Hello");
        
    }

    print(fname){
        console.log("print2 ---Hello "+ fname);
        
    }
    
}

console.log("Method Overloading(not possible)");


let t1 = new Test();
t1.print();
t1.print("Nitin");


console.log("-------Method overiding-----IS-A relationship-------");
/* Dynamic | RunTime polymorphism */
class Fruit{
eat(){
    console.log("Fruit ------------eat() function is calling");
    
}

}

class Orange extends Fruit{

    eat(){
        console.log("Orange --------eat() function is calling");
        
    }
    
    
}

let f1 = new Fruit()
f1.eat();

let f2 = new Orange()
f2.eat();