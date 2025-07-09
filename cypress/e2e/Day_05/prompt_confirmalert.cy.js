// skip and only
import { slowCypressDown } from "cypress-slow-down";
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

//jsConfirm()
    it("confirmation js alert - Ok ",()=>{
       //slowCypressDown(2000)
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");
       // slowCypressDown(2000)
        cy.get("button[onclick='jsConfirm()']").click();
        //slowCypressDown(2000)
        cy.on('window:confirm',(windowConfirm)=>{
                expect(windowConfirm).to.contains('I am a JS Confirm');
        })
       // slowCypressDown(2000)
        cy.get('#result').should('have.text','You clicked: Ok');


    })


    it("confirmation alert with cancel",()=>{
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");
        cy.get("button[onclick='jsConfirm()']").click();
        cy.on('window:confirm',(windowConfirm)=>{
            expect(windowConfirm).to.contains('I am a JS Confirm');
       })

       // bydefault below event is true 
       cy.on('window:confirm',()=> false) //cypress closes the alert window using cancel button
       cy.get('#result').should('have.text','You clicked: Cancel');
    })

    // stub function use it to replace a built in browser function 
   // called (prompt() before click on ok or cancel button)
    it("prompt alert in js",()=>{
        cy.visit("https://the-internet.herokuapp.com/javascript_alerts");
        cy.window().then((win)=>{
                cy.stub(win,'prompt').returns('welcome')
        })

        cy.get("button[onclick='jsPrompt()']").click()
       // cy.on('window:confirm',()=> false) //cypress closes the alert window using cancel button
        cy.get('#result').should('have.text','You entered: welcome')

    })








   //approach-2 | https://username:password@the-internet.herokuapp.com/basic_auth
    it("Authenticated Alert",()=>{
        // cy.visit('https://the-internet.herokuapp.com/basic_auth',{auth: {username:"admin",
        //                                                                 password:"admin"
        //                                                                 }
        //                                                          }
                                                                
        //                                                         );
            cy.visit("https://admin:admin@the-internet.herokuapp.com/basic_auth")
        cy.get("div[class='example'] p").should('have.contain',"Congratulations!") ;                                                            
    })

    
})