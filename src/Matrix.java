public class Matrix {
    private float[][] Numbers;
    private int Columns;
    private int Rows;

    public Matrix(int r, int c) {
        Columns = c;
        Rows = r;
        Numbers = new float[r][c];
    }
    public Matrix(float[][] num){
        Numbers = num;
        Columns = num[0].length;
        Rows = num.length;
    }

    public void SetNumber(int x, int y, int number) {
        Numbers[x][y] = number;
    }

    public float[][] GetNumbers() {
        return Numbers;
    }

    public void Addition(Matrix matrix) {
        for (int x = 0; x < Rows; x++) {
            for (int y = 0; y < Columns; y++) {
                Numbers[x][y] = Numbers[x][y] + matrix.GetNumbers()[x][y];
            }
        }
    }
    public static float[][] Addition(Matrix matrix, Matrix matrixS) {
        float[][] Result = new float[matrix.Rows][matrix.Columns];
        for (int x = 0; x < matrix.Rows; x++) {
            for (int y = 0; y < matrixS.Columns; y++) {
                Result[x][y] = matrixS.GetNumbers()[x][y] + matrix.GetNumbers()[x][y];
            }
        }
        return Result;
    }

    public void Substract(int number) {
        for (int x = 0; x < Rows; x++) {
            for (int y = 0; y < Columns; y++) {
                Numbers[x][y] = Numbers[x][y] * number;
            }
        }
    }

    public static float[][] Substract(int number, Matrix matrix) {
        float[][] Result = new float[matrix.Rows][matrix.Columns];
        for (int x = 0; x < matrix.Rows; x++) {
            for (int y = 0; y < matrix.Columns; y++) {
                Result[x][y] = matrix.GetNumbers()[x][y] * number;
            }
        }
        return Result;
    }

    public void PrintMatrix() {
        for (int x = 0; x < Rows; x++) {
            for (int y = 0; y < Columns; y++) {
                System.out.println(Numbers[x][y]);
            }
        }
    }

    public void Multiplication(Matrix matrix) {
        float[][] Result = new float[Rows][Columns];
        for (int x = 0; x < Numbers.length; x++) {
            for (int y = 0; y < matrix.GetNumbers()[0].length; y++) {
                for (int z = 0; z < matrix.GetNumbers().length; z++) {
                    Result[x][y] += Numbers[x][z] * matrix.GetNumbers()[z][y];
                }
            }
        }
        Numbers = Result;
    }

    public static float[][] Multiplication(Matrix matrix, Matrix matrixs) {
        float[][] Result = new float[matrix.Columns][matrix.Rows];
        for (int x = 0; x < matrix.GetNumbers().length; x++) {
            for (int y = 0; y < matrix.GetNumbers()[0].length; y++) {
                for (int z = 0; z < matrix.GetNumbers().length; z++) {
                    Result[x][y] += matrix.GetNumbers()[x][z] * matrixs.GetNumbers()[z][y];
                }
            }
        }
        return Result;
    }
}
