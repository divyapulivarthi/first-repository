import java.util.*;
class ChefMinMax{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){

int a=in.nextInt();
int b=in.nextInt();
System.out.println((a>b?a:b)+" "+(a+b));


}

}

}