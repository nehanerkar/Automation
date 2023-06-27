/// <reference types = "Cypress" />
/// <reference types = "Cypress-iframe" />
import "cypress-iframe"
let input

before(function(){
    cy.fixture('example').then(function(data)
    {
        input = data
    })
})

// describe('Handling Invisible Elements', function()
// {
//     it(':visible', function()
//     {
//         cy.visit("https://rahulshettyacademy.com/seleniumPractise/#/")
//         cy.get('.search-keyword').type("ca")
//         cy.wait(2000)

//         cy.get('.product:visible').should('have.length',4)
//         //Parent-Child chaining
//         cy.get('.products').as('productsLocator')
//         cy.get('@productsLocator').find('.product').should('have.length',4)
//         cy.get('@productsLocator').find('.product').eq(3).contains('ADD TO CART').click()

//     })
// })

// describe('Resolve promises using then()', function()
// {
//     it('then()', function()
//     {
//         cy.visit("https://rahulshettyacademy.com/seleniumPractise/#/")
//         cy.get('.search-keyword').type("ca")
//         cy.wait(2000)

//         // const text = cy.get('.brand').text() is not possible as text() is not a cypress command, 
//         //it is a Jquery method and hence we can not use text() directly
//         cy.get('.brand').then(function(pName) {
//         cy.log(pName.text())

//         })
//     })
// })

describe('Get text for validations using each()', function()
{
    it('each()', function()
    {
        cy.visit("https://rahulshettyacademy.com/seleniumPractise/#/")
        cy.get('.search-keyword').type("ca")
        cy.wait(2000)

        // cy.get('.products').find('.product').each(($el,index,$list) => {

        //     const productName = $el.find('h4.product-name').text()

        //     if(productName.includes('Capsicum'))
        //     {
        //         cy.wrap($el).find('button').click()
        //     }
        // })

        //Using custom command
        cy.selectProduct('Capsicum')

        //Using parameterized test data- forEach() of javascript
        input.productNames.forEach(function(element)
        {
            cy.selectProduct(element)
        })

        cy.get('.cart-icon > img').click()
        cy.contains('PROCEED TO CHECKOUT').click()
        cy.contains('Place Order').click()
    })
})

describe('Validating checkboxes', function()
{
    it('Checkbox', function()
    {
        cy.visit("https://www.rahulshettyacademy.com/AutomationPractice/")
        //should('be.checked')- Behavioural Assertions
        //should('have.value')- Camapision Assertions
        cy.get('#checkBoxOption1').check().should('be.checked').and('have.value',"option1")
        cy.wait(2000)

        cy.get('#checkBoxOption1').invoke('attr','value').then(function(text){
            cy.log(text)
        })
        
        //other way for same validation
        cy.get('#checkBoxOption1').should('have.attr','value','option1')

        cy.get('#checkBoxOption1').uncheck().should('not.be.checked')
        //For debugging
        cy.pause()
        cy.get('input[type="checkbox"]').check(['option2','option3'])
        cy.wait(2000)

    })
})

// describe('Validating dropdowns', function()
// {
//     beforeEach('URL', function(){
//         cy.visit("https://www.rahulshettyacademy.com/AutomationPractice/")
//     })

//     it('Static dropdown', function()
//     {
//         cy.get('select').select('option2')
//         cy.wait(2000)
//     })

//     it('Dynamic dropdown', function()
//     {
//         cy.get('#autocomplete').type('ind')
//         cy.get('.ui-menu-item').each(($el,index,$list) =>{
//             const value = $el.text()

//             if(value === 'India')
//             {
//                 cy.wrap($el).click()
//             }
//         })
//     })
// })

describe('Validating radio buttons', function()
{
    it('Radio buttons', function()
    {
        cy.visit("https://www.rahulshettyacademy.com/AutomationPractice/")
        // We can skip the tagname in css selector
        cy.get('[value="radio1"]').check().should('be.checked').debug()
    })

})

// describe('Validating alerts', function()
// {
//     it('Alerts', function()
//     {
//         cy.visit("http://qaclickacademy.com/practice.php")
//         cy.on('window:alert',(str)=>
//         {
//             //Mocha
//             expect(str).to.equal('Hello , share this practice page and share your knowledge')
//         })
         
//         cy.on('window:confirm',(str)=>
//         {
//             //Mocha
//             expect(str).to.equal('Hello , Are you sure you want to confirm?')
//         })

//         cy.get('#opentab').invoke('removeAttr','target').click()
//         cy.wait(3000)
//         cy.url().should('include','qaclickacademy')
//         cy.wait(2000)
//         cy.go('back')
//     })

// })

// describe('Validating web table', function()
// {
//     it('Web Table', function()
//     {
//         cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
 
//         cy.get('tr td:nth-child(2)').each(($e1, index, $list) => {
         
//             const text=$e1.text()
//             if(text.includes("Python"))
//             {
         
//                 cy.get("tr td:nth-child(2)").eq(index).next().then(function(price)
//                 {
//                  const priceText =  price.text()
//                  expect(priceText).to.equal('25')
//                 })
//             }
         
//         })
         
//     })

// })

// describe('Handling Mouse Hover', function()
// {
//     it('show()', function()
//     {
//         cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
 
//         cy.get('.mouse-hover-content').invoke('show')
//         cy.contains('Top').click()
//         cy.wait(1000)
//         cy.url().should('include','top')
         
//     })
// })

// describe('Handling Child Windows', function()
// {
//     it('Prop(), origin()', function()
//     {
//         cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
 
//         cy.get('#opentab').then(function(el){
//             const url = el.prop('href')
//             cy.visit(url)
//             cy.wait(2000)
//             cy.origin(url, function()
//             {
//                 cy.get('div.sub-menu-bar a[href*="about"]').click()
//             })
//         })
         
//     })
// })

describe('Handling iframes', function()
{
    it('frameLoaded(), Iframe()', function()
    {
        cy.visit("https://rahulshettyacademy.com/AutomationPractice/")
        cy.frameLoaded('#courses-iframe')
        cy.iframe().find('a[href*="mentorship"]').eq(0).click()
    })
})