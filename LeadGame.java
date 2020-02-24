import java.util.*;
class LeadGame{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
int brr[]=new int[n];
int t1=0,t2=0;
for(int i=0;i<n;i++){
arr[i]=in.nextInt();
brr[i]=in.nextInt();

if(arr[i]>brr[i])
 t1+=arr[i]-brr[i];
else
 t2+=brr[i]-arr[i];

}
if(t1>t2)
 System.out.println(1+" "+t1);
else
 System.out.println(2+" "+t2);

}}