var http = require('http')
var input = process.argv;
var url = input[2];

http.get(url, function(res) {
	console.log("Got response: " + res.statusCode);
	res.on('error', function(e) {
		console.log("Got error: " + e.message);
	});
	res.on('data', function(data) {
		console.log("Got data: ");
	});
});