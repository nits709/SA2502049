

describe("Validate element length",()=>{
    it("validate length of t-shirt", function(){
        cy.visit("https://automationexercise.com/")
        cy.get("[href='#Men']").click();
        cy.get("[href='/category_products/3']").click();
        cy.get(".features_items .col-sm-4").should('have.length',6)


    })
})