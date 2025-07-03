describe("getAttribute ",function(){

    it("Automate Scenario using CSS", ()=>{
        cy.visit("https://automationexercise.com/")  // launch the URl
        cy.get("[href='/products']").click();  // Clicks on Product Element
        cy.get("#search_product").type("T-Shirts"); // enter the text
        cy.get("#submit_search").click();
        //value | Text -text
        cy.get("[value='T-Shirts']").invoke('val').then((value)=>{
                cy.log("Attribute is value "+ value);
        })

    //     cy.get("[value='T-Shirts']").invoke('text').then((value)=>{
    //         cy.log("Attribute is value "+ value);
    // })
    })

//     Property	How to Access in Cypress
// Text	cy.get('selector').invoke('text')
// Value (input)	cy.get('input').invoke('val')
// Attribute	cy.get('a').invoke('attr', 'href')
// CSS Property	cy.get('div').invoke('css', 'color')
// Custom Attributes	cy.get('div').invoke('attr', 'data-id')
// Class List	cy.get('div').invoke('attr', 'class')
})