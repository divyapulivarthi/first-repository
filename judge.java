import java.util.*;
class judge{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-- >0){
int n=in.nextInt();
int arr[]=new int[n];
int brr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
brr[i]=in.nextInt();
}
int count=0;
for(int i=0;i<n;i++){
if((brr[i]-arr[i])>5)
 count++;
}
System.out.println(count);
}

}

}