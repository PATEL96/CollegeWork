const path = require('path');
const fs = require('fs');
const os = require('os');
const util = require('util');

// Create a directory path
const dirPath = path.join(__dirname, 'myFolder');

// Create a file path
const filePath = path.join(dirPath, 'myFile.txt');

// Check if the directory exists, if not, create it
if (!fs.existsSync(dirPath)) {
    fs.mkdirSync(dirPath);
}

// Write some content to the file
const writeFilePromise = util.promisify(fs.writeFile);
writeFilePromise(filePath, 'Hello, world!')
    .then(() => {
        console.log('File written successfully');
    })
    .catch((err) => {
        console.error('Error writing file:', err);
    });

// Read the content of the file asynchronously
const readFilePromise = util.promisify(fs.readFile);
readFilePromise(filePath, 'utf8')
    .then((data) => {
        console.log('File content:', data);
    })
    .catch((err) => {
        console.error('Error reading file:', err);
    });

// Get information about the operating system
console.log('Operating system information:');
console.log('Platform:', os.platform());
console.log('Architecture:', os.arch());
console.log('Home directory:', os.homedir());
console.log('Total memory (bytes):', os.totalmem());

// Print memory usage information
console.log('Memory usage information:');
console.log('Total memory (bytes):', os.totalmem());
console.log('Free memory (bytes):', os.freemem());
console.log('Percentage of free memory:', (os.freemem() / os.totalmem()) * 100 + '%');