const fs = require("fs");

let n = Number(fs.readFileSync(0))* 30.48;
console.log(n.toFixed(1));