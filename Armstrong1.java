import java.util.*;
public class Armstrong1
{

     
public static void main(String []args)
{
             
Scanner sc=new Scanner(System.in);

int num = sc.nextInt();
int high = sc.nextInt();
for(++num;num<high;num++)
{
int n=0,rem;
int temp=num,result=0;
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
System.out.print(result+" ");
num=temp;
}
}
}