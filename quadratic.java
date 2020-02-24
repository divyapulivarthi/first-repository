import java.util.*;
import java.lang.*;
class quadratic{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();

double root1=0,root2=0;
long  d=Math.round(Math.sqrt((b*b)-4*a*c));
if(d==0){
root1= -(b/(2*a));
root2=root1;
}
else if(d>0){
root1=(-b + d)/(2*a);
root2=(-b -d)/(2*a);
}


System.out.println(root1+"\n"+root2);
}

}