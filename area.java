// area of square


#include<stdio.h>
#include<stdlib.h>
#define PI 3.14
int main(int argc, char *argv[])
{
    float dia,rad,area=0;
    dia=atoi(argv[1]);
  rad=0.5*dia;
  area=(PI*rad*rad);
  printf("%0.2f", area);
 return 0; 
}
