import java.util.*;

class chefCook{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
int m=in.nextInt();
long temp;
while(m-- >0){
long ch=in.nextLong();
long co=in.nextLong();
long k=in.nextLong();
temp=0;
long sum=ch+co;
temp=sum%(2*k);


if(temp<=k/2)
 System.out.println("CHEF");
else 
 System.out.println("COOK");
 


}

}
}