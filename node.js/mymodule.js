module.exports = function(numbers) {
	var output = 1;
	console.log(numbers);
	for(var i = 0; i < numbers.length; i++) {
		output *= Number(numbers[i]);
	}
	return output
}