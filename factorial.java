import java.io.*;
import java.util.*;
public class factorial
{
public static void main(String args[])
{
int fact=1;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}

