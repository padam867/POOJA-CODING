//wipattern
import java.util.*;
class p4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d,cnt=1;
		for(int i=1;i<=n;i++)
		    {
			d=i;
			for(int j=1;j<=i;j++)
			{
					if((j==1) && (i%2==0))
						{
						d=cnt+i-1;
						}
							if(i%2==1)
								{
								if(j<i)
									System.out.print(cnt+"*");
								else
									System.out.print(cnt);
								}
							else
								{
								if(j>1)
									System.out.print("*" +d);
								else
									System.out.print(d);
								d--;
								}
					cnt++;
					}
			System.out.println();
		}
}
}