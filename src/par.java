import java.util.Scanner;
 class matrixsubstraction{
    public static void main (String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROW LIMIT");
        a=sc.nextInt();
        System.out.println("ENTER THE COLOUM LIMIT");
        b=sc.nextInt();
        int array1[][]=new int[a][b];
        int array2[][]=new int[a][b];
        int sub[][]=new int[a][b];
        System.out.println("enter the elements in the first array");
        for(int i=0;i<a;i++)      {
            for(int j=0;j<b;j++){
                array1[i][j]=sc.nextInt();
                if(j==b-1&&i!=a-1){
                    System.out.println("enter next row");
                }
            }
        }
        System.out.println("enter the elements in the second array");
        for(int k=0;k<a;k++){
            for(int l=0;l<b;l++){
                array2[k][l]=sc.nextInt();
                if(l==b-1&&k!=a-1){
                    System.out.println("enter next row");
                }
            }
        }
        for(int m=0;m<a;m++){
            for(int n=0;n<b;n++){
                sub[m][n]= array1[m][n]-array2[m][n];
            }
        }
        for(int o=0;o<a;o++){
            for(int p=0;p<b;p++){
                System.out.print(sub[o][p]+" ");

            }
            System.out.println("");
        }
    }
}

