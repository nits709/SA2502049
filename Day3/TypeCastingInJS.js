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











