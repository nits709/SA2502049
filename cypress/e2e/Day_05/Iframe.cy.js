 import 'cypress-iframe'

describe("handling iframe",()=>{
    it("handling iframe without plugin",()=>{
        cy.visit('https://jqueryui.com/menu/')
        cy.get('.demo-frame')
        .its('0.contentDocument.body')  // jquery  | switch
        .should('be.visible')
        .then(cy.wrap)  // this wrap the iframe or element into cypress ontext and return the iframe.
        .within(()=>{  /// mandatory in case u have nested HTML structuree | forms, iframe
            cy.get('#menu > li > div').each(($el,index,listarray)=>{
                        cy.log("get text "+ $el.text());
            })
        })

        })


        it.only("handling iframe with plugin",()=>{
            cy.visit('https://jqueryui.com/menu/')
            cy.frameLoaded('.demo-frame')   // load ifram element over page
            cy.iframe('.demo-frame') // iframe function would have complete control .
            .should('be.visible')
            .within(()=>{  /// mandatory in case u have nested HTML structuree | forms, iframe
                cy.get('#menu > li > div').each(($el,index,listarray)=>{
                            cy.log("get text "+ $el.text());
                })
            })
    
            })
})