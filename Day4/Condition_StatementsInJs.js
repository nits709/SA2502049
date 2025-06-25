/*
1. simple if(true)
2. if-else (true/false)
3. LadderIf( Multiple validations)| if-else if
4. nestedIf( Multiple validations)

*/

console.log("Simple if Demo");

let year = 2025;

if(year == 2025){
    console.log("true current year : " + year);   
}

console.log("---------if and else------");

let age=13;

if(age>=18){
    console.log("user is eligible for voating");
    
}else{
    console.log("not eligible for voating");
}

console.log("========== ladder if=======");

let num =200;

if(num>0){
    console.log("positive");
    
}else if(num<0){
    console.log("negitive");
    
}else{
    console.log("zero");
    
}

console.log("=====BrowserValidation==========");

let bname = "edge";

if(bname === "chrome"){
    console.log("test case executes on "+bname);
    
}else if(bname==="firefox"){
    console.log("test case executes on "+bname);
    
}else{
    console.log("invalid browser"+bname);
}


console.log("--------nested if-----");

/*
marks are gether equal 90 -- A
marks are  gether equal 95 -- A++
marks otherwise b
*/

let marks = 91;
if(marks>=90){

    if(marks>=95){
        console.log("A++");
        
    }else{
        console.log("A");  
    }

}else{
    console.log("B");
    
}

console.log("------switch case statement---------");

let color = "rWhiteed";


switch(color)

{
        case "red":
        console.log("Stop");
        break;

        case "yellow":
        console.log("Ready");
        break;

        case "green":
        console.log("Go");
        break;


        default:
            console.log("wrong case");
         break;   

}



