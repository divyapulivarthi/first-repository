import java.util.*;
class typing{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int m=in.nextInt();
while(m-->0){
int n=in.nextInt();
String str[]=new String[n];
int countn[]=new int[n];
for(int i=0;i<n;i++){
 str[i]=in.next();
countn[i]=2;
}

for(int i=0;i<n;i++){
 int len=str[i].length();
 for(int j=0;j<len-1;j++){
  char ch1=str[i].charAt(j);
  char ch2=str[i].charAt(j+1);
  if(ch1=='d'||ch1=='f'){
   if(ch2=='d'||ch2=='f')
    countn[i]+=4;
   else
  countn[i]+=2;
}
else{
  if(ch2=='d'||ch2=='f')
   countn[i]+=2;
  else
   countn[i]+=4;
 }
}
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
 if(str[i].equals(str[j])){
 countn[j]=countn[i]/2;
}
}
}
int count=0;
for(int i=0;i<n;i++)
count+=countn[i];
System.out.println(count);
}
}
}