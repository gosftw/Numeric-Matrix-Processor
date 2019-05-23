package processor;

public class ValidMatrix extends Matrix{

    double[][] matrix;
    int n, m;

    public ValidMatrix (int n, int m, String[] mat){
        this.n = n;
        this.m = m;
        this.matrix = new double[n][m];
        String[] line;
        for(int i = 0; i < mat.length; i++){
            line = mat[i].split(" ");
            for(int j = 0; j < line.length; j++){
                this.matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    public ValidMatrix(double[][] mat){
        this.n = mat.length;
        this.m = mat[0].length;
        this.matrix = new double[this.n][this.m];
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.m; j++){
                this.matrix[i][j] = mat[i][j];
            }
        }
    }

    public String toString(){
        String str = "";
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                str = str + this.matrix[i][j] + " ";
            }
            str +="\n";
        }
        return str;
    }

}
