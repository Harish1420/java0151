import java.util.*;
class rectangle
{
public static void main(String[]args)
{
int n,m,i,j;
Scanner sc=new Scanner(System.in);
System.out.print(" Please Enter Number of Rows : ");
n = sc.nextInt();	
System.out.print(" Please Enter Number of Columns : ");
m = sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=m;j++)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}		