const fs = require("fs");

let a = Number(fs.readFileSync(0));
let b = a + 2;
console.log(b);