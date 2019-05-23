package processor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    Scanner in = new Scanner(System.in);

    public void run(){
        while(true){
            int v = showMenu();
            if(v == 0){
                break;
            }
            if(v == 1){
                sum();
            }
            if(v == 2){
                multC();
            }
            if(v == 3){
                multM();
            }
            if(v == 4){
                transpose();
            }
            if(v == 5){
                determinant();
            }
            if(v == 6){
                inverse();
            }
        }
    }

    private void inverse() {
        System.out.print("Enter matrix size: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the matrix:");
        ValidMatrix A = readMatrix(n, m);
        Matrix res = MatrixCalc.inverse(A);
        System.out.println(MatrixCalc.inverse(A).toString());
    }

    private void determinant() {
        System.out.print("Enter matrix size: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the matrix:");
        ValidMatrix A = readMatrix(n, m);
        System.out.println(MatrixCalc.det(A));
    }

    public int showMenu(){
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix to a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        return Integer.parseInt(in.next());
    }

    public void transpose(){
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.print("Your choice: ");
        int v = Integer.parseInt(in.next());
        System.out.print("Enter size of matrix: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the matrix:");
        ValidMatrix A = readMatrix(n, m);
        System.out.println("The result" + v +" is:");
        if(v == 1){
            System.out.println(MatrixCalc.mainT(A).toString());
        }
        if(v == 2){
            System.out.println(MatrixCalc.sideT(A).toString());
        }
        if(v == 3){
            System.out.println(MatrixCalc.vertT(A).toString());
        }
        if(v == 4){
            System.out.println(MatrixCalc.horzT(A).toString());
        }
    }

    public void multM(){
        System.out.print("Enter size of first matrix: ");
        int N_A = Integer.parseInt(in.next());
        int M_A = Integer.parseInt(in.next());
        System.out.println("Enter the first matrix:");
        ValidMatrix A = readMatrix(N_A, M_A);
        System.out.print("Enter size of second matrix: ");
        int N_B = Integer.parseInt(in.next());
        int M_B = Integer.parseInt(in.next());
        ValidMatrix B = readMatrix(N_B, M_B);
        System.out.println("Enter the second matrix:");
        System.out.println(MatrixCalc.mult(A, B).toString());
        System.out.println();
    }

    public void multC(){
        System.out.print("Enter size of matrix: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the matrix:");
        ValidMatrix A = readMatrix(n, m);
        System.out.println("Enter constant: ");
        double c = Double.parseDouble(in.next());
        System.out.println(MatrixCalc.mult(A, c).toString());
        System.out.println();
    }

    public void sum(){
        System.out.print("Enter size of first matrix: ");
        int n = Integer.parseInt(in.next());
        int m = Integer.parseInt(in.next());
        System.out.println("Enter the first matrix:");
        ValidMatrix A = readMatrix(n, m);
        System.out.print("Enter size of second matrix: ");
        n = Integer.parseInt(in.next());
        m = Integer.parseInt(in.next());
        System.out.println("Enter the second matrix:");
        ValidMatrix B = readMatrix(n, m);
        System.out.println(MatrixCalc.sum(A, B).toString());
        System.out.println();
    }

    public ValidMatrix readMatrix(int n, int m){
        double[][] mat = new double[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = Double.parseDouble((in.next()));
            }
        }
        return new ValidMatrix(mat);
    }
}
