import java.util.*;
class PuppySum{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
int output=0;
int d=in.nextInt();
int n=in.nextInt();
int temp=n;
for(int i=0;i<d;i++){
output=0;
 for(int j=1;j<=temp;j++){
 output+=j;
}
temp=output;
}
System.out.println(output);
}
}
}