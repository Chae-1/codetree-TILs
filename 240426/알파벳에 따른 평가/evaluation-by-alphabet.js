const fs = require("fs");

let s = fs.readFileSync(0).toString().trim();

if (s === "S") {
    console.log("Superior");
} else if (s === "A") {
    console.log("Excellent");
} else if (s === "B") {
    console.log("Good");
} else if (s === "C") {
    console.log("Usually");
} else if (s === "D") {
    console.log("Effort");
} else {
    console.log("Failure");
}