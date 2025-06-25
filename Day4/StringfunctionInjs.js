
  /*
    String is a Collection of character
  */  

    let info = "Selenium Webdriver is functional automation tool";
    console.log(info);

    // total length of the string = property
    console.log(info.length);

    let h1 = "Hello All";
    console.log(h1.length);
    console.log(h1.toUpperCase());
    console.log(h1.toLowerCase());
    
    console.log(h1.charAt(4));//o
    /// trim() -- function use to remove space from trailing and ending of string.

    let sString = "Software testing, having manual and automation testing";

    console.log(sString.replace("testing","*****"));
    console.log(sString.replaceAll("testing","####"));

    console.log(sString.includes("automation")); // true
    
    let statement = "Your total amount is 5000";
    let bill = statement.split(" ")[4];
    console.log(bill);
    
    let amount = Number(bill)
    if(amount>=5000){
        console.log("testcase pass");
        
    }else {
        console.log("testcases fails");
        
    }















    







    
    
    
    