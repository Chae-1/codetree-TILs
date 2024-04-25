let feet = 9.2;
let mile = 1.3;

function feetToCm(feet) {
    return feet * 30.48;
}

function mileToCm(mile) {
    return 160934 * mile; 
}

console.log(feet + "ft = " + feetToCm(feet).toFixed(1) + "cm");
console.log(mile + "mi = " + mileToCm(mile).toFixed(1) + "cm");