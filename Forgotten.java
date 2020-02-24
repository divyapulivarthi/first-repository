import java.util.*;
import java.lang.*;
class Forgotten{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int m=in.nextInt();
int p=in.nextInt();
String dict[]=new String[m];
for(int i=0;i<m;i++)
 dict[i]=in.next();
while(p-- >0){
int a=in.nextInt();
String pat[]=new String[a];
for(int i=0;i<a;i++)
 pat[i]=in.next();
 String result="";
 for(int i=0;i<a;i++){
  for(int j=0;j<m;j++)
   if(pat[i]==dict[j]){
   result="YES";
   System.out.println(result);
   break;
   }
   if(result!="YES")
    System.out.println("NO");
 }
 
}

}
}
}