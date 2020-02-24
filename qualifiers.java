import java.util.*;
class qualifiers{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int len=in.nextInt();
int k=in.nextInt();
long arr[]=new long[len];
for(int i=0;i<len;i++)
 arr[i]=in.nextInt();
Arrays.sort(arr);
long temp=0;
int count=0; 
for(int i=len-1;i>=0;i--){
if(k>0){
temp=arr[i];
k--;
}
}
for(int j=len-1;j>=0;j--){
if(arr[j]>=temp)
 count++;
else break;
}
System.out.println(count);
}

}

}