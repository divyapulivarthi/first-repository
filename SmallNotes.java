import java.util.*;
class SmallNotes{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int m=in.nextInt();
int count=0;
while(m>0){

 if(m>=100){
   count=m%100;
   m=m- (count*100);
 }
 else if(m<100 && m>=50){
  count=m%50;
  m=m- (count*50);
 }
else if(m<50 && m>=10){
count=m%10;
m=m- (count*10);
}
else if(m<10 && m>=5){
count=m%5;
m=m- (count*5);
}
else if(m<5 && m>=2){
count=m%2;
m=m- (count*2);
}
else if(m==1){
count=m%1;
m=m- (count*1);
}
else
 continue;

}
System.out.println(count);

}


}

}