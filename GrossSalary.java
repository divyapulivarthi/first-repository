import java.util.*;
class GrossSalary{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){
long bs=in.nextLong();
double gs;
if(bs<1500){
gs= bs + (bs/10) + (9*bs)/10 ;
}
else
 gs=bs +500 + (98*bs)/100;
 
 System.out.println(gs);
}

}

}