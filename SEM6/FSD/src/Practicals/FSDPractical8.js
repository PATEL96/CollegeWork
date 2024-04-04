// Import required modules
const express = require('express');
const session = require('express-session');

// Create an Express app
const app = express();
const PORT = 3001;

// Set up session middleware
app.use(session({
    secret: 'PATEL96', // Change this to a random string
    resave: false,
    saveUninitialized: true
}));

// Route to set session variable
app.get('/setSession', (req, res) => {
    req.session.username = 'Raj D. Patel';
    res.send('Session variable set');
});

// Route to get session variable
app.get('/getSession', (req, res) => {
    if (req.session.username) {
        res.send('Session variable username: ' + req.session.username);
    } else {
        res.send('Session variable username not set');
    }
});

// Route to destroy session
app.get('/destroySession', (req, res) => {
    req.session.destroy(err => {
        if (err) {
            console.error('Error destroying session:', err);
            res.send('Error destroying session');
        } else {
            res.send('Session destroyed');
        }
    });
});

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
