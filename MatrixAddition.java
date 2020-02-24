import java.util.*;


class MatrixAddition{


public static void main(String args[])
{

Scanner in=new Scanner(System.in);


System.out.println("enter first matrix m and n(with a space between them):");


int m1=in.nextInt();


int n1=in.nextInt();


System.out.println("enter first matrix elements:");


int arr1[][]=new int[m1][n1];


for(int i=0;i<m1;i++)


for(int j=0;j<n2;j++)


arr1[i][j]=in.nextInt();

 


System.out.println("enter second matrix m and n(with a space between them):");


int m2=in.nextInt();


int n2=in.nextInt();


System.out.println("enter second matrix elements:");


int arr2[][]=new int[m2][n2];


for(int i=0;i<m2;i++)


for(int j=0;j<n2;j++)


arr2[i][j]=in.nextInt();


if(m1==m2 && n1==n1){


int sum[][]=new int[m1][n1];


for(int i=0;i<m1;i++)

for(int j=0;j<n1;j++)


sum[i][j]=arr1[i][j]+arr2[i][j];


System.out.println("Sum of matrix1 and matrix2 is:");


for(int i=0;i<m1;i++){


for(int j=0;j<n1;j++)


System.out.print(sum[i][j]+"  ");


System.out.println();


}


}


else{


System.out.print("Matrices can't be added since they are of different sizes");


}

}

}