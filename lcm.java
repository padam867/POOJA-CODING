// lcm of a number

#include<stdio.h>
#include<stdlib.h>
int main(int argc, char *argv[])
{
  int n,a,b,large;
  a=atoi(argv[1]);
  b=atoi(argv[2]);
  if(a>b)
  {
      large=a;
  }
  else
  large=b;
  while(1)
  {
      if((large%a==0) && (large%b==0))
      {
          printf("%d",large);
          break;
      }
      large++;
      
  }
  return 0;
}