import java.util.*;
class urcalc{
public static void main(String args[]){

Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
char ch=in.next().charAt(0);
int result=0;
switch(ch){
case '+': result=a+b;break;
case '-': result=a-b; break;
case '/': result=a/b; break;
case '*': result=a*b; break;
}
System.out.println(result);
}

}