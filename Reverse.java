import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string:");
String s=sc.nextLine();
char c[]=s.toCharArray();
int r=s.length();
for(int i=r-1;i>=0;i--)
{
System.out.print(c[i]);
}
}
}