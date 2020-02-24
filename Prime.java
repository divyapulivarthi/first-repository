import java.util.*;
import java.lang.*;
class Prime{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int m=in.nextInt();
int i=2;
long sq=Math.round(Math.sqrt(m))+1;
int count=0;
while(i<sq){
if(m%i==0)
 count++;
i++;
}
System.out.println((count==0)?"prime":"no");
}

}

}