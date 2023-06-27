describe('Asserions', function(){
    it('Positive Assertions', function(){
        //length
        cy.visit("https://rahulshettyacademy.com/seleniumPractise/#/")
        cy.get('.search-keyword').type("ca")
        cy.wait(2000)

        cy.get('.product:visible').should('have.length',4)
        cy.get('h4.product-name').eq(2).should('have.value','')
        cy.get('.product-image').eq(2).should('have.class',"product-image")
        //Text Content
        cy.get('.product-action').eq(2).should('have.text',"ADD TO CART")
        cy.get('.product-action').eq(2).should('include.text',"CART")
        //Visibility
        cy.get('.product-action').eq(2).should('include.text',"CART").should('be.visible')
        //Existence
        cy.get('.product-action').eq(2).should('include.text',"CART").should('exist')
        //State
        cy.get('button:visible').eq(3).should('include.text',"CART").should('be.enabled')

       //cy.get('.product-action').eq(2).should('have.css',"CART")
    })
})