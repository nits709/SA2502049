

    describe("Assertion Demo",()=>{

            // it("Implicit Asssertions",()=>{

            //  cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
            // //  cy.url().should('include','orangehrmlive') // check some part of string in URL.

            // //  //eq function checks the equality means end to end URl validation.
            // //  cy.url().should('eq','https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
            // //  cy.url().should('contain','orangehrm') // contain check some part of url.
            // //  cy.url().should('not.contain','greenehrm') // contain check some part of url.

            // cy.url().should('include','orangehrmlive')
            // .and('eq','https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
            // .and('contain','orangehrm')
            // .and('not.contain','greenehrm')
             



            // })


            // it("Implicit Asssertions on title",()=>{

            //     cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
            //    cy.title().should('eq','OrangeHRM')
            //    cy.title().should('include','Orange')
            //    cy.title().should('contain','HRM')
            //     // this checks the visiblity of an element
            //    cy.get('.orangehrm-login-branding > img').should('be.visible')
            //    .and('exist') // existence of an element.

            //    cy.get('a').should('have.length',5) // no. of links present over page.

            //    cy.get("input[name='username']").type("Admin")
            //    cy.get("input[name='username']").should('have.value',"Admin")
            //    })

        it("Explicit Assertion",()=>{
            cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
            cy.get("input[name='username']").type("Admin")
            cy.get("input[name='password']").type("admin123")
            cy.get("button[type='submit']").click();

            let expName = "Mr. user";
            cy.get(".oxd-userdropdown-name").then((strUserName)=>{
                        let actName =strUserName.text();// return the value from the DOM
                        cy.log("actName "+ actName);
                        //BDD Style
            // expect(actName).to.equal(expName)  // positive validation
            // expect(actName).to.not.equal("Mr. user123")  // negative validation
                        

            //TDD Style
            assert.equal(actName,expName) // positive validation
            assert.notEqual(actName,"Mr. user123") // negative validation

            })


        })



    })