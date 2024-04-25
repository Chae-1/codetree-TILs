const fs = require("fs");
let s = fs.readFileSync(0).toString().split("\n");
console.log(Number(s[0]));
console.log(Number(s[1]));