#include<stdio.h>
int main()
{
int l=6,w=9,peri,area;
  scanf("%d",&l,&w);
  peri =2*(l+w);
  area=l*w;
  printf("The perimeter of the rectangle is: %d cm",peri);
  printf("\nThe area of the rectangle is: %d sq cm",area);
  return 0;
}