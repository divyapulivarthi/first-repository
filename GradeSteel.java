import java.util.*;

class GradeSteel{

public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
int h=in.nextInt();
double c=in.nextDouble();
int t=in.nextInt();
int val=0;
if(h<=50 && c>=0.7 && t<=5600)
 val=5;
else {
if(h>50 && c<0.7 && t>5600)
 val=10;
else if(h>50 && c<0.7 && t<=5600 )
 val=9;
else if(h<=50 && c<0.7 && t>5600)
 val=8;
else if(h>50 && c>=0.7 && t>5600)
 val=7;
else
 val=6;
}
System.out.println(val);
}

}

}