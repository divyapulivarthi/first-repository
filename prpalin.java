import java.util.*;
class prpalin{

public static boolean findPal(long n){
 long m=n,pal=0;
 while(m>0){
  pal=pal*10+m%10;
  m/=10;
 }
 if(pal==n)
   return true;
 else
  return false;
}

public static void main(String args[]){
 Scanner in=new Scanner(System.in);
 long n=in.nextLong();
 for(long i=n;;i++){
  int count=0;
  for(int j=2;j<=(i/2);j++){
   if(i%j==0){
    count++;
    break;
  }     
 }
if(count<1){
 boolean check=findPal(i);
 if(check==true){
  System.out.println(i);
  break;
 }
}
}
}

}