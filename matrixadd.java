import java.util.*;
public class matrixadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("For first matrix");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("For second matrix");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println(c[i][j]);
            }
        }
    }
}

