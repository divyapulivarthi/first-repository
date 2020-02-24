import java.util.*;
class nextPal{

public static boolean pal(int n){
boolean r;
int temp=0,check=n;
while(n>0){
temp=temp*10+(n%10);
n/=10;
}
if(check==temp)
 return true;
else
return false;
}

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-- >0){
int inp=in.nextInt();
boolean ch=false;
for(int l=inp+1;;l++){
ch=pal(l);
if(ch==true){
System.out.println(l);
break;
}
}


}
}

}