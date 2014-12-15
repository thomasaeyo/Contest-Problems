var fs = require('fs');

var input = process.argv;
var pathname = input[2];
var ext = input[3];

fs.readdir(pathname, function(err, list) {
	if(err) throw err;
	var output = [];
	for(var i = 0; i < list.length; i ++) {
		if(list[i].split('.')[1] == ext) {
			output.push(list[i]);
		}
	}
	console.log(output);
});
