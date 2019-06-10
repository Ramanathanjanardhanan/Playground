#include<stdio.h>
int main()
{
  //Type your code here
  int num;
  scanf("%d",&num);
 int numr=num%10;
  int numq=num/10;
  numq+numr;
  printf("%d",(numq+numr));
  return 0;
}