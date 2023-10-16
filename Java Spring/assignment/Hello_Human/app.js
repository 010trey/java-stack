    const express = require('express');
    const app = express();
    const port = 3000;

    app.get('/', (req, res) => {
    const name = req.query.name || 'human';
    const lastName = req.query.last_name || '';
    const times = parseInt(req.query.times) || 1;

    let greeting = `Hello, ${name}`;
    if (lastName) {
        greeting += ` ${lastName}`;
    }

    if (times > 1) {
        greeting = Array(times).fill(greeting).join('\n');
    }

    res.send(greeting);
    });

    app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
    });
