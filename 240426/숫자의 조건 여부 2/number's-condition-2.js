const fs = require("fs");
let a = Number(fs.readFileSync(0).toString().trim());
if (a == 5) {
    console.log("A");
} else if (a % 2 == 0) {
    console.log("B");
}