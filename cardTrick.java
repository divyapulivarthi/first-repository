import java.util.*;
class cardTrick{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
int n=in.nextInt();
int count=0;
int arr[]=new int[n];
int brr[]=new int[n];
for(int i=0;i<n;i++)
 arr[i]=in.nextInt();
for(int i=0;i<n-3;i++){
brr[i]=arr[i+3];
}
brr[n-3]=arr[0];
brr[n-2]=arr[1];
brr[n-1]=arr[2];
Arrays.sort(arr);
for(int i=0;i<n;i++)
 if(arr[i]==brr[i])
   count++;
else
 break;
if(count==n)
System.out.println("YES");
else
System.out.println("NO");

}

}

}