#include <stdio.h>

int main()
{
    int i, n, sum=0;
    scanf("%d", &n);

    /* Find sum of all numbers */
    for(i=1; i<=n; i++)
    {
        sum += i;
    }

    printf("%d",sum);

    return 0;
}