var http = require('http');
var bl = require('bl');
var input = process.argv;
var url_1 = input[2];
var url_2 = input[3];
var url_3 = input[4];

var queue = [];

var async = require('async');


/*
queue = [url_1, url_2, url_3];
console.log(queue);
async.each(queue, function(url, callback) {
	http.get(url, function(response) {
		response.pipe(bl(function(err, rawdata) {
			if(err) throw err;
			console.log(url + ": " + rawdata.toString().length);
		}));
	})}, function(err) {
	if(err) throw err;
});
*/

/*
async.series([
	function(callback){
		console.log("A");
		http.get(url_1, function(response) {
			response.pipe(bl(function(err, rawdata) {
				if (err) throw err;
				console.log("url_1: " + rawdata.toString().length);
				callback();
			}))
		});
	},
	function(callback){
		http.get(url_2, function(response) {
			response.pipe(bl(function(err, rawdata) {
				if (err) throw err;
				console.log("url_2: " + rawdata.toString().length);
				callback();
			}))
		});
	},
	function(callback){
		http.get(url_3, function(response) {
			response.pipe(bl(function(err, rawdata) {
				if (err) throw err;
				console.log("url_3: " + rawdata.toString().length);
				callback();
			}))
		});
	}], function(err, data) {
			if (err) throw err;
	}
);
*/
/*
http.get(url_1, function(response) {
	response.pipe(bl(function(err, rawdata){
		if(err) throw err;
		console.log("url_1: "+rawdata.toString().length);
		queue.push('url_1');
		if(queue.length == 3) {
			console.log(queue);
		}
	}))
})

http.get(url_2, function(response) {
	response.pipe(bl(function(err, rawdata){
		if(err) throw err;
		console.log("url_2: "+rawdata.toString().length);
		queue.push('url_2');
		if(queue.length == 3) {
			console.log(queue);
		}
	}))
})

http.get(url_3, function(response) {
	response.pipe(bl(function(err, rawdata){
		if(err) throw err;
		console.log("url_3: "+rawdata.toString().length);
		queue.push('url_3');
		if(queue.length == 3) {
			console.log(queue);
		}
	}))
})
*/



