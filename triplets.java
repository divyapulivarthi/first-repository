import java.util.*;
import java.lang.*;
class triplets{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
int result=0;
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
 arr[i]=in.nextInt();
for(int i=0;i<n-2;i++){
 for(int j=i+1;j<n-1;j++){
  for(int k=j+1;k<n;k++){
    int count1=arr[j]*arr[k];
    int count2=arr[i]*arr[k];
    int count3=arr[j]*arr[i];
   if(count1==arr[i])
  result++;
if(count2==arr[j])
  result++;
if(count3==arr[k])
  result++;
 if(arr[i]==1&&arr[j]==1&&arr[k]==1)
 result-=2;
}
}
}



System.out.println(result);
}



}


}