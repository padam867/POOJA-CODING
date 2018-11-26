/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************/
import java.util.*;
class ss
{
void print(int s,int n)
{
    while(s<=5)
    {
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(s);
    }
    s++;
    System.out.println();
}
s=s-2;


for(int i=n-1;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(s);
    }
    s--;
    System.out.println();
}

s+=2;
}
}
public static void main(String args[])
{
 ss obj=new ss();
 obj.print(3,4);
}
}