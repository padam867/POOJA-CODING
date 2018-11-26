// square root of prime number

#include <stdio.h>
#include<math.h>
int main(int argc, char *argv[])
{
    
    int n,i,c=0;
    if(argc!=2)
    exit(1);
    n=atoi(argv[1]);
    float sq=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        c++;
    }
    if(c==2)
    {
      sq=sqrt(n);
      printf("%0.2f",sq);
    }
    else
    {
    printf("%0.2f" ,sq);
    }
    return 0;
    }
    

          