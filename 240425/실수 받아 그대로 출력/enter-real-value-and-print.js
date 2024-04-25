const fs = require("fs");

let n = Number(fs.readFileSync(0));
console.log(n.toFixed(2));