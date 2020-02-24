import java.util.*;
import java.lang.*;
class SmallFactorial{

private static BigInteger fact(long n) {
    BigInteger result = BigInteger.ONE;
    for (long i = 2; i <= n; i++)
        result = result.multiply(BigInteger.valueOf(i));
    return result;
}
public static void main(String args[]){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-- >0){

int m=in.nextInt();
BigInteger fact = fact(m);
System.out.println(fact);

}
}

}