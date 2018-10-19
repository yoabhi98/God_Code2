import java.util.*;
public class Prime
{

     
public static void main(String []args)
{
  
int i;             
Scanner sc=new Scanner(System.in);

int num = sc.nextInt();
for(i=2;i<=num/2;i++)
{
if(num%i==0)
break;
}
if(i==num) 
System.out.println("prime");  
else
System.out.println("prime");    
}
}