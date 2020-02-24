import java.util.*;
import java.lang.*;
class TotalExpenses{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0) {
long quant=in.nextLong();
long price=in.nextLong();
double result=(quant*price);
if(quant>100){
result=result - (result/10);
}
System.out.println(String.format("%.6f",result));
}
}
}