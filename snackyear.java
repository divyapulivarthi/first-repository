import java.util.*;
class snackyear{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-->0){
int x=in.nextInt();
if(x==2019||x==2010||x==2016||x==2015||x==2017)
System.out.println("HOSTED");
else
System.out.println("NOT HOSTED");
}
}

}