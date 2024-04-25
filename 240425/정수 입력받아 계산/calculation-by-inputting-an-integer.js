const fs = require("fs");

let a = Number(fs.readFileSync());
console.log(a * 2 + 3);