import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void remVowel() {
        //Arrange
        String expectedValue= "Grmny" ;
        RemoveVowels app=new RemoveVowels();
        //Act
        String actualValue=app.remVowel("Germany");
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void remVowel1() {
        //Arrange
        String expectedValue= "czchslvk" ;
        RemoveVowels app=new RemoveVowels();
        //Act
        String actualValue=app.remVowel("czechslovakia");
        //Assert
        assertNotNull(actualValue);
        assertEquals(expectedValue, actualValue);
    }
}