const http = require('http')
const PORT = 3001

http.createServer(function (req, res) {
	res.end("Hello World.")
}).listen(PORT, () => {
	console.log("startred")
});