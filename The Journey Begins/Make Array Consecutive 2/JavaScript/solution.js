const solution = statues => 
    [...Array(Math.max(...statues) +1).keys()]
        .filter(i => { if (i >= Math.min(...statues)) return i })
        .filter(x => ! statues.includes(x)).length;


console.log(solution([6, 2, 3, 8]));    // 3 -> 4, 5, 7
console.log(solution([0, 3]));          // 2 -> 1, 2
