import java.util.Scanner;
class poly
{
void poly()
{
int a=1,b=2;
System.out.println(a+b);
}
}
class poly1 extends poly
{
void poly()
{
int a=1,b=2,c=3;
System.out.println(a+b+c);
}
public static void main(String args[])
{
poly1 o=new poly1();
}
}