import java.util.*;
public class Armstrong
{

     
public static void main(String []args)
{
  
int n=0,rem,result=0;           
Scanner sc=new Scanner(System.in);

int num = sc.nextInt();
int temp=num;
while(num>0)
{
num/=10;
n++;
}
num=temp;
while(num>0)
{
rem=num%10;
result+=Math.pow(rem,n);
num/=10;
}
if(result==temp)
System.out.println("yes");
else
System.out.println("no");
}
}