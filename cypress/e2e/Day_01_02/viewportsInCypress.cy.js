describe("resize the browser window",()=>{


    it("viewport screentest",()=>{
        cy.visit("https://google.com")
        cy.wait(2000)
        cy.log("URL Launched");
        cy.viewport(1920,1000);

        cy.wait(5000)
        cy.viewport("samsung-s10")
        cy.wait(5000)
    })
})