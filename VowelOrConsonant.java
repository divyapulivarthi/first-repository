import java.util.*;
class VowelOrConsonant{

public static void main(String args[]){

Scanner in=new Scanner(System.in);
char alpha=in.next().charAt(0);
int i=0;
switch(alpha){
case 'A':i=1; break;
case 'E':i=1; break;
case 'I':i=1; break;
case 'O':i=1; break;
case 'U':i=1; break;
}
System.out.println((i==1)?"Vowel":"Consonant");

}}