import java.util.*;
public class Power
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int result=1;
int a = sc.nextInt();
int b = sc.nextInt();
while(b>0)
{
result*=a;
b--;
} 
System.out.println(result);     
}
}