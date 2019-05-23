package processor;

public class MatrixCalc {

    public static Matrix mult(ValidMatrix mat, double c){
        double[][] matrix = new double[mat.n][mat.m];
        for(int i = 0; i < mat.n; i++){
            for(int j = 0; j < mat.m; j++){
                matrix[i][j] = mat.matrix[i][j] * c;
            }
        }
        return new ValidMatrix(matrix);
    }

    public static Matrix mult(ValidMatrix a, ValidMatrix b){
        if(a.m != b.n){
            return new ErrorMatrix();
        }
        double[][] matrix = new double[a.n][b.m];
        double sum;
        for(int i = 0; i < a.n; i ++){
            for(int j = 0; j < b.m; j++){
                sum = 0.0;
                for(int k = 0; k < a.m; k++){
                    sum = sum + a.matrix[i][k] * b.matrix[k][j];
                }
                matrix[i][j] = sum;
            }
        }
        return new ValidMatrix(matrix);
    }

    public static Matrix sum(ValidMatrix a, ValidMatrix b){
        if(a.m != b.m || a.n != b.n){
            return new ErrorMatrix();
        }
        double[][] matrix = new double[a.n][a.m];
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
            }
        }
        return new ValidMatrix(matrix);
    }

    public static Matrix mainT(ValidMatrix a) {
        double[][] mat = new double[a.m][a.n];
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                mat[j][i] = a.matrix[i][j];
            }
        }
        return new ValidMatrix(mat);
    }

    public static Matrix sideT(ValidMatrix a) {
        double[][] mat = new double[a.m][a.n];
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                mat[a.n - 1 - j][a.m - i - 1] = a.matrix[i][j];
            }
        }
        return new ValidMatrix(mat);
    }

    public static Matrix vertT(ValidMatrix a) {
        double[][] mat = new double[a.n][a.m];
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                mat[i][a.m - j - 1] = a.matrix[i][j];
            }
        }
        return new ValidMatrix(mat);
    }

    public static Matrix horzT(ValidMatrix a) {
        double[][] mat = new double[a.n][a.m];
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                mat[a.n -i - 1][j] = a.matrix[i][j];
            }
        }
        return new ValidMatrix(mat);
    }

    private static Matrix getMinor(ValidMatrix a, int not_i, int not_j){
        double[][] mat = new double[a.n - 1][a.m - 1];
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.n; i++) {
            x = 0;
            for (int j = 0; j < a.m; j++) {
                if (i == not_i || j == not_j) {
                    continue;
                }
                mat[y][x] = a.matrix[i][j];
                x += 1;
            }
            if(i != not_i) {
                y += 1;
            }
        }
        return new ValidMatrix(mat);
    }

    public static double det(ValidMatrix a) {
        if(a.n == 1){
            return a.matrix[0][0];
        }
        int sign = 1;
        double val = 0;
        for(int i = 0; i < a.n; i++){
            val = val + a.matrix[0][i] * sign * det((ValidMatrix) getMinor(a, 0, i));
            sign *= -1;
        }
        return val;
    }

    public static ValidMatrix getCov(ValidMatrix a){
        double[][] mat = new double[a.n][a.m];
        int base = -1;
        for(int i = 0; i < a.n; i++){
            for(int j = 0; j < a.m; j++){
                mat[i][j] = Math.pow(base, i + j + 2) * det((ValidMatrix) getMinor(a, i, j));
            }
        }
        return new ValidMatrix(mat);
    }

    public static Matrix inverse(ValidMatrix a) {
        double det = det(a);
        if(det == 0.0){
            return new ErrorMatrix();
        }
        return mult((ValidMatrix) mainT(getCov(a)), 1.0 / det);
    }
}
