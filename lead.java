import java.util.*;
class lead{

public static void main(String args[]){

 Scanner in=new Scanner(System.in);
 int m=in.nextInt();
 int arr[]=new int[m];
 int brr[]=new int[m];
 int result[][]=new int[m][2];
 int count=0,diff=0, temp=0,a=0,b=0;
 for(int i=0;i<m;i++){
 arr[i]=in.nextInt();
 brr[i]=in.nextInt();
 }

for(int i=0;i<m;i++)
{
 if(arr[i]>brr[i]){
 a+=arr[i];
 result[i][0]=1;
 result[i][1]=arr[i]-brr[i];
}
else if(arr[i]<brr[i]){
  b+=brr[i];
  result[i][0]=2;
  result[i][1]=brr[i]-arr[i];
 }

}

if(a>b){
count=1;
for(int i=0;i<m;i++)
  if(result[i][0]==1)
     temp=result[i][1];
 if(diff<temp)
   diff=temp;
}

else{
count=2;
for(int i=0;i<m;i++)
  if(result[i][0]==2)
     temp=result[i][1];
 if(diff<temp)
   diff=temp;
}

System.out.println(count+" "+diff);


}

}