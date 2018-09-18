import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matrixSum() {
        //Arrange
        int[][] expectedValue= {{10,10,10},{10,10,10},{10,10,10}} ;
        MatrixAddition app=new MatrixAddition();
        //Act
        int[][] MatrixA= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] MatrixB= {{9,8,7},{6,5,4},{3,2,1}};
        int[][] actualValue=app.matrixSum(MatrixA,MatrixB,3,3,3,3);
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}