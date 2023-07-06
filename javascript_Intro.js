console.log("Hellow World!")

let a = 4
let b = 23.5
let c = "String"
console.log(typeof(a))
console.log(typeof(b))
console.log(typeof(c))

//error when we redeclare let keyword (Identifier 'c' has already been declared).
// let c = a+b
// console.log(c)

//We can reassign a variable using let
c = a+b
console.log(c)

//We can redeclare and reassign using var keyword
var d = "It's me var"
console.log(d)
var d = "var variable"
console.log(d)
d = "var"
console.log(d)

var required = true
console.log(required)
console.log(!required) // Negation

//const
const flag = true
console.log(flag)

if(!flag)
{
    console.log("Inside if loop")
}else
{
    console.log("Inside else loop")
}

for(let i = 1; i<=5; i++)
{
    console.log(i)
}

var count = 0
while(flag)
{
    console.log("Hello")
    count++
    if(count == 5)
    {
        break
    }
}

let k = 0
do{
    k++
    console.log(k)
}while(k<5)

console.log('********************')

let value = Array(5)
var values = new Array(2,5,4,6,3)

var values = [4,3,6,9,7]
console.log(values)
console.log(values[2])
values[2] = 88
console.log(values[2])
console.log(values.length)

values.push(65)
console.log(values)

values.pop()
console.log(values)

values.unshift(12)
console.log(values)

console.log(values.indexOf(9))

console.log(values.includes(120))

console.log(values.slice(2,5))

for(let i = 0; i<values.length; i++)
{
    console.log(values[i])
}

console.log('*****************')

//sum of an array
var count = 0
for(let i = 0; i<values.length; i++)
{
    count = count+values[i]
    
}
console.log(count)

var sum = values.reduce((count,value) => count+value,0)
console.log("Using reduce(): "+sum)
console.log('*****************')

var scores = [48,71,36,91,52]
var newScores = []
for(var j = 0; j<scores.length; j++)
{
    if(scores[j]%2 == 0)
    {
        newScores.push(scores[j])
    }
}
console.log(newScores)
console.log('*****************')

//map
var ns = scores.filter(score => score%2 == 0)
console.log("Using filter(): "+ns)
let mapArray = ns.map(score => score*3)
console.log(mapArray)

//chaining
let newMap = scores.filter(score => score%2 == 0).map(score => score*3)
console.log(newMap)
console.log('*****************')

let fruits = ["Banana", "Jackfruit", "Apple", "Papaya"]
console.log(fruits.sort())
console.log(fruits.reverse())

//sort() will not work properly on numbers
let num = [26,56,35,003]
console.log(num.sort())
console.log(num.sort(function (a,b)
{
    return a-b // works as bubble sort
}))
//OR
console.log(num.sort((a,b) => a-b))
console.log(num.sort((a,b) => b-a)) // To reverse an array
console.log('*****************')

//function
function add(a,b)
{
    return a+b
}
var addition = add(2,3)
console.log(addition)

//Optimize way by using anonymous function
var addition = function(a,b)
{
   return a+b
}
console.log(addition(4,5))

//More Optimize way by using anonymous function and fact By operator
var addition = (a,b) => a+b
console.log(addition(2,9))

//Scope of the var keyword
var color = "Red"
if(true)
{
    var color = "pink"
}
function colour()
{
    var color = "purple"
}
console.log(color) //It will print Pink

//Scope of the let keyword
let color1 = "Red"
if(true)
{
    let color1 = "pink"
}
function colour()
{
    let color1 = "purple"
}
console.log(color1) //It will print Red
console.log('*****************')

//String
var str = "Tuesday "
console.log(str.slice(0,3))
console.log(str[2])

console.log(str.split("s"))
console.log(str.length)
console.log(str.trim().length)

let date = '23'
let newdate = '27'
let diff = parseInt(newdate) - parseInt(date)
console.log(diff)
console.log(typeof(diff))
console.log(typeof(toString(diff)))

//indexOf
var quote = str+"is funday"
console.log(quote.indexOf("day"))
console.log(quote.indexOf("day",5))
console.log('*****************')

var count = 0
var value1 = quote.indexOf("day")
while(value1!== -1)
{
    count++
    value1 = quote.indexOf("day",value1+1)
}
console.log(count)

//Object is a collection of properties
let person = {

    firstName: 'Neha',
    lastName: ' Patil',
    age: 30,
    fullName: function(){
        console.log(this.firstName+this.lastName)
    }
}

console.log(person.lastName)
console.log(person['lastName'])
person.firstName = 'Neha Ritwik'
console.log(person.firstName)
console.log(person.fullName())

person.gender = 'Female'
console.log(person)
console.log('gender' in person) //true

delete person.gender
console.log(person)
console.log('gender' in person) //false

for(let key in person)
{
    console.log(person[key])
}
console.log("******************")

//Classes
//module.exports = class persons // Export the class so that it can be accessible anywhere which imports it
class persons
{
    age = 24
   // location = "Australia"
    get location()
    {
       return "Australia"
    }// It's a property

    constructor(firstName,lastName)
    {
        this.firstName = firstName
        this.lastName = lastName
    }

    fullName() //method
    {
        console.log(this.firstName+this.lastName)
    }
}

let personObj = new persons()
console.log(personObj.age)
console.log(personObj.location)

let personObj1 = new persons("Kittu"," Nerkar")
console.log(personObj1.fullName())

class child extends persons
{
    // get location()
    // {
    //    return "Canada"
    // }

    // constructor(firstName,lastName)
    // {
    //     super(firstName,lastName)
    // }
}

let childObj = new child("Sam", " Roy")
console.log(childObj.location)
childObj.fullName()