import java.util.*;
class largest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter first value:");
int a=s.nextInt();
System.out.println("enter second value:");
int b=s.nextInt();
System.out.println("enter third value:");
int c=s.nextInt();
if(a>=b &&a>=c)
{
System.out.println(" A is greater");
}
else if (b>=c&&b>=a)
{
System.out.println("b is greater");
}
else
{
System.out.println( "c is greater");
}
}
}
