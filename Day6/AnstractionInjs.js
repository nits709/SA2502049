/*
hiding internal implementationof software and provide key feature relevant feature to user
example : ATM machine, Mobilephone
*/

function Employee(id,name,basicSal){
    this.id= id;
    this.name = name;
    this.basicSal = basicSal;
   // this.bonus = 10000;
   let bonus = 10000;

    // this.calBonus = function(){
    //     finSalary = this.basicSal + this.bonus;
    //     console.log("Finsalary "+ finSalary);
        
    // }

    let calculateBonus = function(){ // local or private
        finSal = basicSal + bonus;
        console.log("final salary " + finSal);
        
    }
    

    this.display = function(){
        console.log(this.id + "   :   " + this.name);
        calculateBonus();
        
    }

}

let l2 = new Employee(101,"Abhi",20000)
l2.display();
l2.calculateBonus();
 //l2.calBonus();
// l2.bonus = 40000;
//l2.calculateBonus();