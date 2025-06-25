//Arithmetic operator

let a = 10, b =5;


console.log("Addition is : "+(a+b)) // 105
console.log(`Addition is : ${a-b}`) // 5
console.log(`Multiplication is : ${a*b}`) // 50
console.log(`division is : ${a/b}`) // 50
console.log(`Modulus is : ${a%b}`) // 0


console.log(90/0); // Infinity
console.log(-90/0); // -Infinity

console.log("hi"/0); // NAN | not a number
console.log(0/0) // NAN
console.log(1/0) // Infinity.

//String + concatination.
console.log("10"+10); // 1010

/*
increment and decrement
a=10;                           b = 20
a++ ; post increment |          b--: post decrment
++a; pre increment              -- b : pre decrement

*/

let a1 =100;
console.log(a1); // 100
console.log(a1++); //100
console.log(a1) // 101

let b1 = 200;
console.log(b1);// 200
console.log(++b1);// 201

let x =90;
console.log(x);
let y= x++; //value will assign first the incrment will happened

console.log(x); // 91
console.log(y);//90

let c= 189;
let d = c++;
 console.log(c); // 190
 console.log(d); // 189

  // post decrement
  let m = 188;
  let n =m--;

  console.log(m); //187
  console.log(n); //188

  /*(variable++) post incrment first variable value print and increment)
  variable = variable++ value assign to variable then incrment)
  ++variable = variable got the update/latest value (pre-incrment then value print)
  variable= ++ variable value got incrment first then assigned.)
  */

  let p= 145;
  let q =++p;  

  console.log(p); // 146
  console.log(q); //146

  let u=567;
  let v=++u;

  console.log(u); // 568
  console.log(v); //568

  //pre decrement
  let i = 689;
  let j=--i;

  console.log(i);  //688
  console.log(j); //688
  

/*
Relational operator
< less than
<= less than equal to
> greater than
>= greater than equal to
!= not equal

Equality

strict equality ===
loose equality  ==

*/

console.log(p>i); // false
console.log(p>=q);// true
console.log(i>=m);// true
console.log(m<=n);// true
console.log(i!=n);// true

console.log(j==i); // true


//loose look for value not for datatype
console.log("10" == 10);  //true


//strict look for value and datatype both
console.log("10" === 10); // false

/*
Logical Operator
a           b                a&&b               a||b           a!
true       true               true              true           false
true       false              false             true           false
false      true               false             true           true 
false      false             false              false          true


null = 0
undefined = 0
false = 0 
true = 1 ; 
*/


console.log(null == undefined); // true
console.log(false + true); // 1
console.log(true+1); // 2
console.log(""+10); 10
console.log(false == null);
console(undefined+100) //NAN
console.log(false === null);


























  
  
  
  
  
  
 














