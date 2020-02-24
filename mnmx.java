import java.util.*;
class mnmx{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-->0){
int len=in.nextInt();
long arr[]=new long[len];
for(int i=0;i<len;i++)
 arr[i]=in.nextLong();
long count=0,temp=arr[0];
for(int i=0;i<len-1;i++){
if(temp<=arr[i+1]){
count+=temp;
}
else{
temp=arr[i+1];
count+=temp;
}
}
System.out.println(count);


}
}

}