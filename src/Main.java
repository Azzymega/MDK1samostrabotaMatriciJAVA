public class Main
{
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.SetNumber(0,0,1);
        matrix.SetNumber(0,1,2);
        matrix.SetNumber(1,0,3);
        matrix.SetNumber(1,1,4);
        Matrix secondMatrix = new Matrix(2,2);
        secondMatrix.SetNumber(0,0,5);
        secondMatrix.SetNumber(0,1,7);
        secondMatrix.SetNumber(1,0,9);
        secondMatrix.SetNumber(1,1,11);
        Matrix thirdMatrix = new Matrix(Matrix.Multiplication(matrix,secondMatrix));
        thirdMatrix.PrintMatrix();
    }
}
