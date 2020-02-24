import java.util.*;
class primecount{

public static void main(String args[]){
long a=2;
long count=2;
while(a<2000000){
a++;
long i=2;
long comp=0;
while(i<a){
if(a%i==0)
 comp++;
i++;
}
if(comp==0)
 count+=a;
}
System.out.println(count);
}

}