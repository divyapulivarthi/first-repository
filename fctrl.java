import java.util.*;
class fctrl{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
long n=in.nextLong();
long fact=1,count=0;
for(int i=1;i<=n;i++)
 fact*=i;
while(fact%10==0){
count++;
fact=fact/10;}
System.out.println(count);
}
}
}