

describe("read data",()=>{
it("from fixtures", ()=>{
   cy.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    cy.fixture('orangeHRM.json').then((data)=>{

        cy.get("input[name='username']").screenshot("Username");
        cy.get("input[name='username']").type(data.un);
        cy.get("input[name='password']").type(data.pwd).screenshot("password");
    })



})
})