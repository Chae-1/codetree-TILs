const fs = require("fs");
let s = fs.readFileSync(0).toString().split("\n");
let a = Number(s[0]);
let b = Number(s[1]);

console.log((a+b).toFixed(2));