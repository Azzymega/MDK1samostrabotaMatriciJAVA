public class Main
{
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.SetNumber(0,0,1);
        matrix.SetNumber(0,1,2);
        matrix.SetNumber(1,0,3);
        matrix.SetNumber(1,1,4);
        Matrix matrixs = new Matrix(2,2);
        matrixs.SetNumber(0,0,5);
        matrixs.SetNumber(0,1,7);
        matrixs.SetNumber(1,0,9);
        matrixs.SetNumber(1,1,11);
        matrix.Multiplication(matrixs);
        matrix.PrintMatrix();
    }
}
