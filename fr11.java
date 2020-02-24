import java.util.*;
class fr11{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-->0){
int x=in.nextInt();
int count=0;
while(x>0){
if(x>=1000000){
 x-=1000000;
 count++;
}
else if(x>=250000){
 x-=250000;
 count++;
}
else if(x>=100000){
 x-=100000;
 count++;
}
else if(x>=10000){
 x-=10000;
 count++;
}
else if(x>=2500){
 x-=2500;
 count++;
}
else if(x>=1000){
 x-=1000;
 count++;
}
else if(x>=100){
 x-=100;
 count++;
}
else if(x>=25){
 x-=25;
 count++;
}
else if(x>=10){
 x-=10;
 count++;
}
else if(x>=1){
 x-=1;
 count++;
}
}
System.out.println(count);
}

}

}