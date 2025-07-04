


describe("Check UI Element",()=>{
    // it("Handling Radio Button",()=>{
    //     cy.visit("https://testautomationpractice.blogspot.com/")

    //     //checking the visibility of radio button
    //     cy.get('input#male').should('be.visible')
    //     cy.get('input#female').should('be.visible')

    //     // selecting the male radio button and checking female radio button state
    //     cy.get('input#male').check().should('be.checked')  // selects the radio button
    //     cy.get('input#female').should('not.be.checked')


    //     cy.wait(5000)
    //     // selecting the female radio button and checking male radio button state
    //     cy.get('input#female').check().should('be.checked')  // selects the radio button
    //     cy.get('input#male').should('not.be.checked')

    // })

        it("handling checkbox",()=>{

            cy.visit("https://testautomationpractice.blogspot.com/")

            //checking the visibility of an element
            cy.get('input#sunday').should('be.visible')

            //selecting the checkbox - sunday
            cy.get('input#sunday').check().should('be.checked')

            cy.wait(2000);
            //unselecting the checkbox - sunday
            cy.get('input#sunday').uncheck().should('not.be.checked')

            //select the checkbox - Tuesday
            cy.get('input#tuesday').check().should('be.checked')

            cy.wait(2000)

            cy.get('input#tuesday').click().should('not.be.checked')

            //selecting all checkbox by using common locators
            cy.get("input.form-check-input[type='checkbox']").check().should('be.checked')

            cy.wait(2000)

            cy.get("input.form-check-input[type='checkbox']").uncheck().should('not.be.checked')


            cy.wait(2000)
            // if i have 10 checkbox in that we need to select first or last checkbox
            //sunday
    cy.get("input.form-check-input[type='checkbox']").first().check().should('be.checked')

    cy.wait(2000)
    cy.get("input.form-check-input[type='checkbox']").last().check().should('be.checked')


            






        })








})