
const add = (param1, param2) => {
    if (    -1000 <= param1 && param1 <= 1000 
        &&  -1000 <= param2 && param2 <= 1000) {
        return (param1 + param2);
    }

    throw new TypeError("The parameters do not satisfy the operation")
}

try {
    console.log(`Sum : ${add(100, 21)}`);
    console.log(`Sum : ${add(-1000, 1000)}`);
    console.log(`Sum : ${add(1000, -11000)}`);
} catch (e) {
    console.error(`${e}`)
}
