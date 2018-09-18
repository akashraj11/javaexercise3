import static org.junit.Assert.*;

public class SeriesOfNumbersTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void checkSeries() {
        //Arrange
        boolean expectedValue= true ;
        SeriesOfNumbers app=new SeriesOfNumbers();
        //Act
        boolean actualValue=app.CheckSeries("54,53,52,51,50,49,48");
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}