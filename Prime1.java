import java.util.*;
public class Prime1
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int result=1;
int a = sc.nextInt();
int b = sc.nextInt();
for(++a;a<b;a++)
{
if(a%2!=0)
System.out.println(a);
}
System.out.println(" ");     
}
}