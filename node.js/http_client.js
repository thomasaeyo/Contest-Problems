var bl = require('bl');
var http = require('http')
var input = process.argv;
var url = input[2];

http.get(url, function(response) {
	response.pipe(bl(function (err, rawdata) {
		if (err) throw error;
		var data = rawdata.toString();
		console.log(data.length);
		//console.log(data);
	}))
});