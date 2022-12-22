#include <stdio.h>
#include <stdlib.h>

int add (int, int);

int
main(int argc, char *argv[])
{
    int result = add(100, 32);

    printf("Solution %d\n", result);

    return 0;
}

int
add (int param1, int param2)
{
    return param1 + param2;
}
