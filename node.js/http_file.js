var fs = require('fs');
var http = require('http');

var server = http.createServer(function(request, response) {
	var readStream = fs.createReadStream('text.txt');
	readStream.pipe(response);
});

server.listen(8000);