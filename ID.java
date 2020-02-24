import java.util.*;
class kattappa{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int arr[n];
for(int i=0;i<n;i++)
 arr[i]=in.nextInt();
int i=0,even=0,odd=0;
while(i<n){
if(arr[i]%2==0)
 even++;
else 
 odd++;
i++;
}
if(even<=odd)
 System.out.println("NOT READY");
else
 System.out.println("READY FOR BATTLE");
}

}