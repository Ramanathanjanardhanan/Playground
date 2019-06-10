#include<stdio.h>

int main()
{
    int input, firstNumber, lastNumber;
    scanf("%d", &input);

    /*
        gives remainder when the input value is divided by 10 
        i.e. the digit at units place
    */
    lastNumber = input%10;
    
    firstNumber = input;

    while(firstNumber >= 10)
    {
        firstNumber /= 10;  // same as firstNumber = firstNumber/10
    }

    printf("%d\n",firstNumber+lastNumber);
    return 0;
}
    