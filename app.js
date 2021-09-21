const readline = require("readline");
var st = 0;
var temp1 = 0;
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
rl.question("What is the name of the article? ", function (answer) {
    var arr = answer.split(' ');
    for (let j = 0; j < 3; j++) {
        st = 0;
        for (let i = 0; i < arr.length; i++) {
        var temp = arr[i].length;
        
        if (temp > st) {
            temp1 = i;
            st = temp;
        }
        }
    if (j == 0) {
        var string = "[\"#" + arr[temp1] + "]\", ";
        arr[temp1] = "";
        }
    else if (j < 2) {
        string += "[\"#" + arr[temp1] + "]\", ";
        arr[temp1] = "";
    }
    else {
        string += "[\"#" + arr[temp1] + "\"]";
    }
    
    }
    console.log(string);
});