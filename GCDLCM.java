import java.util.*;
class GCDLCM{
public static long gcd(long a,long b){
 if(a==0||b == 0)
 return 0; 
   
 if(a==b)
 return a; 
 if(a>b) 
  return gcd(a-b, b); 
 return gcd(a, b-a); 
}
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
long n1=in.nextLong();
long n2=in.nextLong();
long mul=n1*n2;
if(n1<n2){
long temp=n1;
n1=n2;
n2=temp;
}
long g=gcd(n1,n2);
long lcm=mul/g;
 System.out.println(g+" "+lcm);
}

}

}