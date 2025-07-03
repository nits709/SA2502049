describe("Validating App URL",()=>{


    it("Validate title - Positive",()=>{
            cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
            cy.title().should('eq','OrangeHRM')
            cy.log("Testcases Passed");
      
    })

    it("Validate title - Negative",()=>{
        cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        cy.title().should('eq','OrangeHRM123')
        cy.log("Testcases Passed");
  
})

})