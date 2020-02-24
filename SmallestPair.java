import java.util.*;
class SmallestPair{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int l=in.nextInt();
int arr[]=new int[l];
for(int i=0;i<l;i++)
 arr[i]=in.nextInt();
Arrays.sort(arr);
System.out.println(arr[0]+arr[1]);

}
}

}