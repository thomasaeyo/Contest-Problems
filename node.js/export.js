var input = process.argv;
var mymodule = require('./mymodule.js');
input.splice(0,2);
console.log(mymodule(input));