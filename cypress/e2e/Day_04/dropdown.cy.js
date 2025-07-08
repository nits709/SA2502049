/// <reference types="Cypress" />

// i have 2 testcases in my class, - skip
// value = number , visible text letters
describe("Handle dropdown",()=>{

    it.skip("dropdown with Select",()=>{

        cy.visit('https://www.zoho.com/commerce/free-demo.html');
        cy.get("#zcf_address_country")
        .select(3) // value option., select function accepts
        .should('have.value','Malaysia')
    })
    //https://www.dummyticket.com/dummy-ticket-for-visa-application/



    it.skip("dropdown without Select",()=>{

        cy.visit('https://www.dummyticket.com/dummy-ticket-for-visa-application/');
        cy.get("#select2-billing_country-container").click(); // open the country list.
        cy.get(".select2-search__field").type('Italy').type('{enter}');
        cy.wait(1000)
        cy.get("#select2-billing_country-container")
        .should('have.text','Italy')
        
    })

    //https://www.wikipedia.org/

            //.suggestion-title - 7 total - 6 visible over page and 1 is hidden.

    it("dropdown with static autosuggestion",()=>{
            cy.visit("https://www.wikipedia.org/");
            cy.get("#searchInput").type('Delhi');
            cy.get('.suggestion-title').contains('Delhi Metro').click();
    })


    //.wM6W7d[role='presentation'] - 10
    it("dropdown with dynamic autosuggestion",()=>{
        cy.visit("https://www.google.co.in/");
        cy.get("[name='q']").type('Cypress Automation');
        cy.wait(3000)
    cy.get(".wM6W7d[role='presentation'] > span").should('have.length',10)  
    cy.get(".wM6W7d[role='presentation'] > span").each(($el,index,$arrayList)=>{  //jquery
            cy.log("get suggestion texts "+$el.text())
            if($el.text()=='cypress automation tutorial'){
                cy.log("get the text of links "+ $el.text());
                        cy.wrap($el).click();
            }
           
        })
        cy.get("[name='q']").should('have.value','cypress automation tutorial')
})
})