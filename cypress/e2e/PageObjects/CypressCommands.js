class cmds
{
    getEditBox(){
        return cy.get('.search-keyword')
    }

    getProducts(){
        return cy.get('@productsLocator').find('.product')
    }
}
export default cmds;