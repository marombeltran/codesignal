#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int
century (int year) 
{
    int century = 1;

    if (year > 100) {
        century = year % 100 == 0 ? floor(year / 100) : floor(year / 100) +1;
    }

    return century;
}

int
main (int argc, char *argv[])
{

    if ( argc <= 1 ) {
        printf ("You did not feed me arguments, I will die now ..\n");

        exit (1);
    }

    int year = atoi (argv[1]);

    if ( year < 1 || year > 2005 ) {
        printf ("The parameters not satisfy the calculus, I will die now ..\n");

        exit (1);
    }


    printf ("Year %d, century : %d\n", year, century(year));

}
