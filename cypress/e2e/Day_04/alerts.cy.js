/*
Alerts in Cypress
1. Javascript alert : It will have some text and Ok button
2. JS confrimation alert : It will have some text and confirmation button.
3. Javascript prompt alert : it will have some text along with input field and ok and cancel button
4. Authentication alert.

Js alert : window:alert
confirmation alert- window:confirm
prompt - window:promt
*/

describe("handling alerts",()=>{
        it("javascript alert",()=>{

            cy.visit("https://the-internet.herokuapp.com/javascript_alerts");
            cy.get("button[onclick='jsAlert()']").click();


            cy.on('window:alert',(windowAlert)=>{
                    expect(windowAlert).to.contains('I am a JS Alert');
            })

            cy.wait(2000);
            cy.get('#result').should('have.text','You successfully clicked an alert');
        })
})