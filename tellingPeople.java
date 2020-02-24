import java.util.*;
class tellingPeople{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
int output=0;
int n=in.nextInt();
long arr[]=new long[n];
for(int i=0;i<n;i++)
 arr[i]=in.nextInt();
long temp=n,count=0;

for(int i=0;i<n;i++){
temp=temp-arr[i];
output++;
if(temp<=0)
 break;
}

System.out.println(output);
}

}

}