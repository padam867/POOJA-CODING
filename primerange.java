#include<stdio.h>
int main(int argc, char *argv[])
{
int n1,n2,count,lower,upper,sum=0;
n1=atoi(argv[1]);
lower=n1+1;
n2=atoi(argv[2]);
upper=n2;
for(int i=lower;i<upper;i++)
{
count=1;
for(int j=2;j<=i/2;j++)
{
    if(i%j==0)
        count++;
}
if(count==1)
{
    sum=sum+i;
}
}
printf("%d",sum);
return 0;
}

//print prime number between given range
