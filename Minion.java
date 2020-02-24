import java.util.*;
class Minion{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int m=in.nextInt();
int k=in.nextInt();
int count=0;
int arr[]=new int[m];
for(int i=0;i<m;i++){
arr[i]=in.nextInt();
arr[i]+=10;
if(arr[i]%7==0)
 count++;
}
System.out.println(count);
}
}
}