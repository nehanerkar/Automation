const { defineConfig } = require("cypress");
const cucumber = require("cypress-cucumber-preprocessor").default;
module.exports = defineConfig({

  //Default timeout of cypress is 4000
  defaultCommandTimeout: 3000,
  env: {
    url: "https://rahulshettyacademy.com"
  },
  retries: {
    runMode: 1  // It will run the failed test case again
  },
 
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
     
    },
    specPattern: 'cypress/e2e/*.js' ,
  },
});
