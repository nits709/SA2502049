

/// <reference types="Cypress" />
describe("HandlingTabs",()=>{
// it("Approach1",()=>{
//     cy.visit("https://the-internet.herokuapp.com/windows")// parent window.
    
//     cy.get('.example >a').invoke('removeAttr','target').click();
//     cy.url().should('eq','https://the-internet.herokuapp.com/windows/new') // child URL

//     cy.wait(5000);



// })

it("Approach2",()=>{
    cy.visit("https://the-internet.herokuapp.com/windows")// parent window.
    cy.screenshot("Parent URL")
    

    cy.get('.example >a').then((newURL)=>{
           let url = newURL.prop('href') ; // return the value of an attribute from DOM not from the HTML
           cy.log("New URL "+ url);

           cy.visit(url);
           cy.url().should('eq','https://the-internet.herokuapp.com/windows/new') // child URL
           cy.screenshot("child URL")
           cy.wait(5000);
           
    })


})
})