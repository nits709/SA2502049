
//certain line of code executes mulitple time before each test runs
// before - this block of code run once before all test of describe
// after - this blocks of code run once after all test runs of describe block
// beforeeach - Runs before each test in the describe block 
//aftereach -  runs after each test in the describe block.

describe("handling hooks",()=>{

    before("launch browser ",()=>{
        cy.log(" launching browser")
    })

    beforeEach("Launch URL",()=>{
        cy.log("$$$$$$$$$$$$$$$$$$$$$$$$$$lunching URL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
    })

    afterEach("Closing URl",()=>{
        cy.log("$$$$$$$$$$$$$$$$$$$$$$$$$$Closing URL$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")      
    })

    it("seach product",()=>{

        cy.log("=================Searching the product=================")
    })


    it("select product from PLP",()=>{
        cy.log("=================select the product from PLP=================")
    })


    it("place product at checkout page",()=>{
        cy.log("================ checkout the product =================")
    })


    after("close the browser",()=>{
        cy.log("closing the browser")
    })

})