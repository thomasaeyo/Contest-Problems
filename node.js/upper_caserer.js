var http = require('http');
var map = require('through2-map');

var server = http.createServer(function(request, response) {
	if (request.method != 'POST')
		return response.end(request.method + 'send POST method');
	request.pipe(map(function(chunk) {
		return chunk.toString.split('').reverse().join('');
	})).pipe(response);
});

server.listen(8000);