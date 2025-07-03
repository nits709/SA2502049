/// <reference types="Cypress" />
// cy.xpath

describe("CSS Locator", function(){
    it("Automate Scenario using CSS", ()=>{
        cy.visit("https://automationexercise.com/")  // launch the URl
        cy.get("[href='/products']").click();  // Clicks on Product Element
        cy.get("#search_product").type("T-Shirts"); // enter the text
        cy.get("#submit_search").click();
    })
})