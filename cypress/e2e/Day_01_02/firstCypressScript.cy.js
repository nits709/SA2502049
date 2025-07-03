

describe("my first script", function(){
    it("Launch Browser", function(){
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")  // this function launch URL.
     cy.wait(2000) // accepts time in miliseconds
     //cy.console.log("URL launched");
        cy.log("URL Launched");
        
        
    })


    it("Launch Browser", function(){
        cy.visit("https://facebook.com")  // this function launch URL.
     cy.wait(2000) // accepts time in miliseconds
     //console.log("URL launched");
     cy.log("URL Launched");
    })
})