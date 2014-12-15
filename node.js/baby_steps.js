var input = process.argv;
var sum = function(input) {
	var output = 0
	for(var i = 2; i < input.length; i ++){
		output += Number(input[i]);
	}
	return output;
}
console.log("Sum: " + sum(input));