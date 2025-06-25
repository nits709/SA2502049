/*
Type Casting
=================================
conversion on one type of data into other type type casting

1. Implicit Conversion(implicit type casting taken care by javascript and that happen internally)
   Coersion

2. Explicit Conversion (done through code)
    1. String
    2. Number
    3. Boolean
*/


//String conversion  = Implicit conversion

let num1 = "10"+20;  // 20 will coersed to string "20"
console.log(num1);
console.log(typeof num1);



let num2 = 2+5+"10"; // 7 will corsed to string "710"
console.log(num2);

let num3 = 10+"15"+20; // 10 and 20 will coresed with 15
console.log(num3);


let d1 = "Hi"+true; //true gets coersed with Hi
console.log(d1);

console.log(typeof d1);



//Number (-,*,/,%)
console.log("----------Number Coersion-------------------");
console.log("20"+"10"+"20");  201020

console.log("20"-10);// 20 coersed with number 20-10 = 10
console.log(typeof ("20"-10)) // number

console.log("100"*2); // 100 coersed to number 100*2 = 200
console.log(typeof ("100"*2));// number

console.log("20"/"2"); // 10
console.log(typeof ("20"/"2")) //number


console.log("hi"* 10); //NAN



console.log("---------------------Explicit Type casting-----------------------------------");
// Number, String, Boolean
let data = "200"; // string
console.log(typeof data);

console.log(data+200);//200200

//addition --> string to number
        let addition = Number(data);
        console.log(addition); // 200
        console.log(typeof addition); //number 
        console.log(addition+200); // 400

        console.log(Number("600")); //600
        console.log(Number("Nitin")); //nan
        console.log(Number(true));// 1
        console.log(Number(false));//0
        console.log(Number(null));// 0
        console.log(Number(undefined));//Nan


        console.log("---------Number to String----------");
        let num = 2000;
        console.log(typeof num);
        console.log(num-1000);//1000
        console.log(num+1000);//3000

        let numToStringConvert = String(num); // 2000
        console.log(typeof numToStringConvert);
        console.log(numToStringConvert-1000);//1000
        console.log(numToStringConvert+1000);//20001000
        console.log(Number(numToStringConvert)-1000);//1000
        
        console.log("---------------Boolean Conversion------------");
        /*
            truthy and falsy
            truthy means any value in bolean context represented as true
            non-zero number , 1,2 and nonempty string "23123""nitin"

            falsy - 5
            any value in boolean context represented as false
            0,"",null,undefined,NAN,false

            true - 1
            false - 0
        */

            console.log(Boolean(90));//true
            console.log(Boolean(-90)) // true
            console.log(Boolean("Nitin")) //true 
            console.log(Boolean(true))// true
            console.log(Boolean(80.999))//true



            console.log(Boolean(0));//false
            console.log(Boolean(false)) // false
            console.log(Boolean(undefined)) //false 
            console.log(Boolean(null))// false
            console.log(Boolean(""))//false
            console.log(Boolean(NAN))//false

console.log(isNaN(1234)); // false | 1234 is a number
console.log(isNaN("Hello"));// true | Hello is not a number



            
                     








        
        
        
        
        


        










        
        
        















