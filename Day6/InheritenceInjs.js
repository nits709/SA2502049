/*
Inheritence:
Aquaring the properties of one class into another class is called Inheritence
1. purpose:
1. avoid code duplication
2. reuse code
3. implement runtime polymorphism
B extends A ===> A is parent and B is child
child can access the property of child and parent
parent can access own property only.

*/

class Vehical{ // parent


    breakFeature(){
        console.log("Vehical------------- break function is calling");
        
    }
}

class Car extends Vehical {  // child
    startCar(){
            console.log("Car------------startCar function is calling");
            
    }

    stopCar(){
        console.log("Car------------stopCar function is calling");
    }

    refuleCar(){
        console.log("Car------------refuleCar function is calling");
    }

    // breakFeature(){ // own function 
    //     console.log("Car------------- break function is calling");
        
    // }
}

class BMW extends Car{
    autoEngine(){
        console.log("BMW --------autoEngine is calling");
        
    }
}

// let car = new Car();
// car.refuleCar();
// car.startCar();
// car.stopCar();
// car.breakFeature();


let c1 =new BMW();
c1.startCar(); // inherited method
c1.stopCar(); // inherited method
c1.refuleCar(); // inherited method
c1.breakFeature(); // MultiLevelinherited method
c1.autoEngine() // individual method.