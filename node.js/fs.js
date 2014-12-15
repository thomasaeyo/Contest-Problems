var fs = require('fs');
var buf = fs.readFileSync('text.txt');
var str = buf.toString();
var lines = str.split('\n');
console.log(lines.length);
console.log(lines);