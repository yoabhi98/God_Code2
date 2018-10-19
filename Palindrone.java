import java.util.*;
public class Palindrone
{

     
public static void main(String []args)
{
               
Scanner sc=new Scanner(System.in);

int rem,result=0;
int num = sc.nextInt();
int x=num;
while(num>0)
{
rem=num%10;
result=result*10+rem;
num/=10;
}
System.out.println(result);
if(result==x) 
System.out.println("yes");
else
System.out.println("no");    
}
}