const fs = require("fs");
let s = fs.readFileSync(0).toString().split("\n");

let a = Number(s[0]).toFixed(3);
let b = Number(s[1]).toFixed(3);
let c = Number(s[2]).toFixed(3);

console.log(`${a}\n${b}\n${c}`);