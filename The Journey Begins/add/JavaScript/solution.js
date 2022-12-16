
const add = (param1, param2) => {
    if (    -1000 <= param1 && param1 <= 1000 
        &&  -1000 <= param2 && param2 <= 1000) {
        return (param1 + param2);
    }


   console.log(`The parameter#s do not meet the condition -1000 <= param# <= 1000`); 
}

console.log(add(100, 21));
