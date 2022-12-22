const solution = (n) => {
    if (n < 1 || n >= Math.pow(10, 4))
        return 0;

    if (n == 1) return 1;

    let term = n * n - (n -1);

    for (let i = 0; i < n; i++)
        term +=  (n - 1);
    
    return term;
}
