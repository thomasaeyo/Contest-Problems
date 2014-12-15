var net = require('net');
var input = process.argv;
var server = net.createServer(function (socket) {
	console.log('server connected');
	socket.end('server disconnected');
});
server.listen(Number(input[2]));

/*
var date = new Date();
var year = date.getFullYear();
var month = date.getMonth();
var day = date.getDate();
var hour = date.getHours();
var min = date.getMinutes();
console.log(year+"-"+month+"-"+day+" "+hour+":"+min);
*/
