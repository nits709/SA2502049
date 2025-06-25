console.log("-------for loop--------");

// print hello 5
for(let i=1;i<=5;i++){

    console.log("Iteration No " + i  + "  :  " + "HELLO");
    
}

// print number from 1 to 10

for(let i=1; i<=10;i++){
    console.log(i);
    
}

//print all even nu from 1 to 10
for(let i=1; i<=10;i++){
   
    if(i%2==0){
        console.log("value is even "+ i);
        
    }
    
}

let fact = 1 ;
for(let n=5;n>=1;n--){
    fact = fact*n; // 
}
console.log("factorial of 5 "+ fact);


// welcome for 10 times
let i = 1;
while(i<=10){

console.log("Welcome" + i);
i++;
}


// Assignments to prnt sum of 100 natural number.

// break, and continue.


console.log("----------------------");
//break;

for(let k=1;k<=10;k++){
    if(k>5){
        break;
    }else{

        console.log(k);
        
    }
}
console.log("------------");

for(let k=1;k<=10;k++){
    if(k==8){
        continue;
    }else{

        console.log(k);
        
    }
}














