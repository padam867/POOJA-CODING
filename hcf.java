// hcf of a number


#include<stdio.h>
#include<stdlib.h>
int main(int argc, char* argv[])
{
    int a,b,small;
    a=atoi(argv[1]);
     b=atoi(argv[2]);
     if(a>b)
     small=b;
     else
     small=a;
         for(int i=small;i>=1;i--)
         {
           if((a%i==0) && (b%i==0))
           {
               printf("%d",i);
               break;
         }
     }
return 0;
}







