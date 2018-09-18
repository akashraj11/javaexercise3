
public class MatrixAddition {

    public static int[][] matrixSum(int[][] MatrixA,int[][] MatrixB,int row1,int column1,int row2,int column2){
        int[][]MatrixC = new int[row1][column1];
        if(row1 != row2 || column1 != column2)
        {
            throw new ArithmeticException("Dimensions of Matrix are different !");

        }
        else
        {
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<column1;j++)
                {
                    MatrixC[i][j] = MatrixA[i][j] + MatrixB[i][j];
                }
            }

        }
        return MatrixC;
    }

}

