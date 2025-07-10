// for css filter the index  use attribute:nth-child(index), attribute:nth-of-type(index)
//div:nth-child(3) > div > div.single-products
describe("locator function",()=>{
    it('print no. of locator',()=>{
        cy.visit("https://automationexercise.com/products")
        cy.get('.single-products').then((elementCount)=>{
                cy.log("no. of products "+ elementCount.length); //34
                cy.log(elementCount.text)// return the text of all 34 element
              cy.log(elementCount.eq(3).text())  // 3 text 

              cy.log(elementCount.eq(3).find('p').text())
        })
    })


    it('print the text of element by using find and eq',()=>{

        cy.visit("https://automationexercise.com/products")
        cy.get('.single-products').should('have.length',34);
        cy.get('.single-products').eq(2).find('p').then((element)=>{
            cy.log(element.eq(1).text()); // 
        })

        cy.get('.single-products').eq(2).find('a').then((element)=>{
            cy.log(element.eq(1).text()); // 
        })

    

    })

    it('Child Function',()=>{

        cy.visit("https://automationexercise.com/category_products/3")
        cy.get('.features_items').children('div').should('have.length',7);
        cy.get('.features_items').children('h2').should('have.length',1);
    })

    it.only('filter',()=>{

        cy.visit("https://bootswatch.com/default")
        // cy.get('a').then((noOfLinks)=>{
        //  cy.log("Number of links present over page "+noOfLinks.text())
        //  cy.get('a').filter(':visible');
        // })

        cy.get('li').filter('.active');
    })






})